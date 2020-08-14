<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>考场列表</title>
<link href="../../css/commons.css"  rel="stylesheet" >
<script type="text/javascript">
	function checkDel() {
		var flag = confirm("是否删除");
		if (flag) {
			return true;
		}
		return false;
	}
</script>
</head>
<body style="position:relative;">
	<!--main_top-->
	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">
		<tr>
			<td width="99%" align="left" valign="top">您的位置：考试管理&gt;考场列表</td>
		</tr>
		<tr>
			<td align="left" valign="top">
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					id="search">
					<tr>
						<td width="90%" align="left" valign="middle">
							<form method="post" action="exampoint_list.jsp">
								<span>考场名：</span> <input type="text" name="epname"
									class="text-word"> <span>地址：</span> <input type="text"
									name="loc" class="text-word"> <input name=""
									type="submit" value="查询" class="text-but">
							</form>
						</td>
						<td width="10%" align="center" valign="middle"
							style="text-align:right; width:150px;"><a
							href="exampoint_add.jsp" target="mainFrame" onFocus="this.blur()"
							class="add">添加考场</a></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td align="left" valign="top">

				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					id="main-tab" style="text-align: center;">
					<thead>
						<tr style="text-align: center;">
							<th align="center" valign="middle" class="borderright">编号</th>
							<th align="center" valign="middle" class="borderright">考场名</th>
							<th align="center" valign="middle" class="borderright">考场地址</th>
							<th align="center" valign="middle" class="borderright">联系方式</th>

							<th align="center" valign="middle">操作</th>
						</tr>
					</thead>
					<tbody>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="center" valign="middle"
								class="borderright borderbottom">1</td>
							<td align="center" valign="middle"
								class="borderright borderbottom">场地名称</td>
							<td align="center" valign="middle"
								class="borderright borderbottom">场地地址</td>
							<td align="center" valign="middle"
								class="borderright borderbottom">1234516121</td>
							<td align="center" valign="middle" class="borderbottom"><a
								href="exampoint_detail.jsp" target="mainFrame"
								onFocus="this.blur()" class="add">查看</a><span class="gray">&nbsp;|&nbsp;</span>
								<a href="exampoint_update.jsp" target="mainFrame"
								onFocus="this.blur()" class="add">编辑</a><span class="gray">&nbsp;|&nbsp;</span>
								<a href="#" target="mainFrame" onFocus="this.blur()" class="add"
								onclick="return checkDel()">删除</a></td>
						</tr>
					</tbody>

				</table>
			</td>
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
