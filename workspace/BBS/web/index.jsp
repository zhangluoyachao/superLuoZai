<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>

<%@page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>主页</title>

</head>
<body>
<%
    session.setAttribute("isLogin", false);
%>

<form action="index.jsp" method="post">
    <a href="login.jsp">登录</a>
    <a href="register.jsp">注册</a>
    <input name="content">
    <input type="submit" value="查询" name="select">
</form>
<%
    String contents = request.getParameter("content");
    if (contents != null) {

    }
%>
<div>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>序号</th>
            <th>标题</th>
            <th>回帖数</th>
            <th>浏览量</th>
            <th>最后回复人/回复时间</th>
        </tr>
        <%

        %>
        <tr>

        </tr>
    </table>
</div>
</body>
</html>
