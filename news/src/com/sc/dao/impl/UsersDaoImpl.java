package com.sc.dao.impl;

import com.sc.dao.UsersDao;
import com.sc.pojo.Users;
import com.sc.util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDaoImpl implements UsersDao {


    @Override
    public Users login(String uname, String pwd) throws SQLException {
        String sql = "select * from users where username = ? and password = ?";
        ResultSet rs = JdbcUtil.select(sql, uname, pwd);
        Users u = null;

        if (rs.next()) {
            Integer id = rs.getInt("id");
            u = new Users(id, uname, pwd);
        }

        return u;
    }
}
