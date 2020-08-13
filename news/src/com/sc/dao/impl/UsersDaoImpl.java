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
            String profile = rs.getString("profile");
            u = new Users(id, uname, pwd, profile);
        }

        return u;
    }

    @Override
    public boolean insert(Users u) {
        String sql = "insert into users values(id_seq.nextval,?,?,?)";
        int i = JdbcUtil.update(sql, u.getUsername(), u.getPassword(), u.getProfile());
        if (i > 0)
            return true;
        return false;
    }

    @Override
    public boolean isExist(String un) throws SQLException {
        String sql = "select 1 from users where username=?";
        ResultSet rs = JdbcUtil.select(sql, un);
        if (rs.next())
            return true;
        return false;
    }
}
