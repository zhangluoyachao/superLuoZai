<%@ page import="dao.TopicDao" %><%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/8/9
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    TopicDao.updateTopicName(request.getParameter("oldtname"), request.getParameter("tname"));
    response.sendRedirect("topic_list_console.jsp");
%>

</body>
</html>
