<%@ page import="dao.EmpDao" %>
<%@ page import="pojo.Emp" %>
<%@ page import="java.sql.Date" %>
<%@ page import="java.util.List" %><%--
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
    String name = (String) session.getAttribute("username");

%>
欢迎光临：<%=name == null ? "null" : name%>
<table border="1" cellpadding="10" cellspacing="0">
    <tr>
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>员工工作</th>
        <th>上级编号</th>
        <th>入职时间</th>
        <th>员工工资</th>
        <th>员工奖金</th>
        <th>员工部门</th>
    </tr>
        <%
        List<Emp> list = EmpDao.queryAll();
        for (Emp e : list) {
            Integer id = e.getId();
            String username = e.getName();
            String job = e.getJob();
            Integer mgr = e.getMgr();
            Date date = e.getHireDate();
            Double sal = e.getSal();
            Double comm = e.getComm();
            Integer deptNo = e.getDeptNo();
    %>
    <tr>
        <td><%=id%>
        </td>
        <td><%=username%>
        </td>
        <td><%=job%>
        </td>
        <td><%=mgr%>
        </td>
        <td><%=date%>
        </td>
        <td><%=sal%>
        </td>
        <td><%=comm%>
        </td>
        <td><%=deptNo%>
        </td>
        <td>
            <a href="User_delete.jsp?id = <%=id%>">删除</a>
        </td>
    </tr>
        <%
        }
    %>
</body>
</html>
