<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/14
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="" method="post" enctype="multipart/form-data">
    <fieldset style="width: 100px">
        <legend>注册</legend>
        <label>
            卡号：<input type="text" name="username">
        </label><br>
        <label>
            密码：<input type="text" name="username">
        </label><br>
        <label>
            上传头像：<input type="file" name="avatar">
        </label><br>
        <label>
            <img src="#" style="width: 100px;height: 100px">
        </label><br>
        <label>
            <input type="submit" value="注册">
            <input type="reset">
        </label>
    </fieldset>

</form>
</body>
</html>
