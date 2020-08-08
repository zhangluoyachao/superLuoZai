<%@ page import="pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/7
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User();
    session.setAttribute("user", user);
%>
set:
用于给四大作用域存值 相当于 作用域.setAttribute(key,value)<br>
<c:set var="key" value="value" scope="session"></c:set>

给对象的属性赋值
<c:set value="值" property="id" target="${user}"></c:set>
注：target 对象
对象必须在作用域中存在，如果直接写对象名 target="user"则表示一个字符串对象
要使其表达user对象需要配合EL表达式：target="${user}"
${key}

remove:删除某一个作用域的值
<c:set var="one" value="session" scope="session"></c:set>
<c:set var="one" value="request" scope="request"></c:set>

<c:remove var="one" scope="request"></c:remove>
scope表示删除的作用域

<c:remove var="one"></c:remove>
如果没有作用域，表示删除所有域中的var

out:
输出指定内容，可以固定，可以输出作用域中的内容
<c:out value="" default="123"></c:out>
当value 为空时，显示默认值

<c:out value="" default="" escapeXml="是否渲染"></c:out>
如果值为HTML标签，不会被渲染
需要escapeXml = “y” 才能被渲染成HTML标签
escapeXml y/n yes/no

if choose foreach
if:类似于java中的if
<c:if test="条件">
    执行的操作
</c:if>
<%--假设作用域存储一个值表示状态,已读绿色,未读白色
1 可以标签嵌套<p <c:if test=""></c:if>> </p>
2 正常使用 同java 可以使用EL表达式的三目代替
--%>
<p <c:if test="true">class="c1"</c:if>>这是段落</p>
<div class="c1">
    这是一个区域标签
</div>


choose 类似 jva 中if else
<c:choose>
    <c:when test="条件1"></c:when> <%--if--%>
    <c:when test="条件2"></c:when> <%--if else--%>
    <c:when test="条件3"></c:when>
    <c:when test="条件4"></c:when>
    <c:otherwise></c:otherwise> <%--其他条件--%>
</c:choose>
</body>
</html>
