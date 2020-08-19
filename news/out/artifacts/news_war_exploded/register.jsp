<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta http-equiv="expires" content="0"/>
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
    <meta http-equiv="description" content="This is my page"/>
    <title>注册</title>
    <link href="${base}/css/admin.css" rel="stylesheet" type="text/css"/>
    <script src="${base}/javaScript/jquery-3.0.0.min.js" type="text/javascript"></script>

</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header">
    <div id="welcome">注册</div>
    <div id="nav">
        <div id="logo"><img src="${base}/images/logo.jpg" alt="新闻中国"/></div>
        <div id="a_b01"><img src="${base}/images/a_b01.gif" alt=""/></div>
    </div>
</div>

<div id="main">

    <form action="${base}/doUsersServlet?pre=register" onsubmit="return checkEmp()" method="post"
          enctype="multipart/form-data">
        <fieldset>
            <legend>注册</legend>

            <label>用户名：<input name="un" id="name"/><span id="mess"></span></label><br>
            <label> 密&nbsp&nbsp&nbsp码：<input type="text" name="pwd" id="pwd"></label><br>

            <label> 上传头像：<input type="file" name="profile" onchange="showImg(this)"/></label><br>

            <label> 图片:<img src="" id="img" alt=""></label><br>

            <input type="submit" value="提交"/>
            <input type="reset"/>
            <span id="error" style="color: red"></span>

        </fieldset>

    </form>

</div>
</body>
</html>
<script type="text/javascript">
    var b;
    $("#name").blur(function () {
        var name = $("#name").val();
        $.ajax({
                async: true,
                type: "post",
                data: "name=" + name,
                dataType: "text",
                url: "${base}/doUsersServlet?pre=ajaxCheckName",
                success: function (result) {
                    b = result;
                    //true表示存在
                    if (result == "true") {
                        $("#mess").html("用户名存在，请重新输入！").css("color", "red");
                    } else if (result == "false") {
                        $("#mess").html("用户名可用使用！").css("color", "green");
                    }
                }
            }
        )
    });

    function checkEmp() {
        var un = $("input[name=un]").val();
        var pwd = $("input[name=pwd]").val();
        var profile = $("input[name=profile]").val();

        if (un == null || un == "") {
            $("#error").html("用户名不能为空！请重新填入！");
            return false;
        } else if (pwd == null || pwd == "") {
            $("#error").html("密码不能为空！请重新填入！");
            return false;
        } else if (profile == null || profile == "") {
            $("#error").html("请上传图片！");
            return false;
        } else if (b == "true") {
            $("#error").html("用户名重复!");
            return false;
        }
        return true;
    }

    function showImg(thisImg) {
        var img = thisImg.files[0];
        var url = window.URL.createObjectURL(img);
        document.getElementById("img").setAttribute("src", url);
    }
</script>

