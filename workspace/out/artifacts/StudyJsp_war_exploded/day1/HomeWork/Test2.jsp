<%@ page import="dao.CountPeopleDao" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/4
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    CountPeopleDao.addCount();
    int num = CountPeopleDao.getCount();
    out.print("累计访问人数：" + num);
%>
</body>
</html>
