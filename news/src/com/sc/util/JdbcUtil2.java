package com.sc.util;


import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 * 将JDBC中相同的繁琐的部分提取出来
 * 创建连接：
 * 1、加载驱动类
 * 2、创建连接
 * <p>
 * 3、创建PreparedStatement对象
 * <p>
 * 4、执行sql语句
 * 增删改：
 * a、executeUpdate
 * <p>
 * 查询：
 * b、executeQuery +  5、处理查询结果集
 * <p>
 * 关闭资源：
 * 6、关闭资源
 */
public class JdbcUtil2 {
    private static String driver;
    private static String url;
    private static String userName;
    private static String passWord;
    public static Connection con;
    public static PreparedStatement ps;
    public static ResultSet rs;

    static {
        //读取配置文件
        InputStream is = JdbcUtil2.class.getClassLoader().
                getResourceAsStream("com/sc/config/jdbc.properties");
        Properties p = new Properties(); //读取对应类型文件的类对象
        try {
            p.load(is); //将读取的数据通过输入流 存入p对象中
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = p.getProperty("driver");//通过key值取String类型的value
        url = p.getProperty("url");//通过key值取String类型的value
        userName = p.getProperty("username");//通过key值取String类型的value
        passWord = p.getProperty("password");//通过key值取String类型的value
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //驱动类只需要加载一次
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection(url, userName, passWord);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return con;
        }
    }

    public static PreparedStatement getPreparedStatement(String sql) {
        con = getConnection();
        try {
            ps = con.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return ps;
        }
    }

    public static ResultSet select(String sql, Object... o) {
        con = getConnection();
        ps = getPreparedStatement(sql);
        try {
            for (int i = 1; i <= o.length; i++) {
                ps.setObject(i, o[i - 1]);
            }
            rs = ps.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    public static int update(String sql, Object... o) {
        con = getConnection();
        int result = 0;
        try {
            ps = con.prepareStatement(sql);
            for (int i = 1; i <= o.length; i++)
                ps.setObject(1, o[i - 1]);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close(ps, con);
        return result;

    }

    public static void close(AutoCloseable... ac) {
        for (AutoCloseable a : ac) {
            try {
                if (a != null) a.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
