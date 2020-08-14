<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查看用户信息</title>
<link href="../css/commons.css"  rel="stylesheet" >
</head>
<body>
	<!--main_top-->
	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">
		<tr>
			<td width="99%" align="left" valign="top">您的位置：用户管理&nbsp;&nbsp;>&nbsp;&nbsp;查看用户信息</td>
		</tr>
		<tr>
			<td align="left" valign="top" id="addinfo"></td>
		</tr>
		<tr>
			<td align="left" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab">
						<tr onMouseOut="this.style.backgroundColor='#ffffff'" sonMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"  class="borderright borderbottom bggray">姓名：</td>
							<td align="letf" valign="middle" class="borderright borderbottom main-for">张三</td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'" sonMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle" class="borderright borderbottom bggray">性别：</td>
							<td align="left" valign="middle" class="borderright borderbottom main-for">男</td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'" sonMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle" class="borderright borderbottom bggray">联系方式：</td>
							<td align="left" valign="middle" class="borderright borderbottom main-for">123</td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle" class="borderright borderbottom bggray">邮箱：</td>
							<td align="left" valign="middle" class="borderright borderbottom main-for">123</td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'" sonMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle" class="borderright borderbottom bggray">身份证号</td>
							<td align="left" valign="middle" class="borderright borderbottom main-for">sdsdsd</td>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'" sonMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle" class="borderright borderbottom bggray">照片：</td>
							<td align="left" valign="middle" class="borderright borderbottom main-for">
							<img alt="照片" width="80px" height="80px"  src="../../image/headimgs/x2.jpg"></td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'" sonMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle" class="borderright borderbottom bggray">状态：</td>
							<td align="left" valign="middle" class="borderright borderbottom main-for">
									正常状态
							</td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle" class="borderright borderbottom bggray">考试成绩：</td>
							<td align="left" valign="middle" class="borderright borderbottom main-for">
								科目一：10
								科目二：20
								科目三：30
								科目四：40
							</td>
						</tr>
 						<tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="left" valign="middle" class="borderright borderbottom main-for" colspan="2">
								<input name="" type="button" value="返回上一层" class="text-but" onclick="javascript:history.go(-1)">
								<input name="" type="button" value="修改用户信息" class="text-but" onclick="javascript:location.href='user_update.jsp'">
							</td> 
						</tr>
					</table>
			</td>
		</tr>
	</table>
</body>
</html>