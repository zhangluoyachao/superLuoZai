package dao;

import pojo.User;
import util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    public User login(String un, String pw) {
        String sql = "select * from users where name = ? and pw=?";
        User u = null;
        return u;
    }

    public boolean checkUserName(String userName) throws SQLException {
        String sql = "select * from users where username = ?";
        ResultSet rs = JdbcUtil.select(sql, userName);
        if (rs.next())
            return true;
        return false;
    }
}
