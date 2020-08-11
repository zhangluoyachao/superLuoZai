<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/11
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${base}/aaa" method="post">
    <p>
        用户：<input name="username">
    </p>
    <p>
        密码：<input type="password" name="password">
    </p>
    <p>
        <input type="submit" value="登录">
    </p>
</form>
</body>
</html>
