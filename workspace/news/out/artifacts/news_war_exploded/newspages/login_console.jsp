<%@ page import="dao.UsersDao" %>
<%@ page import="pojo.Users" %><%--
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
    String psw = request.getParameter("upwd");
    Users u = new Users(un, psw);
    session.setAttribute("user", u);
    if (UsersDao.checkUser(u))
        response.sendRedirect("topic_list_console.jsp");
    else out.print("<script>alert('账号密码输入错误');location.href='../index.jsp';</script>");
%>

</body>
</html>
