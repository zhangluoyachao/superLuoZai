<%@ page import="com.sc.dao.impl.TopicDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/8/9
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    TopicDaoImpl.delete(request.getParameter("tname"));
    response.sendRedirect("topic_list_console.jsp");
%>


</body>
</html>
