<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/4
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加员工信息</h1>
<form action="Test3_control.jsp" method="post">
    <table>
        <tr>
            <td>员工姓名：</td>
            <td><input name="ename"></td>
        </tr>

        <tr>
            <td>工作：</td>
            <td><input name="job"></td>
        </tr>

        <tr>
            <td>工资：</td>
            <td><input name="sal"></td>
        </tr>
        <tr>
            <td>奖金：</td>
            <td><input name="comm"></td>
        </tr>
        <tr>
            <td>部门编号：</td>
            <td><input name="deptno"></td>
        </tr>
    </table>
    <input type="submit" value="提交">

</form>
</body>
</html>
