package com.sc.service;

import com.sc.pojo.Users;

public interface UsersService {
    Users login(String un, String pwd);

    boolean add(Users u);

    boolean isExist(String un);
}
