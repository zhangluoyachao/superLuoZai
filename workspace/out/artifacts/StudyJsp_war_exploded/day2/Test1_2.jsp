<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/5
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String userName = "1";
    String passWord = "1";
    Cookie[] coos = request.getCookies();
    for (Cookie cookie : coos) {
        if (cookie.getName().equals("un")) {
            userName = cookie.getValue();
        }
        if (cookie.getName().equals("pw")) {
            passWord = cookie.getValue();
        }
    }

%>
<div>a<%=userName%>
</div>
<div>b<%=passWord%>
</div>
</body>
</html>
