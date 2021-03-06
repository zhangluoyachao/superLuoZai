<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>考试列表</title>
<link href="../css/commons.css"  rel="stylesheet" >
<script type="text/javascript" src="../../js/jquery-3.0.0.min.js"></script>
<!--引入日期组件  -->
<script type="text/javascript"
	src="../../js/datepicker/WdatePicker.js"></script>
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
			<td width="99%" align="left" valign="top">您的位置：考试管理&gt;考试列表</td>
		</tr>
		<tr>
			<td align="left" valign="top">
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					id="search">
					<tr>
						<td width="90%" align="left" valign="middle">
							<form method="post" action="">
								<span>科目：</span> <select name="subject" class="text-word">
									<option value="">全部科目</option>
									<option value="科目一">科目一</option>
									<option value="科目二">科目二</option>
									<option value="科目三">科目三</option>
									<option value="科目四">科目四</option>
								</select> <span>考场：</span> <input type="text" name="exampoint.epname"
									class="text-word">
								<span>考试时间：</span> <input type="text" id="startDate"
									name="startDate" class="s_text text-word" style="width:160px;"
									onfocus="WdatePicker({skin:'whyGreen',dateFmt: 'yyyy-MM-dd HH:mm:ss'})" />
								<span>--&nbsp;&nbsp;</span> <input type="text" id="endDate"
									name="endDate" class="s_text text-word" style="width:160px;"
									onfocus="WdatePicker({skin:'whyGreen',dateFmt: 'yyyy-MM-dd HH:mm:ss'})" />
								<input name="" type="submit" value="查询" class="text-but">
							</form>
						</td>
						<td width="10%" align="center" valign="middle"
							style="text-align:right; width:150px;"><a
							href="exam_add.jsp" target="mainFrame" onFocus="this.blur()"
							class="add">添加考试</a></td>
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
							<th align="center" valign="middle" class="borderright">科目</th>
							<th align="center" valign="middle" class="borderright">考试时间</th>
							<th align="center" valign="middle" class="borderright">考场</th>
							<th align="center" valign="middle" class="borderright">考试地点</th>
							<th align="center" valign="middle" class="borderright">人数</th>
							<th align="center" valign="middle" class="borderright">已预约人数</th>
							<th align="center" valign="middle">操作</th>
						</tr>
					</thead>
					<tbody>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="center" valign="middle"
								class="borderright borderbottom">1</td>
							<td align="center" valign="middle"
								class="borderright borderbottom">科目1</td>
							<td align="center" valign="middle"
								class="borderright borderbottom">2018-08-09 12:00:00</td>
							<td align="center" valign="middle"
								class="borderright borderbottom">尺寸</td>
							<td align="center" valign="middle"
								class="borderright borderbottom">蓝天驾校</td>
							<td align="center" valign="middle"
								class="borderright borderbottom">25</td>
							<td align="center" valign="middle"
								class="borderright borderbottom">23</td>
							<td align="center" valign="middle" class="borderbottom"><a
								href="exam_detail.jsp" target="mainFrame" onFocus="this.blur()"
								class="add">查看</a><span class="gray">&nbsp;|&nbsp;</span> <a
								href="exam_update.jsp" target="mainFrame" onFocus="this.blur()"
								class="add">编辑</a><span class="gray">&nbsp;|&nbsp;</span> <a
								href="#" target="mainFrame" onFocus="this.blur()" class="add"
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
