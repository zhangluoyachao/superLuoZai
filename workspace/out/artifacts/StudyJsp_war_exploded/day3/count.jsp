<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/7
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Integer count = (Integer)application.getAttribute("count");
    if(count ==null)
        count = 1;
    else
        count++;
    application.setAttribute("count",count);
    System.out.println(count);
%>
</body>
</html>
