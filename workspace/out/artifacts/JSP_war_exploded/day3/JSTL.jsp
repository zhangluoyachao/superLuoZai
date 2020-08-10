<%@ page import="pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/7
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
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

forEach
<c:forEach var="" items="" step="" begin="" end="" varStatus="">

</c:forEach>

var:类似java foreach中的临时变量 或者 for中的i
begin:遍历开始的下标
end:遍历结束的下标
step：步长，隔几个遍历
items：用于指定遍历的集合或数组
varStatus：遍历对象的状态 count行号 index索引值

<!--
实现常规 for 循环
-->
<c:forEach var="i" begin="0" end="10" step="1" varStatus="vs">
    ${i}
    ${vs.count}
</c:forEach>
等同于
<%
    for (int i = begin; i <= end; i += step) {

    }
%>
注：count行号表示遍历了的第几次 index表示索引值，类似于i i可以省略
并且count是从1开始 index从begin开始
<!--
实现for each循环
-->
<c:forEach var="临时变量" items="${数组或者集合}">
    ${临时变量}
</c:forEach>

fmt
格式化数字
<fmt:formatNumber var="" value="" pattern=""
                  maxFractionDigits="" type="">

</fmt:formatNumber>
var:声明变量
value:指定格式化的数字
maxFractionDigits:指定保留几位小数，四舍五入
type:类型 number 数字 percent百分比 currency货币
注：先转换类型，再保留小数
value="0.988" maxFractionDigits="2" type = "percent"
==>98.80
格式日期
<fmt:formatDate value="">

</fmt:formatDate>
</body>
</html>
