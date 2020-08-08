<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="WEB-INF/isLogin.jsp" %>
<form action="createTopic_control.jsp" method="post">
    请输入话题主题名：<input name="title"><br>
    请输入话题内容：<br>
    <textarea style="height: 300px;width: 300px" name="content"></textarea>
    <input type="submit">
</form>
</body>
</html>
