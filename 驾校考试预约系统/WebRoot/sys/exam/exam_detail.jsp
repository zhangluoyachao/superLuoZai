<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>查看考试信息</title>
<link href="../css/commons.css" rel="stylesheet">
<script type="text/javascript" src="../../js/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".headimg").hover(function(e) {
			var x = e.originalEvent.x + 50;
			var y = e.originalEvent.y - 30;
			var offsetX = 20 - $(this).offset().left;
			var offsetY = 20 - $(this).offset().top;
			var src = $(this).attr("src");
			$("<img src="+src+" class='disimg'/>").css({
				"position" : "absolute",
				"width" : "200px",
				"height" : "200px",
				"top" : y,
				"left" : x,
				"display" : "none",
			}).appendTo("table").fadeIn(800);
		}, function() {
			$(".disimg").remove();
		});
	})
</script>
</head>
<body>
	<!--main_top-->
	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">
		<tr>
			<td width="99%" align="left" valign="top">您的位置：考试管理&nbsp;&nbsp;>&nbsp;&nbsp;查看考试信息</td>
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
							colspan="8">考试信息：</td>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						sonMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">科目：</td>
						<td align="letf" valign="middle"
							class="borderright borderbottom main-for">科目1</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">考试时间：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">2018-08-09
							12:00:00</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">考试人数：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">23</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">已预约人数：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">22</td>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="left" class="borderright borderbottom bggray title"
							colspan="8">考场信息：</td>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						sonMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">考场名：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">点点滴滴</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">考场地址：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">弹道导弹核潜艇</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray">联系方式：</td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for">1232323232</td>
						<td align="right" valign="middle"
							class="borderright borderbottom bggray"></td>
						<td align="left" valign="middle"
							class="borderright borderbottom main-for"></td>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="left" class="borderright borderbottom bggray title"
							colspan="8">该场考试用户信息：</td>
					</tr>

				</table>
			</td>
		<tr>
			<table width="100%" id="main-tab">
				<thead>
					<tr>
						<th align="center" valign="middle" class="borderright">编号</th>
						<th align="center" valign="middle" class="borderright">姓名</th>
						<th align="center" valign="middle" class="borderright">头像</th>
						<th align="center" valign="middle" class="borderright">性别</th>
						<th align="center" valign="middle" class="borderright">电话</th>
						<th align="center" valign="middle">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="center" valign="middle"
							class="borderright borderbottom">1</td>
						<td align="center" valign="middle"
							class="borderright borderbottom">长春</td>
						<td align="center" valign="middle"
							class="borderright borderbottom"><img alt="头像"
							class="headimg" width="30px" height="30px"
							src="../../image/headimgs/x1.jpg"></td>
						<td align="center" valign="middle"
							class="borderright borderbottom">男</td>
						<td align="center" valign="middle"
							class="borderright borderbottom">123232322</td>
						<td align="center" valign="middle" class="borderbottom"><a
							href="#" target="mainFrame" onFocus="this.blur()" class="add">查看</a><span
							class="gray">&nbsp;|&nbsp;</span> <a href="#" target="mainFrame"
							onFocus="this.blur()" class="add">编辑</a>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="center" valign="middle"
							class="borderright borderbottom">1</td>
						<td align="center" valign="middle"
							class="borderright borderbottom">长春</td>
						<td align="center" valign="middle"
							class="borderright borderbottom"><img alt="头像"
							class="headimg" width="30px" height="30px"
							src="../../image/headimgs/x1.jpg"></td>
						<td align="center" valign="middle"
							class="borderright borderbottom">男</td>
						<td align="center" valign="middle"
							class="borderright borderbottom">123232322</td>
						<td align="center" valign="middle" class="borderbottom"><a
							href="#" target="mainFrame" onFocus="this.blur()" class="add">查看</a><span
							class="gray">&nbsp;|&nbsp;</span> <a href="#" target="mainFrame"
							onFocus="this.blur()" class="add">编辑</a>
					</tr>
					<tr onMouseOut="this.style.backgroundColor='#ffffff'"
						onMouseOver="this.style.backgroundColor='#edf5ff'">
						<td align="center" valign="middle"
							class="borderright borderbottom">1</td>
						<td align="center" valign="middle"
							class="borderright borderbottom">长春</td>
						<td align="center" valign="middle"
							class="borderright borderbottom"><img alt="头像"
							class="headimg" width="30px" height="30px"
							src="../../image/headimgs/x1.jpg"></td>
						<td align="center" valign="middle"
							class="borderright borderbottom">男</td>
						<td align="center" valign="middle"
							class="borderright borderbottom">123232322</td>
						<td align="center" valign="middle" class="borderbottom"><a
							href="#" target="mainFrame" onFocus="this.blur()" class="add">查看</a><span
							class="gray">&nbsp;|&nbsp;</span> <a href="#" target="mainFrame"
							onFocus="this.blur()" class="add">编辑</a>
					</tr>
				</tbody>
				<tr>
						<td align="center" valign="top" class="fenye">
							<p align="center">
								总记录:10 [1/5] <a href="">首页</a> <a href="">上一页</a>
								1&nbsp;2&nbsp;3&nbsp;4&nbsp;5 <a href="">下一页</a> <a href="">尾页</a>
							</p>
						</td>
					</tr>
				<tr onMouseOut="this.style.backgroundColor='#ffffff'"
					onMouseOver="this.style.backgroundColor='#edf5ff'">
					<td align="center" valign="middle"
						class="borderright borderbottom main-for" colspan="6"><input
						name="" type="button" value="返回上一层" class="text-but"
						onclick="javascript:history.go(-1)"></td>
				</tr>
			</table>
		</tr>
	</table>

</body>
</html>