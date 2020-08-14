<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-control" content="no-cache">
<meta http-equiv="Cache" content="no-cache">
<title>新增考场</title>
<link href="../../css/commons.css"  rel="stylesheet" >
</head>
<body>
	<!--main_top-->
	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">
		<tr>
			<td width="99%" align="left" valign="top">您的位置：考试管理&nbsp;&nbsp;>&nbsp;&nbsp;添加考场</td>
		</tr>
		<tr>
			<td align="left" valign="top" id="addinfo"></td>
		</tr>
		<tr>
			<td align="left" valign="top">
				<form action="${basePath}sys/exam/exampoint/add"  method="post">
				
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						id="main-tab">
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">考场名：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
							<input type="text" name="epname" class="text-word"></td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">考场地址：</td>
							<td align="left" valign="middle" class="borderright borderbottom main-for">
							<input type="text" name="loc" class="text-word"></td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">联系电话：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
						<input type="text" name="tel" class="text-word"></td>
							</td>
						</tr>
					
 						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">&nbsp;</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for"><input name=""
								type="submit" value="提交" class="text-but"> <input
								name="" type="reset" value="重置" class="text-but"></td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>