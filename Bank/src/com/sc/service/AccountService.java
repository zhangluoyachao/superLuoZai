package com.sc.service;

import com.sc.pojo.Account;

public interface AccountService {
    Account login(String cardNO, String password);
}
