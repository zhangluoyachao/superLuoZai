package dao.hw;


import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

public class TestUser {
    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    static String username = "zhang";
    static String password = "admin";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        addUser();

    }

    public static void addUser() throws SQLException, ClassNotFoundException {
        Random r = new Random();
        Set<List> userSet = new HashSet();

        while (userSet.size() < 100) {
            List user = new ArrayList();
            //随机生成昵称
            StringBuilder na = new StringBuilder();
            int n;
            for (int i = 1; i <= 3; i++) {
                n = 97 + r.nextInt(26);
                na.append((char) n);
            }
            String name = na.toString();
            user.add(name);

            //随机生成2020年的某天
            LocalDate ld = LocalDate.of(2020, 1, 1);
            ld = ld.plusDays(r.nextInt(365));
            user.add(ld);

            //随机生成积分0-200
            int integral = r.nextInt(201);
            user.add(integral);

            //性别
            String sex;
            int s = r.nextInt(2);
            if (s == 0)
                sex = "男";
            else
                sex = "女";
            user.add(sex);

            userSet.add(user);
        }

        for (List u : userSet) {
            insert((String) u.get(0), (LocalDate) u.get(1), (int) u.get(2), (String) u.get(3));
        }
    }

    public static void insert(String name, LocalDate dateTime, int integral, String sex) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        String sql = "insert into AUSER values(ID_SEQ.nextval,'" + name + "',to_date('" + dateTime
                + "','yyyy-mm-dd')," + integral + ",'" + sex + "')";
        st.executeUpdate(sql);

        st.close();
        con.close();
    }

    public static void delete(String name) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        String sql = "delete  AUSER where username = '" + name + "'";
        st.executeUpdate(sql);

        st.close();
        con.close();
    }

    public static void update(String name, LocalDate dateTime, int integral, String sex) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        String sql = "update AUSER  set REGISTRATIONDATE = to_date('" + dateTime + "','yyyy-mm-dd'),INTEGRAL = " + integral +
                ",sex='" + sex + "'where username = '" + name + "'";
        st.executeUpdate(sql);

        st.close();
        con.close();

    }

    public static void selectForName(String name) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        String sql = "select * from AUSER where USERNAME = '" + name + "'";
        ResultSet rs = st.executeQuery(sql);
        showSelect(rs);//遍历输出rs
        rs.close();
        st.close();
        con.close();
    }

    public static void selectForID(int useID) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        String sql = "select * from AUSER where USERID = " + useID;
        ResultSet rs = st.executeQuery(sql);
        showSelect(rs);//遍历输出rs
        rs.close();
        st.close();
        con.close();
    }

    public static void selectForMonths(int Months) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        String sql = "select * from AUSER where EXTRACT (month from REGISTRATIONDATE) = " + Months;
        ResultSet rs = st.executeQuery(sql);
        showSelect(rs);//遍历输出rs

        rs.close();
        st.close();
        con.close();
    }

    public static void selectForIntegralThen(int integral) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        String sql = "select * from AUSER where INTEGRAL > " + integral;
        ResultSet rs = st.executeQuery(sql);
        showSelect(rs);//遍历输出rs

        rs.close();
        st.close();
        con.close();
    }

    public static void showSelect(ResultSet rs) {
        try {
            while (rs.next()) {
                int id = rs.getInt("userid");
                String uname = rs.getString("Username");
                Date date = rs.getDate("registrationdate");
                int integral = rs.getInt("integral");
                String sex = rs.getString("sex");
                System.out.println(id + " " + uname + " " + date + " " + integral + " " + sex);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
