<%@ page import="com.sc.pojo.News" %>
<%@ page import="com.sc.service.NewsService" %>
<%@ page import="com.sc.service.impl.NewsServiceImpl" %>
<%@ page import="java.sql.Date" %>
<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/8/10
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String base = (String) application.getAttribute("base");
    Integer ntid = Integer.parseInt(request.getParameter("ntid"));
    String ntitle = request.getParameter("ntitle");
    String nauthor = request.getParameter("nauthor");
    String nsummary = request.getParameter("nsummary");
    String ncontent = request.getParameter("ncontent");
    String file = request.getParameter("file");

    News news = new News(ntitle, nauthor, nsummary, ncontent, Date.valueOf(LocalDate.now()), ntid, file);
    NewsService ns = new NewsServiceImpl();
    ns.insert(news);

    response.sendRedirect(base + "/control/news_list_control.jsp");
%>
</body>
</html>
