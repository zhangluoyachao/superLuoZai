package com.sc.service.impl;

import com.sc.dao.AccountDao;
import com.sc.dao.impl.AccountDaoImpl;
import com.sc.pojo.Account;
import com.sc.service.AccountService;

import java.sql.SQLException;

public class AccountServiceImpl implements AccountService {

    private AccountDao ad = new AccountDaoImpl();

    @Override
    public Account login(String cardNO, String password) {
        Account result = null;
        try {
            result = ad.login(cardNO, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
