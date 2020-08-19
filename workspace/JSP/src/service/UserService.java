package service;

import dao.UserDao;
import pojo.User;

import java.sql.SQLException;
import java.util.List;

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

    public List<User> query(Integer pageIndex) {
        List<User> result = null;
        try {
            result = ud.query(pageIndex);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
