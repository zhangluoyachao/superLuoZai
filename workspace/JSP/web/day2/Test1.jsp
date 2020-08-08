<%@ page import="pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/5
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User u = new User("admin", "123");
    session.setAttribute("user", u);
    session.setMaxInactiveInterval(60);

    Cookie use = new Cookie("un", u.getUsername());
    Cookie psd = new Cookie("pw", u.getPassword());

    use.setMaxAge(300);
    psd.setMaxAge(300);

    response.addCookie(use);
    response.addCookie(psd);

    response.sendRedirect("Test1_2.jsp");

%>
</body>
</html>
