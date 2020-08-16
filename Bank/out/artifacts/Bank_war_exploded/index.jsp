<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>主页</title>
    <link type="text/css" rel="stylesheet" href="${base}/css/index.css">
    <script type="text/javascript">
        function register() {
            location.href = "${base}/register.jsp";
        }


    </script>
    <script src="${base}/bank/javaScript/check.js"></script>

</head>

<body>
<div id="container">
    <form action="${base}/account?pre=login" method="post" onsubmit="return check()">
        <h2 class="title">网上银行登录</h2>
        <div class="ind-bar">

            <br>
            <span class="slider-bar"></span>
        </div>
        <div class="reg">
            <div class="inp"><input type="text" name="cardNo" placeholder="卡号"></div>
            <div class="inp" style="border-top: 1px solid #e8e8e8"><input type="password" name="password"
                                                                          placeholder="请输入6位数密码"></div>
        </div>
        <div style="margin-top:20px;">
            <button class="sign-button" type="submit">登录系统</button>
        </div>
    </form>

    <div style="margin-top:5px;">
        <button class="sign-button" onclick="register()">注册</button>
    </div>
</div>

</div>
</body>
</html>
