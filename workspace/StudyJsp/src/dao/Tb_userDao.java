package dao;

import util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Dao层：数据访问层，该层实现类跟数据库之间的交互
 * Tb_userDao 只负责对Tb_user表的增删改查
 * */
public class Tb_userDao {
    public boolean query(String username, String password) {
        String sql = "select * from tb_user where username = ? and password = ?";
        ResultSet resultSet = JdbcUtil.select(sql, username, password);
        boolean b = false;
        try {
            if (resultSet.next())
                b = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.close(resultSet, JdbcUtil.ps, JdbcUtil.con);
        return b;
    }


}
