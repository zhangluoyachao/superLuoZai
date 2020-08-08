<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="register_control.jsp" method="post">
    <table border="1" cellspacing="0" cellpadding="10">
        <tr>
            <td>用户名：</td>
            <td><input name="un"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="psw"></td>
        </tr>
        <tr>
            <td>昵称：</td>
            <td><input name="nickname"></td>
        </tr>
        <tr>
            <td>头像：</td>
            <td><input type="file" name="img"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交">
            </td>
        </tr>
    </table>

</form>

</body>
</html>
