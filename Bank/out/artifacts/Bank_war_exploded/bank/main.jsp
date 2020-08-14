<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
<style>

*{padding:0px; margin:0px}
	#container{ width:850px; margin:50px auto;}
	body{
		color: #555;
    font-size: 15px;
    line-height: 1.7;
    font-family: 'Helvetica Neue',Helvetica,'PingFang SC','Hiragino Sans GB','Microsoft YaHei',Arial,sans-serif;
    background: #f7fafc;
    -webkit-font-smoothing: subpixel-antialiased;
	}
	
	.left{ width:150px; height:150px; text-align:center; float:left;}
	.left p{ width:100%; height:30px; line-height:30px; background: #0f88eb;  color: #fff; margin-top:2px; border-radius: 3px;}
	.left p a{ text-decoration:none; color: #fff;  display:block; width:100%;}
	.left p:hover{ background: #55abed;}
	.right{ width:680px; height:400px; float:left; margin-left:10px; border:1px solid black;}
</style>
</head>

<body>
<div>
	<div id="container">
    	<div class="top">
        欢迎登陆网上银行！卡号：6565656565665 <a href="#">退出登陆</a>
        </div>
        
        <hr/>
  		<br/>
    	<div class="left">
        	<p><a href="balance.jsp" target="myiframe">查询余额</a></p>
            <p><a href="tranaction.jsp" target="myiframe">转账</a></p>
            <p><a href="selrecord.jsp" target="myiframe">查询交易记录</a></p>
            <p><a href="editpwd.jsp" target="myiframe">修改密码</a></p>
        </div>
        <div class="right">
        	<iframe name="myiframe" src="${base}/bank/balance.jsp" width="100%" height="100%" scrolling="no" frameborder="0"></iframe>
        </div>
    </div>
</div>
</body>
</html>
