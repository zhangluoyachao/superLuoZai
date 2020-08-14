<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修改用户信息</title>
<link href="../css/commons.css"  rel="stylesheet" >
</head>
<body>
	<!--main_top-->
	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">	
		<tr>
			<td width="99%" align="left" valign="top">您的位置：用户管理&nbsp;&nbsp;>&nbsp;&nbsp;修改用户信息</td>
		</tr>
		<tr>
			<td align="left" valign="top" id="addinfo"></td>
		</tr>
		<tr>
			<td align="left" valign="top">
				<form action="updateUser" enctype="multipart/form-data" method="post">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						id="main-tab">
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">姓名(*)：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for"><input
								type="text" name="name"  class="text-word"></td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">头像：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<img alt="头像" width="60px" height="60px" src="../../image/headimgs/x2.jpg">
								<input type="file" name="himg" class="text-word"></td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">密码(*)：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for"><input
								type="text" name="password"  class="text-word">
							</td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">确认密码(*)：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for"><input
								type="text" name="password2"  class="text-word">
							</td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">身份证号(*)：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for"><input
								type="text" name="idnumber"   class="text-word"></td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">性别：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<input type="radio" name="sex" value="男"  checked>男 
								<input type="radio" name="sex" value="女">女</td>
						</tr>

						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">联系方式(*)：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for"><input
								type="text" name="tel"   class="text-word"></td>

						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">电子邮箱：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<input
								type="text" name="email"    class="text-word"></td>
						</tr>
						
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">状态：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<select class="text-word" name="status">
									<option value="0" >待审核</option>
									<option value="1"  >冻结状态</option>
									<option value="2"  selected>正常状态</option>
								</select>
								
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="left" valign="middle" class="borderright borderbottom main-for" colspan="2">
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