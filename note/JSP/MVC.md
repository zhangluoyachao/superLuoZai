# MVC

MVC是一种软件开发模式，将系统分为M 模型层，V视图层 ，C控制层的三层软件开发架构，能够实现系统各个层级之间解耦合，提高系统的可维护性和拓展性。

1. M：Model，模型层  JavaBean
   
   * 完成具体的业务操作和数据访问 如：查询数据库，封装对象
   * service 业务模型+ dao数据模型
   
2. V：view，视图层 JSP、HTML、ASP、FREEMARKER、THYMELEAF
   
   提供用户的操作界面，如果电脑、平板、手机端的操作界面
   
   * 展示数据
   
3. C：Controller，控制器 Servlet

   用来连接模型层M跟视图层V，在两层之间起到了调度的作用，用于处理请求和响应

   * 获取用户的输入
   * 调用模型 service + dao
   * 将数据交给视图进行展示



## 业务逻辑层

一个功能，用于调用Dao 实现功能，还会负责事务，处理异常，日志，关闭事务

Dao层只会负责一次sql语句的访问，Dao层不需要关闭资源，不处理异常，抛出即可，因为业务层需要进行事务处理



## 动态获取项目前缀

1. 动态获取项目前缀，然后前缀保存在application

   但是每次访问都会存值，会浪费资源。一般是一个项目只允许一次的地方：类加载

   ``` jsp
   String base = application.getContextPath();
   application.setAttribute("base", base);
   
   然后通过EL表达式获取
   ${base}
   ```

   

