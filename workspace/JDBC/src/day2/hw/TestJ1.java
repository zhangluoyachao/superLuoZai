package day2.hw;

import org.junit.Test;
import util.JdbcUtil;
import util.JdbcUtil2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJ1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String sql = "select avg(o2.TOTAL-o1.TOTAL) 平均增长量 from " +
                "OUTPUT o1 left join OUTPUT o2 on o1.YAER -o2.YAER = -1";
        ResultSet rs = JdbcUtil.select(sql);
        try {
            System.out.println(rs.getDouble("平均增长量"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insert(Output op, PreparedStatement ps) {
        try {
            ps.setInt(1, op.getYear());
            ps.setInt(2, op.getQ1());
            ps.setInt(3, op.getQ2());
            ps.setInt(4, op.getQ3());
            ps.setInt(5, op.getQ4());
            ps.setInt(6, op.getTotal());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void create() {
        Connection con = JdbcUtil.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "create table output(" +
                    "num number(10) primary key," +
                    "yaer number(4) unique not null," +
                    "q1 number(10) not null," +
                    "q2 number(10) not null," +
                    "q3 number(10) not null," +
                    "q4 number(10) not null," +
                    "total number(10) not null" +
                    ")";
            ps = con.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(ps, con);
        }
    }

    public static void allInTable() {
        Connection con = JdbcUtil.getConnection();
        PreparedStatement ps = null;
        try {
            String sql = "insert into OUTPUT values (OUTPUT_SEQ.nextval,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            int year = 1994;
            insert(new Output(++year, 6, 7, 9, 8), ps);
            insert(new Output(++year, 9, 12, 13, 10), ps);
            insert(new Output(++year, 13, 14, 17, 13), ps);
            insert(new Output(++year, 15, 18, 19, 14), ps);
            insert(new Output(++year, 18, 20, 24, 19), ps);
            insert(new Output(++year, 22, 24, 29, 23), ps);
            insert(new Output(++year, 25, 32, 37, 26), ps);
            insert(new Output(++year, 30, 38, 50, 35), ps);
            insert(new Output(++year, 29, 39, 50, 35), ps);
            insert(new Output(++year, 30, 38, 42, 30), ps);
            insert(new Output(++year, 29, 39, 50, 35), ps);
            insert(new Output(++year, 30, 39, 51, 37), ps);
            insert(new Output(++year, 29, 42, 55, 38), ps);
            insert(new Output(++year, 31, 43, 54, 41), ps);
            insert(new Output(++year, 33, 45, 58, 42), ps);
            con.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void test() {
        Connection con = JdbcUtil2.getConnection();
        try {
            con.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            String sql = "update auser set integral = integral - 100 where userid = 14";
            JdbcUtil2.update(sql);

            int i = 10 / 0;
            sql = "update auser set integral = integral + 50 where userid = 15";
            JdbcUtil2.update(sql);

            sql = "update auser set integral = integral + 50 where userid = 16";
            JdbcUtil2.update(sql);

            con.commit();
        } catch (Exception e) {
            System.out.println("出错，回滚");
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            JdbcUtil2.close(JdbcUtil2.ps, JdbcUtil2.con);
        }
    }
}
