package util;

import org.junit.Test;

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
public class JdbcUtil {
    private static String driver;
    private static String url;
    private static String userName;
    private static String passWord;
    public static Connection con;
    public static PreparedStatement ps;
    public static ResultSet rs;

    static {
        //读取配置文件
        InputStream is = JdbcUtil.class.getClassLoader().
                getResourceAsStream("jdbc.properties");
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

    //创建连接，将来可能一个连接对象，会很多对象使用
    //将连接加入线程 （当前线程ThreadLocal）
    //当前线程：一个功能底层实现就是一个线程（dao-service-controller-jsp）
    //

    static ThreadLocal<Connection> tl = new ThreadLocal();

    public static Connection getConnection() {
        //判断：第一次创建线程
        //之后从线程中获取连接
        if (tl.get() == null) {
            try {
                con = DriverManager.getConnection(url, userName, passWord);
                tl.set(con);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return con;


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
                ps.setObject(i, o[i - 1]);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

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
        //清空线程中的连接
        tl.set(null);
    }

    @Test
    public void t() throws SQLException {

    }
}
