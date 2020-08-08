<%@ page import="dao.Tb_userDao" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/4
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //1、设置编码方式
    request.setCharacterEncoding("utf-8");
    //2、获取提交的数据
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    //3、判断
    //4、成功==>跳转welcome 失败==>返回
    Tb_userDao td = new Tb_userDao();
    if (td.query(username, password)) {
        request.getRequestDispatcher("welcome.jsp").forward(request, response);
    } else {

        response.sendRedirect("login.jsp");
    }

%>
</body>
</html>
