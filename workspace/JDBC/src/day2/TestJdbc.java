package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestJdbc {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "zhang";
        String password = "admin";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "insert into AUSER values (ID_SEQ.nextval,?,?,?,?)";
        //预编译，先传入sql语句
        PreparedStatement ps = conn.prepareStatement(sql);
        //如果有参数，必须要赋值，要不然sql语句在执行时会报错
        //ps.setXXX(int,值)
        ps.setString(1, "浩酱");
        java.sql.Date date = java.sql.Date.valueOf(LocalDate.of(2001, 10, 20));
        ps.setDate(2, date);
        ps.setInt(3, 100);
        ps.setString(4, "女");

        //再调用语句

        int i = ps.executeUpdate();
        System.out.println("增加" + i + "条语句");
        ps.close();
        conn.close();
    }
}
