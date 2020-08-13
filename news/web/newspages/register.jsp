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
    <script type="text/javascript">
        function checkEmp() {
            var un = document.getElementById("un").value;
            var pwd = document.getElementById("pwd").value;
            if (un == "") {
                alert("用户名不能为空！请重新填入！");
                un.focus();
                return false;
            } else if (pwd == "") {
                alert("密码不能为空！请重新填入！");
                pwd.focus();
                return false;
            }
            return true;
        }
    </script>
    <form action="${base}/doUsersServlet?pre=register" onsubmit="return checkEmp()" method="post"
          enctype="multipart/form-data">
        <table>
            <tr>
                <td>用户名：<input type="text" name="un" id="un"></td>
            </tr>
            <tr>
                <td>密&nbsp&nbsp&nbsp码：<input type="text" name="pwd" id="pwd"></td>
            </tr>
            <tr>
                <td> 上传头像：<input type="file" name="profile"/></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="提交"/>
                    <input type="reset"/>
                </td>
            </tr>
        </table>

    </form>
</div>
</body>
</html>
