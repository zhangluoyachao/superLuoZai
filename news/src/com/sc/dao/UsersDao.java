package com.sc.dao;

import com.sc.pojo.Users;

import java.sql.SQLException;

public interface UsersDao {
    Users login(String uname, String pwd) throws SQLException;
}
