package com.sc.dao.impl;

import com.sc.pojo.Users;
import com.sc.util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDaoImpl {
    public static boolean checkUser(Users u) {
        String sql = "select * from users where username = ? and password = ?";
        ResultSet rs = JdbcUtil.select(sql, u.getUsername(), u.getPassword());
        try {
            while (rs.next())
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close();
        }
        return false;
    }
}
