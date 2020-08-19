Ajax

## 一、Ajax

Ajax：异步的(asynchronous) javaScript and XML

是一种不用加载整个页面，能够实现局部更新网页内容的技术

### 1、同步和异步的区别

1. 同步：发送请求—>等待服务器处理结果—>响应（返回结果）。这个期间，客户端浏览器不能做任何事情
2. 异步：发送请求—>等待服务器处理**（这时浏览器仍然可以做其他事情）**—>响应。异步请求无需等待

总结：同步请求相当于一条直线的队列，异步请求不在统一队列上，各走各的

异步请求的好处：提高用户体验，提高访问速度

### 2、ajax实现

ajax实现方式通过jQuery的方法实现异步请求

$.ajax()	$.post()	$.get()	$.getJson()	$.load()

#### a、$.ajax()

JSP中实现

``` JSP
<script src="${base}/javaScript/jquery-3.0.0.min.js" type="text/javascript"></script>
<script>
    $("a").click(function () {
        //发送异步请求
        var color = "red";
        $.ajax({
            //async 是否异步，默认true
            //通过情况下都是异步请求，都是true，这样会有更好的用户体验，但是也有需要同步执行的情况
            //true时表示异步，执行$.ajax内的代码不需要等待服务器响应，直接运行之后的代码
            //false表示同步，需要按顺序执行ajax内的代码，等执行完success或者error内的代码才会走后面的代码
            async: false,
            //type 请求方式 值:post/get 注:需要加双引号"post"
            type: "post",
            //data 数据 请求传递的数据 类似url传值key1=value1 & key2=value2
            data: "color=yellow&pw=123",
            //url 请求地址，指定异步请求地址
            url: "${base}/ajax",
            //dataType 服务器返回的数据类型 text json xml
            dataType: "text",
            //请求执行成功之后，所执行的函数，也叫回调函数
            success: function (result) {
                //参数是服务器返回的数据
                color = result;
            },
            //请求执行失败之后，所执行的函数，失败的回调函数
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                //参数：请求，文本状态，异常
            }
        });
        $("h1").css("color", color);
    });
</script>
```

Servlet中实现

```java
//做什么？
// 1、转码
req.setCharacterEncoding("utf-8");
resp.setContentType("text/html;charset=utf-8");
// 2、获取数据
String color = req.getParameter("color");
String pw = req.getParameter("pw");
// 3、对数据进行操作
// 4、和同步请求不同，不能跳转
//通过流将数据写入客户端
PrintWriter out = resp.getWriter();
out.print("yellow");
```



## 二、Json

json是一种轻量级数据交互格式，其本质就是一个String，通过json可以描述任意数据，扩展性好，体积小，传输效率比较高，易于解析，目前为之被广泛使用。

**注：数据传到前台之前都会调用toString方法（基本数据类型会封装成对应封装类调用），变成字符串在前台显示，由于只能传递字符串，所以说通过json将所有类型转化成字符串类型传值**

### 1、语法

基于键值形式组装数据

{key:value,key2:value2...}

```json
//例如一个对象 ；
//User u : id=1 username= "zhang" password = "123";
{"id":1,"username":"zhang","password"="123"}
```

1. key和value之间通过 : 隔开，多个键值通过 , 隔开
2. {}表示对象
3. []表示数组或集合
4. value 值可以是：数字 字符串 boolean 数组 对象 集合 null

例如：通过json描述一个对象:id,name,用户信息对象,爱好的集合

```json
{
    "id":1,
    "name":"zhang",
    "userInfo":{"sex":"男","age":"22"},
    "hobbyList":[{"hobby":"吃"},{"hobby":"喝"},{"hobby":"嫖"}]
}
```



### 2、使用

json的创建灰常滴麻烦，我们可以通过工具生成 ：gson.jar包

#### 1、后台生成Json

导入jar包后可以之间调用Gson类自动生成JSON

```java
Gson g = new Gson();
//可以将任何类型转换成Json格式
//String json=g.toJson(object);
String json = g.toJson(object o);
out.print(json);
```



#### 2、前端获取解析Json

jquery提供了$.post() $.get()方法

```jsp
$.post() $.get()
默认同ajax  type = "post"
data可以不写 用url传值
dataType可以不写 默认"text"
$.post(url, data, function (result) {
}, dataType);
```
```jsp
$.post("${base}/showUsers", function (result) {
    //解析json格式的返回值 $.parseJSON();
    //如果是集合或者数组会解析成js数组
    //如果是对象会被转换成js对象
    var list = $.parseJSON(result);
    var str = "";
    for (var i = 0; i < result.length; i++) {
    	str += "<p>"+ list[i].username+ list[i].password+ "</p>";
    }
    $("div").html(str);
});
```

**注：dataType如果写成json那么可以省去转换，result就为转化后的内容**

```jsp
$.post("${base}/showUsers", function (result) {
    var str = "";
	//对result处理
    for (var i = 0; i < result.length; i++) {
        str += "<p>"
            + result[i].username
            + result[i].id
            + "</p>";
    }
    $("div").html(str);
}, "json");
```