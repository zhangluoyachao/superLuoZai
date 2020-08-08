package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    static String useName = "zhang";
    static String passWord = "admin";

    //测试增删改
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        insert();
    }

    public static void insert() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection conn = DriverManager.getConnection(url, useName, passWord);

        Statement stmt = conn.createStatement();
        String name = "天气";
        String sex = "男";
        int age = 18;
        String sql = "insert into  TBLSTUDENT values(ID_SEQ.nextval,'"
                + name + "'," + age + ",'" + sex + "')";
        stmt.executeUpdate(sql);


        stmt.close();
        conn.close();
    }

    public static void update() {

    }

    public static void delete(int id) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection conn = DriverManager.getConnection(url, useName, passWord);

        Statement stmt = conn.createStatement();

        String sql = "delete from STUDENT where SNO=" + id;
        int i = stmt.executeUpdate(sql);
        System.out.println("有" + i + "条删除成功");

        stmt.close();
        conn.close();
    }
}
