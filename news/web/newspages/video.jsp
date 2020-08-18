<%@ page language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head></head>
<body>
<div style="width:730px; margin:20px auto;">
    <video controls="controls" autoplay>
        <source src="<%=basePath%>video/mysql.mp4" type="video/mp4"/>
        示例视频1

        您的浏览器不支持video标签
    </video>
    <p>
        <span style="font-weight:bold; font-size:20px; color:blue;">点赞</span> &nbsp;
        <span style="background-color:green; padding:5px; border-radius:5px">36</span>
    </p>
    <hr>
    <h3>评论列表</h3>
    <div>
        <p>张三说：这视频太好看了！！！ &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016-08-12</p>
        <p>李四说：唱的填好了！！ &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016-08-12</p>
        <p>王五说：阿萨德发送到看了！！！ &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016-08-12</p>
        <p>赵柳说：撒撒旦法阿萨德！！！ &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016-08-12</p>
        <p>天启说：阿萨德发送到了！！！ &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2016-08-12</p>
    </div>
    <button style="width: 100%;">下一页</button>
    <hr>
    <div>
        姓名：<input size="10" placeholder="请输入姓名"/><br>
        <textarea placeholder="请输入评论内容"></textarea><br>
        <button>发表评论</button>
    </div>
</div>
</body>
</html>