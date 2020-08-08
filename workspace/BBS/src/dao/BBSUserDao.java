package dao;

import pojo.BBSUser;
import util.JdbcUtil;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BBSUserDao {
    public static List<BBSUser> queryAll() {
        String sql = "select * from BBSUSER";
        ResultSet rs = JdbcUtil.select(sql);
        List<BBSUser> list = new ArrayList<>();
        try {
            while (rs.next()) {
                Integer userid = rs.getInt("userid");
                String nickname = rs.getString("nickname");
                String loginname = rs.getString("loginname");
                String longinpwd = rs.getString("longinpwd");
                String headimg = rs.getString("headimg");
                Date creatrtime = rs.getDate("createtime");

                BBSUser u = new BBSUser(userid, nickname, loginname, longinpwd, headimg, creatrtime);
                list.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        return list;
    }

    public static BBSUser query(String name) {
        String sql = "select * from BBSUSER where loginname = ?";
        ResultSet rs = JdbcUtil.select(sql, name);
        BBSUser u = null;
        try {
            while (rs.next()) {
                Integer userid = rs.getInt("userid");
                String nickname = rs.getString("nickname");
                String loginname = rs.getString("loginname");
                String longinpwd = rs.getString("loginpwd");
                String headimg = rs.getString("headimg");
                Date creatrtime = rs.getDate("createtime");
                u = new BBSUser(userid, nickname, loginname, longinpwd, headimg, creatrtime);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close();
        return u;
    }

    public static void main(String[] args) {
        query("zhang");
    }
    public static boolean userCheck(String name, String pwd) {
        String sql = "select * from BBSUSER where loginname = ?and loginpwd = ?";
        ResultSet rs = JdbcUtil.select(sql, name, pwd);
        try {
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }


    public static boolean nickNameCheck(String name) {
        String sql = "select * from BBSUSER where loginname = ?";
        ResultSet rs = JdbcUtil.select(sql, name);
        try {
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static int insert(BBSUser user) {
        String sql = "insert into BBSUSER values(BBSUSER_SEQ.nextval,?,?,?,?,sysdate)";
        int i = JdbcUtil.update(sql, user.getNickName(), user.getLoginName(), user.getLoginPWD(), user.getHeadImg());
        JdbcUtil.close();
        return i;
    }
}
