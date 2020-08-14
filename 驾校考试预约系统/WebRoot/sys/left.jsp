<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>左侧导航menu</title>
<link href="css/css.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="js/sdmenu.js"></script>
<script type="text/javascript">
	// <![CDATA[
	var myMenu;
	window.onload = function() {
		myMenu = new SDMenu("my_menu");
		myMenu.init();
	};
	// ]]>
</script>
<style type=text/css>
html{ SCROLLBAR-FACE-COLOR: #538ec6; SCROLLBAR-HIGHLIGHT-COLOR: #dce5f0; SCROLLBAR-SHADOW-COLOR: #2c6daa; SCROLLBAR-3DLIGHT-COLOR: #dce5f0; SCROLLBAR-ARROW-COLOR: #2c6daa;  SCROLLBAR-TRACK-COLOR: #dce5f0;  SCROLLBAR-DARKSHADOW-COLOR: #dce5f0; overflow-x:hidden;}
body{overflow-x:hidden; background:url(images/main/leftbg.jpg) left top repeat-y #f2f0f5; width:194px;}
</style>
</head>
<body onselectstart="return false;" ondragstart="return false;" oncontextmenu="return false;">
<div id="left-top">
	<div><img src="images/main/member.gif" width="44" height="44" /></div>
    <span>用户：ddd
    <br/>
    	角色：超级管理员
    	</c:choose>
    </span>
</div>
    <div style="float: left" id="my_menu" class="sdmenu">
      <div class="collapsed">
        <span>用户管理</span>
        <a href="main.jsp" target="mainFrame" onFocus="this.blur()">后台首页</a>
        <a href="user/user_list.jsp" target="mainFrame" onFocus="this.blur()">用户列表</a>
      </div>
      <div>
        <span>考试管理</span>
        <a href="exam/exam_list.jsp" target="mainFrame" onFocus="this.blur()">考试列表</a>
        <a href="exam/exampoint/exampoint_list.jsp" target="mainFrame" onFocus="this.blur()">考场列表</a>
      </div>
      <div>
        <span>预约管理</span>
        <a href="book/book_list.jsp" target="mainFrame" onFocus="this.blur()">预约列表</a>
      </div>
      <div>
        <span>系统管理</span>
        <a href="sysuser/sysuser_list.jsp" target="mainFrame" onFocus="this.blur()">管理员列表</a>
        <a href="message/message_list.jsp" target="mainFrame" onFocus="this.blur()">通知管理</a>
        <a href="words/words_list.jsp" target="mainFrame" onFocus="this.blur()">留言管理</a>
      </div>
    </div>
</body>
</html>