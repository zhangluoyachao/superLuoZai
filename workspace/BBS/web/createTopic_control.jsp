<%@ page import="dao.BBSTopicDao" %>
<%@ page import="pojo.BBSTopic" %>
<%@ page import="pojo.BBSUser" %>
<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 16:52
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
    request.setCharacterEncoding("UTF-8");
    BBSUser u = (BBSUser) session.getAttribute("user");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    BBSTopicDao.insert(new BBSTopic(title, u.getUseID(), content));
    response.sendRedirect("welcome.jsp");
    request.getRequestDispatcher("welcome").forward(request,response);
%>
</body>
</html>
