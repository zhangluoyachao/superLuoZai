<%@ page import="java.util.List" %>
<%@ page import="pojo.BBSTopic" %>
<%@ page import="dao.BBSTopicDao" %>
<%@ page import="pojo.BBSUser" %>
<%@ page import="java.sql.Date" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="WEB-INF/isLogin.jsp" %>
<%
    BBSUser user = (BBSUser)session.getAttribute("user");
    List<BBSTopic> list = BBSTopicDao.query(user);
    request.setAttribute("list",list);
    request.getRequestDispatcher("userTopic.jsp").forward(request,response);

%>

</body>
</html>
