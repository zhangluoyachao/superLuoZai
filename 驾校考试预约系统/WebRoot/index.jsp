<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	session.setAttribute("basePath", basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-control" content="no-cache">
<meta http-equiv="Cache" content="no-cache">
<title>驾校网上预约考试系统</title>
<link href="css/index.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="top">
		<div id="topxia"></div>
		<div id="daohang"></div>
	</div>
	<div id="main">
		<div id="gonggao">
			
			<div id="banner">
				<div id="banner_bg">
				</div>
				<!--标题背景-->
				<div id="banner_info"></div>
				<!--标题-->
				<ul>
					<li class="on">1</li>
					<li>2</li>
					<li>3</li>
					<li>4</li>
				</ul>
				<div id="banner_list">
					<a href="#" target="_blank"><img src="image/bg1.jpeg" title="" alt="" width="100%" height="100%"/></a> 
					<a href="#" target="_blank" ><img src="image/bg2.jpeg" title="" alt="" width="100%" height="100%"/></a> 
					<a href="#"target="_blank"><img src="image/bg3.jpeg" title="" alt="" width="100%" height="100%"/></a> 
					<a href="#" target="_blank"><img src="image/bg4.jpeg" title=""alt="" width="100%" height="100%"/></a>
				</div>
			</div>
		</div>
		<div id="login">
			<h3 style="margin-left:15px;">欢迎登陆</h3>
			<p style="margin-left: 10px;"><font color="red">${msg }</font></p>
			<form action="sys/index.html" method="post" name="frmlogin">
				<div id="account">
					账号:&nbsp;<input id="acc" name="account" type="text" maxlength="11"
						style="width:190px; height:30px;" />
				</div>
				<div id="password">
					密码:&nbsp;<input name="password" type="password"
						style="width:190px; height:30px;" />
				</div>
				<input type="submit" value="登录"
					style="font-size:20px; margin-left:56px;margin-top:12px; width:90px;float:left;"
					id="denglu">
			</form>
			<input type="button" value="注册"
				style="font-size:20px; margin-left:10px;margin-top:12px; width:92px;"
				id="zhuce" onclick="window.location.href='register.jsp'">
		</div>
		
	</div>
	<p align="center"><a href="${basePath}login.jsp">切换到后台登录</a></p>
	</body>
</html>