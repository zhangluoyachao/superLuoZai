<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	session.setAttribute("basePath", basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理登录界面</title>
<link href="css/alogin.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-3.0.0.min.js"
	charset="ustf-8"></script>
<script type="text/javascript">
$(function (){
	$.post("loginbycookie","",function (r){
		console.log(r);
		if(r=="true"){
			location.href="sys/index.html";
		}
	});
});

</script>
</head>
<body>
    <form id="form1" action="sys/index.html" method="post">
    <div class="Main">
        <ul>
            <li class="top"></li>
            <li class="top2"></li>
            <li class="topA"></li>
            <li class="topB"><span><img width="272px" height="122px" src="image/login/logo.png" alt="" style="" />
            </span></li>
            <li class="topC"></li>
            <li class="topD">
                <ul class="login">
                    <li><span class="left login-text">用户名：</span> <span style="left">
                        <input id="Text1" type="text" class="txt" name="account"/>  
                     
                    </span></li>
                    <li><span class="left login-text">密码：</span> <span style="left">
                       <input id="Text2" type="password" class="txt" name="password" />  
                    </span></li>
					<li>
						<span><font color="red">${msg}</font></span>
					</li>
                </ul>
            </li>
            <li class="topE"></li>
            <li class="middle_A"></li>
            <li class="middle_B"></li>
            <li class="middle_C"><span class="btn"><input name="" type="image" src="image/login/btnlogin.gif" /></span></li>
            <li class="middle_D"></li>
            <li class="bottom_A"></li>
            <li class="bottom_B">网站后台管理系统</li>
        </ul>
    </div>
    </form>
</body>
</html>