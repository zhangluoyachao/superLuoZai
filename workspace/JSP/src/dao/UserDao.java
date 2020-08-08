package dao;

import pojo.User;

public class UserDao {
    public User login(String un, String pw) {
        String sql = "select * from users where name = ? and pw=?";
        User u = null;
        return u;
    }
}
