<%@ page import="com.sc.service.TopicService" %>
<%@ page import="com.sc.service.impl.TopicServiceImpl" %><%--
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
    request.setCharacterEncoding("utf-8");
    int tid = Integer.parseInt(request.getParameter("tid"));
    TopicService ts = new TopicServiceImpl();
    ts.delete(tid);
    response.sendRedirect(application.getAttribute("base") + "/control/topic_list_control.jsp");
%>


</body>
</html>
