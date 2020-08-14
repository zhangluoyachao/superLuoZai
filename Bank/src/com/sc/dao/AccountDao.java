package com.sc.dao;

import com.sc.pojo.Account;

import java.sql.SQLException;

public interface AccountDao {
    Account login(String cardNO,String password) throws SQLException;
}
