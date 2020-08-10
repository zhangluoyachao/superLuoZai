<%@ page import="com.sc.pojo.Topic" %>
<%@ page import="com.sc.service.TopicService" %>
<%@ page import="com.sc.service.impl.TopicServiceImpl" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/8/11
  Time: 0:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    TopicService ts = new TopicServiceImpl();
    List<Topic> list = ts.queryAll();
    request.setAttribute("list", list);
    request.getRequestDispatcher("/newspages/news_add.jsp").forward(request, response);
%>
</body>
</html>
