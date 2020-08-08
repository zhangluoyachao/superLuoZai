<%@ page import="java.awt.*" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/7
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("abc",100);
    pageContext.setAttribute("abc",100, PageContext.REQUEST_SCOPE);
    pageContext.setAttribute("abc",100,PageContext.SESSION_SCOPE);
    pageContext.setAttribute("abc",100,PageContext.APPLICATION_SCOPE);


//pageContext.include("pageTwo.jsp");

%>
<%@include file="pageTwo.jsp"%>
</body>
</html>
