# JDBC

## 一、什么是JDBC

### **1、什么是JDBC**

jdbc: java datebase connection

java数据库连接

是JavaEE的一个组件，用于通过java的方式 和数据库之间进行交互

注：提供了多种数据之间的访问，具体想连接哪个数据库，需要根据数据库厂商提供对应连接数据库的驱动包（jar包）

### **2、JDBC涉及到的接口和类**

1. **DriverManager 驱动管理类**，根据不同数据库对应的驱动包可以获取连接
2. **Connection 	连接对象**，负责连接数据库，和数据库之间进行交互
3. **Statement**	JDBC技术中，用于执行sql语句，是由Connection对象创建产生
4. **ResultSet**	**结果集**，用于保存Statement中查询语句的结果

### **3、持久层框架**

JDBC是一种持久层框架

数据分为：瞬时态和持久态

hibernate mybatis 持久层框架 底层实现都是JDBC

## **二、JDBC工作原理**

**重点面试题**

步骤：

0. 导入驱动包（XX.jar）

1. 加载驱动类 DriverManager
2. 创建连接  Connection对象
3. 通过Connection对象 创建Statement对象
4. 通过Statement对象 执行sql语句
5. 如果是查询 会有结果集返回，需要处理结果集
6. 释放资源，关闭连接

### **1、导入驱动包，将数据库相应jar包导入lib再添加到项目中**

### **2、加载驱动类 DrvierManager**

```java
//1、加载驱动类 
//通过反射 获取驱动类的Class对象
Class.forName("oracle.jdbc.driver.OracleDriver");
```

**Q:为什么要加载驱动类**

**A:向DriverManager注册自己**

https://blog.csdn.net/qq_29924227/article/details/81042958?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.channel_param&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.channel_param

### **3、通过驱动类DrvirerManager创建Connection对象**

```java
String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
String username = "zhang"; String password = "admin"; 
Connection conn = DriverManager.getConnection(url, username, password);
```

注：

- 获取Connection对象使用都是DriverManager类的getConnection()方法

- getConnection中的参数

- - url:泛指请求 用于访问网站、系统资源、某些数据库都需要发送请求

    url：jdbc:oracle:thin:@localhost:1521:xe

    例如：https://www.baidu.com 就是一个请求

    url 统一资源定位符

    协议：ip地址或者主机名：端口号/项目资源/页面...

  - username:登录数据库账号

  - password:密码

**4、通过Connection对象创建Statement对象，再通过Statement对象的方法执行sql语句**

Statement方法

- execute();

适用于执行增删改查 四种sql语句 返回值是boolean

如果是查询语句 会返回true 增删改返回false

无法获取数据，并不常用

- executeUpdate();

适用于增删改三种操作，返回值是int类型

int类型代表 修改了的行数，如果返回0代表修改失败

- executeQuery();

适用于查询   返回值是ResultSet 结果集

String sql = "select * from student"; //不能加分号 ResultSet rs = stmt.executeQuery(sql); //如果是查询操作，查询结果通过ResultSet接收

**5、如果是查询语句需要处理结果集**

通过ResultSet中的方法 get类型(参数)获取数据

- 取数据 get类型(参数)

- - 类型，不同数据类型用不同方法获取

注number类型用 getInt

- - 参数：

  - - 数字  代表列号
    - 字符串 代表数据表的列名（常用）

遍历ResultSet集合:

while (rs.next()) {    int id = rs.getInt("sno");    String name = rs.getString("sname");    String sex = rs.getString("SSEX");    //获取年月日-时分秒    Date time = rs.getDate("sbirthday");    //获取时间戳 包括毫秒    Timestamp timestamp = rs.getTimestamp("sbirthday");    String aClass = rs.getString("Class");System.out.println(id + name + sex + timestamp + aClass); }

next()方法：

next()方法 JAVADOC中的注释

将指针移动到当前位置的下一行。ResultSet 指针的初始位置位于第一行之前；第一次调用next()方法将会把第一行设置为当前行；第二次调用next()方法指针移动到第二行，以此类推。

当对next()方法调用返回 **false**，说明此时指针位于最后一行之后。所有对 ResultSet 需要使用当前行的方法**[注:如getString()、getInt()等等]**的调用都将导致**next**()方法抛出 SQLException 异常。如果返回的 ResultSet 集合的类型被设置为 TYPE_FORWARD_ONLY ，会在随后对**next()**方法的调用中返回 **false** 或抛出 SQLException 异常，因不同的数据库提供者的 JDBC 驱动实现而异。

总结：

- 在next()方法在调用之前，ResultSet的指针是在第一行之前的，只有调用了next()方法才会移动到第一行
- 当调用next()指针指向一行空数据，即遍历到最后一行只后；或者ResultSet没有元素，行数为0时，next()方法会返回false

这使得我们可以将next()当作while循环的条件遍历ResultSet集合

**6、释放资源，关闭连接**

rs.close(); stmt.close(); conn.close();

注意，和IO一样，先创建后关闭，防止因上级资源关闭报错。