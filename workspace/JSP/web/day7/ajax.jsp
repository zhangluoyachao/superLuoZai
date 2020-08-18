<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/18
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${base}/javaScript/jquery-3.0.0.min.js" type="text/javascript"></script>

</head>
<body>
<a href="#">异步</a>
<h1>测试</h1>
</body>
</html>
<script>
    $("a").click(function () {
        //发送异步请求
        var color = "red";
        $.ajax({
            //async 是否异步，默认true
            //通过情况下都是异步请求，都是true，这样会有更好的用户体验，但是也有需要同步执行的情况
            //true时表示异步，执行$.ajax内的代码不需要等待服务器响应，直接运行之后的代码
            //false表示同步，需要按顺序执行ajax内的代码，等执行完success或者error内的代码才会走后面的代码
            async: true,
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
                alert(result);
            },
            //请求执行失败之后，所执行的函数，失败的回调函数
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                //参数：请求，文本状态，异常
            }
        });
        $("h1").css("color", color);
    });
</script>