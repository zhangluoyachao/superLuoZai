<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查看通知</title>
<link href="../css/commons.css"  rel="stylesheet" >
</head>
<body>
	<!--main_top-->
	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">	
		<tr>
			<td width="99%" align="left" valign="top">您的位置：系统管理&nbsp;&nbsp;>&nbsp;&nbsp;查看通知</td>
		</tr>
		<tr>
			<td align="left" valign="top" id="addinfo"></td>
		</tr>
		<tr>
			<td align="left" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						id="main-tab">
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="left" valign="middle" colspan="4" class="borderright borderbottom bggray">
								标题:	
							</td>
							
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="left" valign="middle"
								class="borderright borderbottom bggray">发布时间：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								
							</td>
							<td align="left" valign="middle"
								class="borderright borderbottom bggray">发布人</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								
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
								
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="left" valign="middle" class="borderright borderbottom main-for" colspan="4">
								<input name="" type="button" value="返回上一层" class="text-but" onclick="javascript:history.go(-1)">
							</td>
						</tr>
					</table>
			</td>
		</tr>
	</table>
</body>
</html>