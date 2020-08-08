<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/4
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    action  提交地址
    method  请求提交方式
--%>
<form action="show.jsp" method="get">
    <div>姓名：<input name="name"></div>
    <div>电话：<input name="phone"></div>
    <div>密码：<input type="password" name="password"></div>
    <div>性别：<input type="radio" name="sex" value="男">男 <input type="radio" name="sex" value="女">女</div>
    <div>爱好：</div>
    <div><input type="checkbox" name="like" value="篮球">篮球</div>
    <div><input type="checkbox" name="like" value="足球">足球</div>
    <div><input type="checkbox" name="like" value="羽毛求">羽毛球</div>
    <div><input type="checkbox" name="like" value="排球">排球</div>
    <div><input type="submit" value="提交"></div>
</form>
</body>
</html>
