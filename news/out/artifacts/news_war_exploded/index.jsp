<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>新闻中国</title>
    <link href="css/main.css" rel="stylesheet" type="text/css"/>
    <script language="javascript">
        function check() {
            var login_username = document.getElementById("uname");
            var login_password = document.getElementById("upwd");
            if (login_username.value == "") {
                alert("用户名不能为空！请重新填入！");
                login_username.focus();
                return false;
            } else if (login_password.value == "") {
                alert("密码不能为空！请重新填入！");
                login_password.focus();
                return false;
            }
            return true;
        }

        function focusOnLogin() {
            var login_username = document.getElementById("uname");
            login_username.focus();
        }
    </script>
</head>

<body onload="focusOnLogin()">

<div id="header">
    <div id="top_login">
        <form action="newspages/login_console.jsp" method="post" onsubmit="return check()">
            <label> 登录名 </label>
            <input type="text" name="uname" value="" class="login_input"/>
            <label> 密&#160;&#160;码 </label>
            <input type="password" name="upwd" value="" class="login_input"/>
            <input type="submit" class="login_sub" value="登录"/>
            <label id="error"> </label>
            <img src="images/friend_logo.gif" alt="Google" id="friend_logo"/>
        </form>
    </div>
    <div id="nav">
        <div id="logo"><img src="images/logo.jpg" alt="新闻中国"/></div>
        <div id="a_b01"><img src="images/a_b01.gif" alt=""/></div>
        <!--mainnav end-->
    </div>
</div>

<div id="container">
    <%@include file="index-elements/index_sidebar.jsp" %>
    <div class="main">
        <div class="class_type"><img src="images/class_type.gif" alt="新闻中心"/></div>
        <div class="content">
            <ul class="class_date">
                <li id='class_month'>
                    <a href=""><b>国内 </b></a>
                    <a href=""><b> 国外</b></a>
                    <a href=""><b>国内 </b></a>
                    <a href=""><b> 国外</b></a><a href=""><b>国内 </b></a>
                    <a href=""><b> 国外</b></a><a href=""><b>国内 </b></a>
                    <a href=""><b> 国外</b></a><a href=""><b>国内 </b></a>
                    <a href=""><b> 国外</b></a><a href=""><b>国内 </b></a>
                    <a href=""><b> 国外</b></a>
                </li>
            </ul>
            <ul class="classlist">
                <li><a href='#'>阿斯蒂芬 </a><span> 213132132</span></li>
                <li><a href='#'>阿斯蒂芬 </a><span> 213132132</span></li>
                <li><a href='#'>阿斯蒂芬 </a><span> 213132132</span></li>

                <p align="right"> 当前页数:[1/2]<a href="#">下一页</a> <a href="#">末页</a></p>
            </ul>
        </div>
        <%@include file="index-elements/index_rightbar.html" %>
    </div>
    <%@include file="index-elements/index_bottom.html" %>
</div>

</body>
</html>
