<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>发布通知</title>
<link href="../css/commons.css"  rel="stylesheet" >
</head>
<body>
	<!--main_top-->
	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">	
		<tr>
			<td width="99%" align="left" valign="top">您的位置：系统管理&nbsp;&nbsp;>&nbsp;&nbsp;发布通知</td>
		</tr>
		<tr>
			<td align="left" valign="top" id="addinfo"></td>
		</tr>
		<tr>
			<td align="left" valign="top">
			<form action="add" method="post">
					<input type="hidden" name="sys_uid" value="${user.sys_uid }">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						id="main-tab">
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="left" valign="middle" colspan="4" class="borderright borderbottom bggray">
								<span style="float:left">标题:</span>
								<input type="text" name="title" class="text-word" style="width: 300px;">	
							</td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="left" valign="middle" colspan="4"
								class="borderright borderbottom bggray">内容：</td>
							
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="left" valign="middle" colspan="4"
								class="borderright borderbottom main-for" style="height: 300px;">
							<textarea rows="20" cols="100" name="content"></textarea>	
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="left" valign="middle" class="borderright borderbottom main-for" colspan="4">
								<input name="" type="submit" value="提交" class="text-but"> 
								<input name="" type="reset" value="重置" class="text-but">
								<input name="" type="button" value="返回上一层" class="text-but" onclick="javascript:history.go(-1)">
							</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>