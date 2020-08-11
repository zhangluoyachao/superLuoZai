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
    String base = (String) application.getAttribute("base");
    request.setCharacterEncoding("utf-8");
    String un = request.getParameter("uname");
    String pwd = request.getParameter("upwd");

    UsersService us = new UserServiceImpl();
    Users login = us.login(un, pwd);
    if (login != null) {
        session.setAttribute("user", login);

        response.sendRedirect(base + "/control/news_list_control.jsp");
    } else response.sendRedirect(base + "/newspages/index.jsp");
%>

</body>
</html>
