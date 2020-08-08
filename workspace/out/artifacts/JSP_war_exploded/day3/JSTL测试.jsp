<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/7
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .c1{
            background-color: hotpink;
        }
    </style>
</head>
<body>
<c:set var="status" value="1" scope="session"></c:set>
<c:if test="">

</c:if>
<%--假设作用域存储一个值表示状态,已读绿色,未读白色
1 可以标签嵌套<p <c:if test=""></c:if>> </p>
2 正常使用 同java 可以使用EL表达式的三目代替
--%>
<p <c:if test="true">class="c1"</c:if>>这是段落</p>
<div class="c1">
    这是一个区域标签
</div>
<%
    request.setAttribute("name","123");
%>
<c:choose>
    <c:when test="${name == 'user'}">
       用户
    </c:when>
    <c:when test="${name == 'vip'}">
        VIP
    </c:when>
    <c:otherwise> 游客</c:otherwise>
</c:choose>
</body>
</html>
