<%@ page import="dao.EmpDao" %>
<%@ page import="pojo.Emp" %>
<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/4
  Time: 20:12
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
    String ename = request.getParameter("ename");
    String job = request.getParameter("job");
    String sal = request.getParameter("sal");
    String comm = request.getParameter("comm");
    String deptno = request.getParameter("deptno");

    Emp ep = new Emp(ename, job, Double.valueOf(sal), Double.valueOf(comm), Integer.parseInt(deptno));
    int i = EmpDao.insert(ep);

    if (i > 0) {
        out.print("<script> alert('成功'); location.href='Test3_show.jsp'; </script>");
        //如果使用类似输出流方式输出，重定向和转发会失效

//        response.sendRedirect("Test1.jsp");

    } else {
        out.print("<script> alert('失败'); location.href='Test3.jsp'; </script>");
    }
%>
</body>
</html>
