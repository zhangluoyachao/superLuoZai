<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>主要内容区main</title>
<link href="css/css.css" type="text/css" rel="stylesheet" />
<link href="css/main.css" type="text/css" rel="stylesheet" />
<link rel="shortcut icon" href="images/main/favicon.ico" />
<style>
body{overflow-x:hidden; background:#f2f0f5; padding:15px 0px 10px 5px;}
#main{ font-size:12px;}
#main span.time{ font-size:14px; color:#528dc5; width:100%; padding-bottom:10px; float:left}
#main div.top{ width:100%; background:url(images/main/main_r2_c2.jpg) no-repeat 0 10px; padding:0 0 0 15px; line-height:35px; float:left}
#main div.sec{ width:100%; background:url(images/main/main_r2_c2.jpg) no-repeat 0 15px; padding:0 0 0 15px; line-height:35px; float:left}
.left{ float:left}
#main div a{ float:left}
#main span.num{  font-size:30px; color:#538ec6; font-family:"Georgia","Tahoma","Arial";}
.left{ float:left}
div.main-tit{ font-size:14px; font-weight:bold; color:#4e4e4e; background:url(images/main/main_r4_c2.jpg) no-repeat 0 33px; width:100%; padding:30px 0 0 20px; float:left}
div.main-con{ width:100%; float:left; padding:10px 0 0 20px; line-height:36px;}
div.main-corpy{ font-size:14px; font-weight:bold; color:#4e4e4e; background:url(images/main/main_r6_c2.jpg) no-repeat 0 33px; width:100%; padding:30px 0 0 20px; float:left}
div.main-order{ line-height:30px; padding:10px 0 0 0;}
</style>
</head>
<body>
<!--main_top-->
<table width="99%" border="0" cellspacing="0" cellpadding="0" id="main">
  <tr>
    <td colspan="2" align="left" valign="top">
    <span class="time"><strong>上午好！ddd</strong></span>
    <div class="top"><span class="left">您上次的登灵时间：2012-05-03  12:00   登录IP：127.0.0.1 &nbsp;&nbsp;&nbsp;&nbsp;如非您本人操作，请及时</span><a href="index.html" target="mainFrame" onFocus="this.blur()">更改密码</a></div>
    <div class="sec">这是您第<span class="num">80</span>次,登录！</div>
    </td>
  </tr>
  <tr>
    <td align="left" valign="top" width="50%">
    <div class="main-tit">网站信息</div>
    <div class="main-con">
管理员个数：<font color="#538ec6"><strong>6</strong></font> 人<br/>
登陆者IP：192.168.1.156<br/>
程序编码：UTF-8<br/>
    </div>
    </td>
    <td align="left" valign="top" width="49%">
    <div class="main-tit">服务器信息</div>
    <div class="main-con">
服务器软件：Tomcat<br/>
JAVA版本：1.7<br/>
MYSQL版本：5.0.45-community-nt<br/>
    </div>
    </td>
  </tr>
</table>
</body>
</html>