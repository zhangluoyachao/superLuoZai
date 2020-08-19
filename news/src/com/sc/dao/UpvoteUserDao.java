package com.sc.dao;

import java.sql.SQLException;

public interface UpvoteUserDao {
    boolean exist(String username, String vName) throws SQLException;

    int add(String username, String vname);
}
