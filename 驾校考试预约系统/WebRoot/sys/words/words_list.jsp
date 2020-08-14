<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>留言列表</title>
<link href="../css/commons.css"  rel="stylesheet" >
<script type="text/javascript">
	function checkDel(){
		var flag=confirm("是否删除");
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
    <td width="99%" align="left" valign="top">您的位置：留言管理&gt;留言列表</td>
  </tr>
  <tr>
    <td align="left" valign="top">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="search">
  		<tr>
   		 <td width="90%" align="left" valign="middle">
	         <form method="post" action="listwords">
	         	<span>留言人：</span>
	         	 <input type="text" name="name"  class="text-word">
	         	 <span>留言标题或内容：</span>
	         	 <input type="text" name="context"  class="text-word">
	         	<input name="" type="submit" value="查询" class="text-but" >
	         </form>
         </td>
  		</tr>
	</table>
    </td>
  </tr>
  <tr>
    <td align="left" valign="top">
    
    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab" style="text-align: center;">
    <thead>
      <tr style="text-align: center;">
        <th align="center" valign="middle" class="borderright">
        	编号
        </th>
        <th align="center" valign="middle" class="borderright">标题</th>
        <th align="center" valign="middle" class="borderright">简介</th>
        <th align="center" valign="middle" class="borderright">留言时间</th>
        <th align="center" valign="middle" class="borderright">留言者</th>
        <th align="center" valign="middle">操作</th>
      </tr>
      </thead>
      <tbody>
      		<tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
       			<td align="center" valign="middle" class="borderright borderbottom">${index.count }</td>
        		<td align="center" valign="middle" class="borderright borderbottom">
        			终于考过了
        		</td>
        		<td align="center" valign="middle" class="borderright borderbottom">
        			留言内容，sdf阿什顿法拉盛大富科技阿斯兰的看法我终于考过了...
        		</td>
        		<td align="center" valign="middle" class="borderright borderbottom">
        			2015-05-08 12:12:12
        		</td>	
        		<td align="center" valign="middle" class="borderright borderbottom">李丽丽</td>
        		<td align="center" valign="middle" class="borderbottom">
	        		<a href="words_detail.jsp" target="mainFrame" onFocus="this.blur()" class="add">查看</a><span class="gray">&nbsp;|&nbsp;</span>
	        		<a href="words_detail.jsp" target="mainFrame" onFocus="this.blur()" class="add">回复</a><span class="gray">&nbsp;|&nbsp;</span>
	        		<a href="#" target="mainFrame" onFocus="this.blur()" class="add" onclick="return checkDel()">删除</a>
	        	</td>
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
