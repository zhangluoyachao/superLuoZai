<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修改管理员信息</title>
<link href="../css/commons.css"  rel="stylesheet" >
</head>
<body>
	<!--main_top-->
	<table width="99%" border="0" cellspacing="0" cellpadding="0"
		id="searchmain">	
		<tr>
			<td width="99%" align="left" valign="top">您的位置：管理员管理&nbsp;&nbsp;>&nbsp;&nbsp;修改管理员信息</td>
		</tr>
		<tr>
			<td align="left" valign="top" id="addinfo"></td>
		</tr>
		<tr>
			<td align="left" valign="top">
				<form action="updateSysUser" method="post">
					<input type="hidden" name="uid" value="${sysu.sys_uid }">
					<table width="100%" border="0" cellspacing="0" cellpadding="0"
						id="main-tab">
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">姓名(*)：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<input type="text" name="name" value="${sysu.name }" class="text-word"></td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">账户：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<input type="text" name="account" class="text-word" value="${sysu.account }"></td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">密码(*)：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for"><input
								type="text" name="password" value="${sysu.password}" class="text-word">
							</td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">权限</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<select class="text-word" name="permission">
									<option value="1" <c:if test="${sysu.permission==1}">selected</c:if> >超级管理员</option>
									<option value="2" <c:if test="${sysu.permission==2}">selected</c:if> >管理员</option>
								</select>
							</td>
						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">性别：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<input type="radio" name="sex" value="男" <c:if test="${sysu.sex=='男'}">checked</c:if>>男 
								<input type="radio" name="sex" value="女" <c:if test="${sysu.sex=='女'}">checked</c:if>>女</td>
						</tr>

						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">联系方式(*)：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for"><input
								type="text" name="tel" value="${sysu.tel }" class="text-word"></td>

						</tr>
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">电子邮箱：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<input
								type="text" name="email" value="${sysu.email }" class="text-word"></td>
						</tr>
						
						<tr onMouseOut="this.style.backgroundColor='#ffffff'"
							onMouseOver="this.style.backgroundColor='#edf5ff'">
							<td align="right" valign="middle"
								class="borderright borderbottom bggray">状态：</td>
							<td align="left" valign="middle"
								class="borderright borderbottom main-for">
								<select class="text-word" name="status">
									<option value="0" <c:if test="${sysu.status==0}">selected</c:if> >已过期</option>
									<option value="1" <c:if test="${sysu.status==1}">selected</c:if> >正常状态</option>
									<option value="2" <c:if test="${sysu.status==2}">selected</c:if> >已过期</option>
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