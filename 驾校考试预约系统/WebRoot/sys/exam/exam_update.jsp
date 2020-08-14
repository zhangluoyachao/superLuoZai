<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-control" content="no-cache">
<meta http-equiv="Cache" content="no-cache">
<title>编辑考试信息</title>
<link href="../css/commons.css"  rel="stylesheet" >
<script type="text/javascript" src="${basePath}js/jquery-3.0.0.min.js"></script>
<!--引入日期组件  -->
<script type="text/javascript" src="${basePath}js/datepicker/WdatePicker.js"></script>
</head>
<body>
	<!--main_top-->
	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">
		<tr>
			<td width="99%" align="left" valign="top">您的位置：考试管理&nbsp;&nbsp;>&nbsp;&nbsp;编辑考试信息</td>
		</tr>
		<tr>
			<td align="left" valign="top" id="addinfo"></td>
		</tr>
		<tr>
			<td align="left" valign="top">
				<form action="addExam" enctype="multipart/form-data" method="post">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						id="main-tab">
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">姓名(*)：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<select name="subject" class="text-word">
									<option value="科目一" >科目一</option>
	         						<option value="科目二" >科目二</option>
	         						<option value="科目三" >科目三</option>
	         						<option value="科目四" >科目四</option>
								</select>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">考试时间：</td>
							<td align="left" valign="middle" class="borderright borderbottom main-for">
							<input type="text" id="time" name="time" 
								class="s_text text-word" style="width:160px;" onfocus="WdatePicker({skin:'whyGreen',dateFmt: 'yyyy-MM-dd HH:mm:ss'})" />
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">考场：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<select name="epid" class="text-word">
										<option>请选择</option>
										<option >考场1</option>
										<option >考场2</option>
										<option >考场3</option>
								</select>
							</td>
						</tr>
						
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">人数：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<input type="text" name="number" class="text-word" ></td>
						</tr>
 						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">&nbsp;</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
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