package day3;

import org.junit.Test;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;


public class hw {

    @Test
    public void insertAll() {
        Connection con = JdbcUtil.getConnection();
        String sql = "insert into users values(?,?,?,?)";
        try {
            con.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            JdbcUtil.update(sql, "张三", "123123", "zhangsan@126.com",
                    Date.valueOf(LocalDate.of(1986, 10, 11)));
            JdbcUtil.update(sql, "李四", "123123", "lisi@126.com",
                    Date.valueOf(LocalDate.of(1988, 10, 23)));
            JdbcUtil.update(sql, "王五", "123123", "wangwu@126.com",
                    Date.valueOf(LocalDate.of(1990, 9, 11)));

            con.commit();
        } catch (Exception e) {
            System.out.println("执行错误，回滚数据");
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        JdbcUtil.close(JdbcUtil.ps, JdbcUtil.con);
    }


    @Test
    public void a() {
        String sql = "update  users set pwd = ? where name = ?";
        JdbcUtil.update(sql, "888888", "张三");
        JdbcUtil.update(sql, "999999", "李四");
        JdbcUtil.update(sql, "777777", "王五");
    }

    @Test
    public void b() {
        String sql = "update users set birthday = sysdate";
        JdbcUtil.update(sql);
    }

    @Test
    public void c() {
        String sql = "delete from  users where name = ?";
        JdbcUtil.update(sql, "张三");
    }
}
