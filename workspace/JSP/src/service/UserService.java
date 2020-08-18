package service;

import dao.UserDao;

import java.sql.SQLException;

public class UserService {
    UserDao ud = new UserDao();

    public boolean checkUserName(String userName) {
        boolean b = false;
        try {
            b = ud.checkUserName(userName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (b)
            return false;
        return true;
    }
}
