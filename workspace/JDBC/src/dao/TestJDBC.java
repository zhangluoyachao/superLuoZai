package dao;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        JDBC工作原理 重点面试题
        步骤
        0、导入驱动包（XX.jar）
        1、加载驱动类 DriverManager
        2、创建连接  Connection对象
        3、通过Connection对象 创建Statement对象
        4、通过Statement对象 执行sql语句
        5、如果是查询 会有结果集返回，需要处理结果集
        6、释放资源，关闭连接

        */
        //1、加载驱动类
        //通过反射 获取驱动类的Class对象
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //2、创建连接  Connection对象
        /*
         * getConnection参数(url,username,password)
         * url:泛指请求 用于访问网站、系统资源、某些数据库都需要发送请求
         * jdbc:oracle:thin:@localhost:1521:xe
         * https://www.baidu.com 就是一个请求
         * url 统一资源定位符
         * 协议：ip地址或者主机名：端口号/项目资源/页面...
         * username:登录数据库账号
         * password:密码
         * */
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "zhang";
        String password = "admin";
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("创建成功" + conn);

        //3、通过Connection对象 创建Statement对象
        Statement stmt = conn.createStatement();
        //4、通过Statement执行sql语句

        /*
           方法：
            execute();
            适用于执行增删改查 四种sql语句 返回值是boolean
            如果是查询语句 会返回true 增删改返回false
            无法获取数据，并不常用
            executeUpdate();
            适用于增删改三种操作，返回值是int类型
            int类型代表 修改了的行数，如果返回0代表修改失败
            executeQuery();
            适用于查询   返回值是ResultSet 结果集

           有了结果集需要去处理
         */

        String sql = "select * from student";
        //不能加分号
        ResultSet rs = stmt.executeQuery(sql);
        //如果是查询操作，查询结果通过ResultSet接收

        //5、处理结果集
        //rs.next() 判断是否有下一行数据， 如果没有返回false
        while (rs.next()) {
            //取数据 rs.get类型(参数)
            //参数：
            //1、数字  代表列号
            //2、字符串 代表数据表的列名（常用）
            int id = rs.getInt("sno");
            String name = rs.getString("sname");
            String sex = rs.getString("SSEX");
            //获取年月日-时分秒
            Date time = rs.getDate("sbirthday");
            //获取时间戳 包括毫秒
            Timestamp timestamp = rs.getTimestamp("sbirthday");
            String aClass = rs.getString("Class");
            System.out.println(id + name + sex + timestamp + aClass);

        }
        //6、关闭资源 conn stmt rs
        //先建后关
        rs.close();
        stmt.close();
        conn.close();
    }
}
