<%@ page import="dao.Dao" %>
<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/4
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int sum;
    for (int i = 1; i <= 10; i++) {
        sum = 1;
        for (int j = 1; j <= i; j++) {
            sum *= j;
        }
        out.print(sum + "<br>");
    }
%>
<%
    for (int i = 1; i <= 10; i++) {
        out.print(Dao.numRecursion(i) + "<br>");
    }
%>


</body>
</html>
