<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/13
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
上传文件 上传头像 通过Java将本地文件上传服务器
上传文件的前提：
1.请求方式必须是post
2.传值方式需要改变
form表单中的enctype属性
默认enctype="application/x-www-form-urlencoded"
表示数据以字符串形式传值提交到服务器
需要修改成enctype="multipart/form-data"
表示数据通过附件形式提交到服务器

--%>
<form action="#" method="post" enctype="multipart/form-data">
    <input type="file">
</form>
</body>
</html>
