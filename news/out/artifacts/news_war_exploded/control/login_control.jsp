<%@ page import="com.sc.pojo.Users" %>
<%@ page import="com.sc.service.UsersService" %>
<%@ page import="com.sc.service.impl.UserServiceImpl" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/8/9
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String un = request.getParameter("uname");
    String pwd = request.getParameter("upwd");

    UsersService us = new UserServiceImpl();
    Users login = us.login(un, pwd);
    if (login != null) {
        session.setAttribute("user", login);
        //不应该跳转admin
        response.sendRedirect("topic_list_control.jsp");
    } else response.sendRedirect("../index.jsp");
%>

</body>
</html>
