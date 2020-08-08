<%@ page import="dao.BBSUserDao" %>
<%@ page import="pojo.BBSUser" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String loginName = request.getParameter("un");
    String passWord = request.getParameter("psw");
    String nickName = request.getParameter("nickname");
    String img = request.getParameter("img");
    if (loginName != null) {
        if (!BBSUserDao.nickNameCheck(loginName)) {
            BBSUser u = new BBSUser(nickName, loginName, passWord, img);
            BBSUserDao.insert(u);
            response.sendRedirect("index.jsp");
        } else {
            out.print("<script>alert('用户名重复!请重新输入');window.location.href='register.jsp';</script>");
        }
    } else
        out.print("<script>alert('用户名为空!请重新输入');window.location.href='register.jsp';</script>");

%>
</body>
</html>
