<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>欢迎登录网上银行</title>
    <link type="text/css" rel="stylesheet" href="${base}/css/main.css">
</head>

<body>

<div>
    <div id="container">
        <div class="top">
            欢迎登陆网上银行！
            <a href="#"><img id="img" src="${base}/upload/${account.avatar}"></a>
            卡号：${account.cardNo}
            <a href="#">退出登陆</a>
        </div>

        <hr/>
        <br/>
        <div class="left">
            <p><a href="${base}/bank/balance.jsp" target="myiframe">查询余额</a></p>
            <p><a href="${base}/bank/transaction.jsp" target="myiframe">转账</a></p>
            <p><a href="${base}/record" target="myiframe">查询交易记录</a></p>
            <p><a href="${base}/bank/editpwd.jsp" target="myiframe">修改密码</a></p>

        </div>
        <div class="right">
            <iframe name="myiframe" src="${base}/bank/balance.jsp" width="100%" height="100%" scrolling="no"
                    frameborder="0"></iframe>
        </div>
    </div>
</div>
</body>
</html>
