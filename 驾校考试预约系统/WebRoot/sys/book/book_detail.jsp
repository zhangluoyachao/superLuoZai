<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查看预约信息</title>
<link href="../css/commons.css"  rel="stylesheet" >
</head>
<body>
	<!--main_top-->
	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">
		<tr>
			<td width="99%" align="left" valign="top">您的位置：预约管理&nbsp;&nbsp;>&nbsp;&nbsp;查看预约信息</td>
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
						<td align="left" class="borderright borderbottom bggray title"
							colspan="6">用户信息：</td>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">姓名(*)：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">流川枫</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">性别：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">男</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">联系方式：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">123123123132</td>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">邮箱：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">12312313@qq.com</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">身份证号</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">
							123123123123123123123</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">照片：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for"><img alt="照片"
							width="80px" height="80px" src=""></td>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="left" valign="middle"
							class="borderright borderbottom bggray title" colspan="6">考试信息：</td>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">科目：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">科目1</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">考试时间：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">2018-08-09
							12:00:00</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">考试人数：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">25</td>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="left" valign="middle"
							class="borderright borderbottom bggray title" colspan="6">考场信息：</td>
					</tr>
					<tr>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">考场：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">蓝天驾校</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">地址：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">江西省南昌市蓝天驾校</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">联系方式：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">1231234578</td>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="center" valign="middle" colspan="6"
							class="borderright borderbottom main-for"><input name=""
							type="button" value="返回上一页" class="text-but"
							onclick="javascript:history.go(-1)">
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>