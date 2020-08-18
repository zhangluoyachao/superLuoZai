<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/18
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${base}/javaScript/jquery-3.0.0.min.js" type="text/javascript"></script>
</head>
<body>
用户名<input type="text" id="un"/>
<span id="mess"></span>

</body>
</html>
<script>
    //click单击 blur失去焦点 focus获取焦点
    $("#un").blur(function () {
        var value = $(this).val();
        //用户输入完之后失去焦点 立即提示是否可用
        $.ajax({
            //通过情况下都是异步请求，都是true，这样会有更好的用户体验，但是也有需要同步执行的情况
            //true时表示异步，执行$.ajax内的代码不需要等待服务器响应，直接运行之后的代码
            //false表示同步，需要按顺序执行ajax内的代码，等执行完success或者error内的代码才会走后面的代码
            async: true,
            type: "post",
            data: "un=" + value,
            dataType: "text",
            url: "${base}/user",
            success: function (result) {
                if (result == "true") {
                    $("#mess").html("用户名可用").css("color", "green");
                } else $("#mess").html("用户名重复不可用").css("color", "red");
            }
        })
    });
</script>