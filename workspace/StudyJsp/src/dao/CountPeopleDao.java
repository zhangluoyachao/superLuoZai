package dao;

import util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountPeopleDao {
    public static int getCount() {
        String sql = "select count from CountPeople where pagename = ?";
        ResultSet rs = null;
        int result = 0;
        try {
            rs = JdbcUtil.select(sql, "Test2");
            while (rs.next())
                result = rs.getInt("count");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close(rs, JdbcUtil.ps, JdbcUtil.con);
        return result;

    }

    public static void addCount() {
        String sql = "update CountPeople set count = count+1 where pagename = ?";
        JdbcUtil.update(sql, "Test2");
        JdbcUtil.close(JdbcUtil.ps, JdbcUtil.con);
    }

    public static void main(String[] args) {
        addCount();
        System.out.println(getCount());
    }
}
