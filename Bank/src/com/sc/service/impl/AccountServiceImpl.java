package com.sc.service.impl;

import com.sc.dao.AccountDao;
import com.sc.dao.RecordDao;
import com.sc.dao.impl.AccountDaoImpl;
import com.sc.dao.impl.RecordDaoImpl;
import com.sc.pojo.Account;
import com.sc.pojo.Record;
import com.sc.service.AccountService;
import com.sc.util.JdbcUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AccountServiceImpl implements AccountService {

    private AccountDao ad = new AccountDaoImpl();
    private RecordDao rd = new RecordDaoImpl();
    private static final String TRANOUT = "转出";
    private static final String TRANIN = "转入";

    //登录
    //错误 返回空ACC和原因
    //成功 返回ACC和true字符串
    @Override
    public Map<Account, String> login(String cardNo, String password) {
        //对账号、密码、状态进行判断
        String result;
        Map<Account, String> resultMap = new HashMap<>();
        try {
            if (!ad.noExist(cardNo)) {
                result = "username";
                resultMap.put(null, result);
            } else if (!ad.pwdIsCorrect(cardNo, password)) {
                result = "password";
                resultMap.put(null, result);
            } else if (ad.noStatus(cardNo) != 1) {
                result = "status";
                resultMap.put(null, result);
            } else {
                resultMap.put(ad.getAccount(cardNo, password), "true");
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        return resultMap;
    }

    @Override
    public boolean insert(String cardNo, String password, String avatar) {
        Account account = new Account(cardNo, password, avatar);
        int i = ad.insert(account);
        if (i > 0)
            return true;
        return false;
    }

    @Override
    public String transaction(String outCardNO, String inCardNO, String mon, String remark) {
        Double money = Double.parseDouble(mon);
        try {
            //判断账号是否存在
            if (!ad.noExist(inCardNO)) {
                return "转账失败！目标账户不存在！";
            } else if (ad.noStatus(inCardNO) == 0) {
                return "转账失败！目标账户已冻结！";
            }

            //判断支出账号余额
            if (ad.getBalance(outCardNO) < money) {
                return "转出失败！传出账户余额不足！";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //转账事务
        Connection conn = JdbcUtil.getConnection();
        try {
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            //account表信息
            ad.expense(outCardNO, money);
            ad.income(inCardNO, money);

            //record表信息
            //创建record对象
            Account outAccount = ad.getAccount(outCardNO);
            Account inAccount = ad.getAccount(inCardNO);

            Record out = new Record(money, null, TRANOUT, remark, outAccount);
            Record in = new Record(null, money, TRANIN, remark, inAccount);
            //写入
            rd.insert(out);
            rd.insert(in);
            conn.commit();
            return "true";
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

        return "未知原因！转账失败！";
    }
}
