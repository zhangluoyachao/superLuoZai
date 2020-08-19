package com.sc.service.impl;

import com.sc.dao.UpvoteUserDao;
import com.sc.dao.impl.UpvoteUserDaoImpl;
import com.sc.service.UpvoteUserService;

import java.sql.SQLException;

public class UpvoteUserServiceImpl implements UpvoteUserService {
    UpvoteUserDao uud = new UpvoteUserDaoImpl();

    @Override
    public boolean addUpvote(String username, String vName) {
        boolean b = false;
        try {
            if (!uud.exist(username, vName)) {
                uud.add(username, vName);
                b = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }
}
