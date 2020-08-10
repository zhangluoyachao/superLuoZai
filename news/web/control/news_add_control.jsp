<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/8/10
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Integer ntid = Integer.parseInt(request.getParameter("ntid"));
    String ntitle = request.getParameter("ntitle");
    String nauthor = request.getParameter("nauthor");
    String nsummary = request.getParameter("nsummary");
    String ncontent = request.getParameter("ncontent");
    String file = request.getParameter("file");

%>
</body>
</html>
