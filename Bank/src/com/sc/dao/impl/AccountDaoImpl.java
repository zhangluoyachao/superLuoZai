package com.sc.dao.impl;

import com.sc.dao.AccountDao;
import com.sc.pojo.Account;
import com.sc.util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {
    @Override
    public Account login(String cardNO, String password) throws SQLException {
        String sql = "select * from account where cardno =? and password=?";
        ResultSet rs = JdbcUtil.select(sql, cardNO, password);
        Account a = null;
        if (rs.next()) {
            double banlance = rs.getDouble("banlance");
            int status = rs.getInt("status");
            String avatar = rs.getString("avatar");

            a = new Account(cardNO, password, banlance, status, avatar);
        }
        return a;
    }
}
