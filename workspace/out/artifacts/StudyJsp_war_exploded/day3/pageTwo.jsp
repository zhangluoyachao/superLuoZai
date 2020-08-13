<%--
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
    Integer pag = (Integer)pageContext.getAttribute("abc");

    Integer abc = (Integer) request.getAttribute("abc");
    Integer abc1 = (Integer) session.getAttribute("abc");
    Integer abc2 = (Integer) application.getAttribute("abc");
%>
<%=pag%>
<%=abc%>
<%=abc1%>
<%=abc2%>

</body>
</html>
