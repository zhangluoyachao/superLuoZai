<%@ page import="dao.TopicDao" %>
<%@ page import="pojo.Topic" %><%--
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
    String tname = request.getParameter("tname");
    TopicDao.insert(new Topic(tname));
    out.print("<script>alert('添加成功');location.href='admin.jsp';</script>");

%>
</body>
</html>
