package dao;

import pojo.User;
import util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public List<User> query(Integer pageIndex) throws SQLException {
        List<User> result = new ArrayList<>();
        Integer pageSize = 5;
        String sql = "select * from(select u.*,rownum r from auser u) where r  between ? and ?";
        ResultSet rs = JdbcUtil.select(sql, (pageIndex - 1) * pageSize + 1, pageIndex * pageSize);
        while (rs.next()) {

            String username = rs.getString("username");
            int userid = rs.getInt("userid");
            User u = new User(userid, username);
            result.add(u);
        }
        return result;
    }
}
