<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户列表</title>
<link href="../css/commons.css"  rel="stylesheet" >
<script type="text/javascript" src="../../js/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function (){
		$(".headimg").hover(function (e){
			var x = e.originalEvent.x+50;
			var y= e.originalEvent.y-30;
			var offsetX=20-$(this).offset().left; 
			var offsetY=20-$(this).offset().top; 
			var src = $(this).attr("src");
			$("<img src="+src+" class='disimg'/>").css({
				"position":"absolute",
				"width":"200px",
				"height":"200px",
				"top":y, 
				"left":x, 
				"display":"none",
			}).appendTo("table").fadeIn(800);
		},function (){
			$(".disimg").remove();
		});
	})
	function checkDel(){
		var flag=confirm("是否删除");
		if(flag){
			return true;
		}
		return false;
	}
	function checkVerify(){
		var flag=confirm("是否审核为正常用户");
		if(flag){
			return true;
		}
		return false;
	}
</script>
</head>
<body style="position:relative;">
<!--main_top-->
<table width="99%" border="0" cellspacing="0" cellpadding="0" id="searchmain">
  <tr>
    <td width="99%" align="left" valign="top">您的位置：用户管理>用户列表</td>
  </tr>
  <tr>
    <td align="left" valign="top">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="search">
  		<tr>
   		 <td width="90%" align="left" valign="middle">
	         <form method="post" action="listusers">
	         <span>姓名：</span>
	         <input type="text" name="name"  class="text-word">
	         <span>联系方式：</span>
	         <input type="text" name="tel"  class="text-word">
	         <input name="" type="submit" value="查询" class="text-but">
	         </form>
         </td>
  		  <td width="10%" align="center" valign="middle" style="text-align:right; width:150px;"><a href="add.html" target="mainFrame" onFocus="this.blur()" class="add">新增用户</a></td>
  		</tr>
	</table>
    </td>
  </tr>
  <tr>
    <td align="left" valign="top">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab">
    <thead>
      <tr>
        <th align="center" valign="middle" class="borderright">
        	编号
        </th>
        <th align="center" valign="middle" class="borderright">姓名</th>
        <th align="center" valign="middle" class="borderright">头像</th>
        <th align="center" valign="middle" class="borderright">性别</th>
        <th align="center" valign="middle" class="borderright">电话</th>
       	<th align="center" valign="middle" class="borderright">状态</th>
        <th align="center" valign="middle">操作</th>
      </tr>
      </thead>
      <tbody>
      		<tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
       			<td align="center" valign="middle" class="borderright borderbottom">1</td>
        		<td align="center" valign="middle" class="borderright borderbottom">张三</td>
        		<td align="center" valign="middle" class="borderright borderbottom">
        			<img alt="头像" class="headimg" width="30px" height="30px" src="../../image/headimgs/x2.jpg" onerror="">
        		</td>	
        		<td align="center" valign="middle" class="borderright borderbottom">男</td>
        		<td align="center" valign="middle" class="borderright borderbottom">123</td>
        		<td align="center" valign="middle" class="borderright borderbottom">
        			<font color="#FFA500">待审核</font>
        		</td>
        		<td align="center" valign="middle" class="borderbottom">
        		<a href="user_detail.jsp" target="mainFrame" onFocus="this.blur()" class="add">查看</a><span class="gray">&nbsp;|&nbsp;</span>
        		<a href="#" target="mainFrame" onFocus="this.blur()" class="add" onclick="return checkVerify()" >审核</a><span class="gray">&nbsp;|&nbsp;</span>
        		<a href="user_update.jsp" target="mainFrame" onFocus="this.blur()" class="add">编辑</a><span class="gray">&nbsp;|&nbsp;</span>
        		<a href="#" target="mainFrame" onFocus="this.blur()" class="add" onclick="return checkDel()">删除</a></td>
   		   </tr>
      </tbody>
     
    </table></td>
    </tr>
  <tr>
			<td align="center" valign="top" class="fenye">
				<p align="center">
					总记录:10 [1/5] <a href="">首页</a> <a href="">上一页</a>
					1&nbsp;2&nbsp;3&nbsp;4&nbsp;5 <a href="">下一页</a> <a href="">尾页</a>
				</p>
			</td>
		</tr>
</table>
</body>
</html>