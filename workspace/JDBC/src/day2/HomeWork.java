package day2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class HomeWork {
    public static void main(String[] args) {
        List<aUser> list = new ArrayList<>();

    }


    static String driver = "oracle.jdbc.driver.OracleDriver";
    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    static String useName = "zhang";
    static String password = "admin";

    public static void insert(aUser u) {
        Connection conn = null;
        Statement st = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, useName, password);
            st = conn.createStatement();

            String sql = "insert into AUSER values (ID_SEQ.nextval,'" + u.getName() + "',"
                    + u.getTime() + "," + u.getCards() + ",'" + u.getSex() + "')";
            st.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
