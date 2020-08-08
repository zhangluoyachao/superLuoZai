<%@ page import="util.JdbcUtil" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int id = Integer.parseInt(request.getParameter("id"));

    String sql = "delete from emp where empno = ?";
    JdbcUtil.update(sql, id);
    JdbcUtil.close(JdbcUtil.ps, JdbcUtil.con);
    response.sendRedirect("welcome.jsp");
%>
</body>
</html>
