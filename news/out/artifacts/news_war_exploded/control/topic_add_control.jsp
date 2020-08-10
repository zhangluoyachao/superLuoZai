<%@ page import="com.sc.service.TopicService" %>
<%@ page import="com.sc.service.impl.TopicServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/8/9
  Time: 12:34
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
    ts.insert(request.getParameter("tname"));
    response.sendRedirect("/newspages/topic_list.jsp");
%>
</body>
</html>
