package com.sc.dao;

import com.sc.pojo.Account;

import java.sql.SQLException;

public interface AccountDao {
    boolean noExist(String cardNo) throws SQLException;

    boolean pwdIsCorrect(String cardNo, String password) throws SQLException;

    int noStatus(String cardNo) throws SQLException;

    int insert(Account account);

    Account getAccount(String cardNo, String password) throws SQLException;

    Account getAccount(String cardNo) throws SQLException;

    int expense(String cardNo, Double money);

    int income(String cardNo, Double money);

    double getBalance(String cardNo) throws SQLException;

    int modifyPwd(Account account, String newPwd);
}
