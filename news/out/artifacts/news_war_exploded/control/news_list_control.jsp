<%@ page import="com.sc.pojo.News" %>
<%@ page import="com.sc.service.NewsService" %>
<%@ page import="com.sc.service.impl.NewsServiceImpl" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/11
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    NewsService ns = new NewsServiceImpl();
    List<News> list = ns.queryAll();
    request.setAttribute("list", list);
    request.getRequestDispatcher("../newspages/admin.jsp").forward(request, response);
%>
</body>
</html>
