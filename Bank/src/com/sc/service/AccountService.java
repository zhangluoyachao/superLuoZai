package com.sc.service;

import com.sc.pojo.Account;

import java.util.Map;

public interface AccountService {
    Map<Account, String> login(String cardNo, String password);

    boolean insert(String cardNo, String password, String avatar);

    String transaction(String cardNo1, String cardNo2, String mon, String remark);
}
