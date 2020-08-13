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

   

## Servlet

servlet用于实现控制层，是Java服务端用于处理用户请求和响应的java程序，实现和control.jsp几乎一致

### 1、Servlet实现方式

1. 实现一个Servlet接口

   service方法 可以接受任何请求方式

2. 继承一个HttpServlet类   

   常用，适合处理HTTP请求 doXxx()方法可以针对不同请求处理

### 2、配置Servlet

1. 通过配置文件：XML	可扩展标记语言

   ```xml
   <!--Tomcat服务器负责读取web.xml-->
       <!--
           name自定义，但是必须和mapping中相同
           表示一组标签
           class 表示那个类,使用类的全类名
       -->
       <servlet>
           <servlet-name>a</servlet-name>
           <servlet-class>controller.FirstServlet</servlet-class>
           
           <!--
           配置初始化参数，会把参数的值封装到ServletConfig中
   		在Servlet中直接调用getInitParameter("name")
   		等同于this.getServletCofig().getInitParameter("name")
       	-->
           <init-param>
           	<param-name>req</param-name>
               <param-value>utf-8</param-value>
           </init-param>
            <init-param>
           	<param-name>resp</param-name>
               <param-value>text/html;charset=utf-8</param-value>
           </init-param>
           
           <!--
           因为init是默认用户第一次发送请求时执行，就会有以下问题
           1.第一次请求需要执行初始化，会有延迟
           2.init中代码报错，只有用户第一次访问才会发现
   
           为了解决这些问题，就需要服务器在启动时候就加载好Servlet执行init初始化
           添加load-on-startup    默认为负数，表示第一次访问时执行
           可以配置为正数（1-10）设置为服务器启动时加载
           值越大 启动优先级越小 按1-10顺序执行
           -->
           <load-on-startup>1</load-on-startup>       
           
           <!--
           注：标签执行是有顺序的，name,values,init-param,load
           -->
       </servlet>
   
       <servlet-mapping>
           <servlet-name>a</servlet-name>
           <!--
           指定好Servlet请求地址
           注：前面得  /
           -->
           <url-pattern>/aaa</url-pattern>
       </servlet-mapping>
   ```

2. 通过注解

   1. 简化版 无load-on-startup

      ``` java
      @WebServlet("/abc")
      //等价于 servlet 和Servlet mapping标签
      //"/abc" 等价于 url-pattern
      ```

      

   2. 完全体

      ```java
      @WebServlet(
              displayName = "user",//servlet名称
              urlPatterns = "/aaa",//请求地址
              loadOnStartup = 1   //设置服务器启动时是否执行加载
      )
      ```



### 3、Servlet生命周期

1. **实例化**

   1. 默认情况下，第一次访问Servlet
   2. 如果配置了load-on-startup 则服务器会在启动时候执行实例化

   注：每一个Servlet都是单例，只会实例化一次

2. **初始化**

   在实例化的同时，初始化

3. **处理请求**

   每发送一次请求，都会执行一次service方法，service方法会根据请求的不同分别调用doXxx();

4. **销毁**

   容器关闭（Tomcat服务器关闭），会执行**destory**方法销毁





## 分页

分页是将所有数据分段展示给用户的技术，用户每次看到的数据不是全部数据，而是数据的一部分。用户只要通过指定的页码数就可以切换数据。项目中凡是存在列表，都必须写分页

### 1、分页的步骤

1. 分页的sql语句

   oracle rownum分页

   mysql limit关键字

2. 数据初始化 

   准备好分页需要的数据，通过工具类





## 文件的上传下载

上传文件 上传头像 通过Java将本地文件上传服务器

### 1、上传文件的前提：

1. 请求方式必须是post

2. 传值方式需要改变

   form表单中的enctype属性默认

   ```js
   enctype="application/x-www-form-urlencoded"
   ```

   表示数据以字符串形式传值提交到服务器

   

   需要修改成：

   ```js
   enctype="multipart/form-data"
   ```

   表示数据通过附件形式提交到服务器

   

3. 在Servlet层中要实现上传下载

   实现上传下载需要加上注解：**@MultipartConfig**

   **注：对@MultipartConfig标注的说明。**

   @MultipartConfig标注有以下的属性可用。

   1. fileSizeThreshold:整数值设置，默认值为0，若上传文件的大小超过了这个值，就会先写入缓存文件。

   2. location:字符串设置，默认值为空字符串。如果设置这个属性，缓存文件就是写到指定目录

   3. maxFileSize:限制文件上传大小。默认值为-1L，表示不限制大小。

   4. maxRequestSize:限制multipart/form-data请求格式，默认值为-1L，表示不限制个数。

   

### 2、实现上传图片的同时显示图片

```jsp
<form action="/up?pre=upload" method="post" enctype="multipart/form-data">
    <input type="file" name="myFile" onchange="showImg(this)">
    <img src="" id="img">
    <input type="submit">
</form>

<script type="text/javascript">
    function showImg(thisObject) {
        //获取图片对象
        var imgFile = thisObject.files[0];
        //通过图片对象获取地址
        var url = window.URL.createObjectURL(imgFile);
        //把地址给Src赋值
        //setAttribute修改属性值
        document.getElementById("img").setAttribute("src", url);
    }
</script>
```



### 3、Servlet中实现上传功能

1. 获取文件对象

   1. 通过请求获取对应文件对象

   ```java
   Part imgFile = req.getPart("myFile");
   //类似于req.getParameter
   //Part是一个连接
   ```

   2. 获取文件的文件名

   ```java
   //获取文件名
   String fileName = imgFile.getSubmittedFileName();
   //该方法只能TOMCAT1.8以上才能使用
   
   //获取文件后缀
   String suffix = fileName.substring(fileName.lastIndexOf("."));
   
   //创建新的文件名
   String newFileName = UUID.randomUUID().toString() + suffix;
   ```

2. 保存到项目路径

   1. 获取文件保存地址的真实路径

   ```java
   //1.获取服务器的真实路径
   String path = req.getServletContext().getRealPath("/upload");
   //自动在后面+/upload
   ```

   2. 获取文件写入的文件地址

   ```java
   //2.获取IO流需要写入的路径
   String filePath = path + File.separator + newFileName;
   //File.separator为自动生成 斜杠/ 因为不同环境斜杠可能不同
   ```

   **注：因为不同系统的斜杠是不同的，所以说需要自动获取，通过File文件的separator属性**

   3. 通过IO流写入

   ```java
   //三.通过IO流写入
   //Part提供了一个写入方法write 调用就完事了
   //Part本身就是一个连接
   File f = new File(filePath);
   if (!f.exists()) {
       f.mkdirs();
   }
   imgFile.write(filePath);
   ```

   **注：Part详解：https://www.cnblogs.com/sunyongxing/articles/2622891.html**

### 4、Servlet中实现下载功能

1. 通过请求传递的文件名获取文件绝对路径

```java
//获取文件名
String fileName = req.getParameter("fileName");
//获取绝对路径
String filePath = req.getServletContext().getRealPath("/upload") + File.separator + fileName;
```

2. 设置响应头部信息

```java
// resp.setHeader(内容意向"content-disposition","attachment;filename=" + fileName);
//                                       指定附件形式下载，并且指定下载后的名称
resp.setHeader("content-disposition", "attachment;filename=" + fileName);
```

3. 通过IO流传输

```java
ServletOutputStream sos = resp.getOutputStream();
FileInputStream fis = new FileInputStream(filePath);
byte[] bytes = new byte[1024];
Integer length;
while ((length = fis.read(bytes)) != -1) {
    sos.write(bytes, 0, length);
}
fis.close();
sos.close();
```
