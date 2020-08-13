<%--
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

<form action="login_control.jsp" method="post">
    <table>
        <tr>
            <td>用户：</td>
            <td><input name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>提交</td>
            <td><input type="submit" value="登录"></td>
        </tr>
    </table>


</form>
</body>
</html>
