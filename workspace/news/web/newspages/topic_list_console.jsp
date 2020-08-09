<%@ page import="dao.TopicDao" %>
<%@ page import="pojo.Topic" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/8/9
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Topic> list = TopicDao.queryAll();
    request.setAttribute("list", list);
    request.getRequestDispatcher("topic_list.jsp").forward(request, response);
%>
</body>
</html>
