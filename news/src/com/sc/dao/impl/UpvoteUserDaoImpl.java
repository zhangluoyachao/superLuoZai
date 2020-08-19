package com.sc.dao.impl;

import com.sc.dao.UpvoteUserDao;
import com.sc.util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UpvoteUserDaoImpl implements UpvoteUserDao {
    @Override
    public boolean exist(String username, String vName) throws SQLException {
        String sql = "select 1 from upvoteuser where username=? and videoname=?";
        ResultSet rs = JdbcUtil.select(sql, username, vName);
        if (rs.next())
            return true;
        return false;

    }

    @Override
    public int add(String username, String vname) {
        String sql = "insert upvoteuser values(id_seq.nextval,?,?)";
        return JdbcUtil.update(sql, username, vname);
    }
}
