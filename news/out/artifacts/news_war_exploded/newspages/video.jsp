<%@ page language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <script src="${base}/javaScript/jquery-3.0.0.min.js" type="text/javascript"></script>
</head>
<body>
<div style="width:730px; margin:20px auto;">
    <video controls="controls" autoplay>
        <source src="<%=basePath%>video/${video.path}" type="video/mp4"/>
        ${video.videoName}
    </video>
    <p>
        <span style="font-weight:bold; font-size:20px; color:blue;">
            <input type="button" value="点赞">
        </span> &nbsp;
        <span id="uvCount" style="background-color:green; padding:5px; border-radius:5px">${video.upvoteCount}</span>
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
<script>
    $("input[type='button']").click(function () {
        $.post("/upvoteUser?pre=ajaxUpvote&UserName=${user.username}&videoName=${video.videoName}",
            function (result) {
                $("#uvCount").html(result);
            });
    });
</script>