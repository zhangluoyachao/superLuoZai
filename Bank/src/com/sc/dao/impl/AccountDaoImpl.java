package com.sc.dao.impl;

import com.sc.dao.AccountDao;
import com.sc.pojo.Account;
import com.sc.util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {


    @Override
    public boolean noExist(String cardNo) throws SQLException {
        String sql = "select * from account where cardNo=?";
        ResultSet rs = JdbcUtil.select(sql, cardNo);
        if (rs.next())
            return true;
        return false;
    }

    @Override
    public boolean pwdIsCorrect(String cardNo, String password) throws SQLException {
        String sql = "select * from account where cardNo=? and password=?";
        ResultSet rs = JdbcUtil.select(sql, cardNo, password);
        if (rs.next())
            return true;
        return false;
    }

    @Override
    public int noStatus(String cardNo) throws SQLException {
        String sql = "select status from account where cardNo=?";
        ResultSet rs = JdbcUtil.select(sql, cardNo);
        int status = -1;
        if (rs.next()) {
            status = rs.getInt("status");
        }
        return status;
    }

    @Override
    public int insert(Account account) {
        String sql = "insert into account values(?,?,0.00,1,?)";
        return JdbcUtil.update(sql, account.getCardNo(), account.getPassword(), account.getAvatar());
    }

    @Override
    public Account getAccount(String cardNo, String password) throws SQLException {
        String sql = "select * from account where cardno=? and password=?";
        ResultSet rs = JdbcUtil.select(sql, cardNo, password);
        Account result = null;
        if (rs.next()) {
            double balance = rs.getDouble("balance");
            int status = rs.getInt("status");
            String avatar = rs.getString("avatar");
            result = new Account(cardNo, password, balance, status, avatar);
        }
        return result;
    }

    @Override
    public Account getAccount(String cardNo) throws SQLException {
        String sql = "select * from account where cardno=?";
        ResultSet rs = JdbcUtil.select(sql, cardNo);
        Account result = null;
        if (rs.next()) {
            double balance = rs.getDouble("balance");
            int status = rs.getInt("status");
            String avatar = rs.getString("avatar");
            String password = rs.getString("password");
            result = new Account(cardNo, password, balance, status, avatar);
        }
        return result;
    }

    @Override
    public int expense(String cardNo, Double money) {
        String sql = "update account set balance=balance-? where cardNo=?";
        return JdbcUtil.update(sql, money, cardNo);
    }

    @Override
    public int income(String cardNo, Double money) {
        String sql = "update account set balance=balance+? where cardNo=?";
        return JdbcUtil.update(sql, money, cardNo);

    }

    @Override
    public double getBalance(String cardNo) throws SQLException {
        String sql = "select balance from account where cardNO=?";
        ResultSet rs = JdbcUtil.select(sql, cardNo);
        rs.next();
        return rs.getDouble("balance");
    }
}
