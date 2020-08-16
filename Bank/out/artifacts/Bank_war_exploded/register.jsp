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
    <script src="${base}/bank/javaScript/check.js" type="text/javascript"></script>
    <script type="text/javascript">
        function show(object) {
            //获取文件对象
            var avatar = object.files[0];
            //获取文件对象URL
            var url = window.URL.createObjectURL(avatar);
            //给img的src赋值
            document.getElementById("img").setAttribute("src", url);
        }
    </script>
</head>
<body>
<form action="${base}/account?pre=register" method="post" enctype="multipart/form-data">
    <fieldset style="width: 100px">
        <legend>注册</legend>
        <label>
            卡号：<input type="text" name="cardNo">
        </label><br>
        <label>
            密码：<input type="password" name="password">
        </label><br>
        <label>
            上传头像：<input type="file" name="avatar" onchange="show(this)">
        </label><br>
        <label>
            <img src="#" id="img" style="width: 100px;height: 100px">
        </label><br>
        <label>
            <input type="submit" value="注册">
            <input type="reset">
        </label>
    </fieldset>

</form>
</body>
</html>
