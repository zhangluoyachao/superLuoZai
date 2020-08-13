package com.sc.service.impl;

import com.sc.dao.UsersDao;
import com.sc.dao.impl.UsersDaoImpl;
import com.sc.pojo.Users;
import com.sc.service.UsersService;
import com.sc.util.JdbcUtil;

import java.sql.SQLException;

public class UserServiceImpl implements UsersService {
    UsersDao ud = new UsersDaoImpl();

    @Override
    public Users login(String un, String pwd) {
        Users u = null;
        try {
            u = ud.login(un, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        return u;
    }

    @Override
    public boolean add(Users u) {
        if (ud.insert(u))
            return true;
        return false;
    }

    @Override
    public boolean isExist(String un) {
        boolean b = false;
        try {
            b = ud.isExist(un);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        return b;
    }
}
