<%@ page import="dao.BBSUserDao" %>
<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    request.setCharacterEncoding("UTF-8");
    String un = request.getParameter("un");
    String psw = request.getParameter("psw");

    if (BBSUserDao.userCheck(un, psw)) {
        session.setAttribute("isLogin", true);
        session.setAttribute("user", BBSUserDao.query(un));
        response.sendRedirect("welcome.jsp");
    } else {
        out.print("<script>alert('账号或者密码错误!');window.location.href='login.jsp';</script>");
    }
%>
</body>
</html>
