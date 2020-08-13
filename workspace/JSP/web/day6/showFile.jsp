<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/13
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>上传文件列表</h1>
<table border="1" cellpadding="10" cellspacing="0">

    <c:forEach var="f" items="${fileName}">
        <tr>
            <td>${f}</td>
            <td>
                <a href="/up?pre=delFile&fileName=${f}">删除</a>
                <a href="/up?pre=download&fileName=${f}">下载</a>
            </td>
        </tr>

    </c:forEach>

</table>
<!--
    简单的下载功能：通过超链接写入项目中的路径
    如果访问的文件格式 浏览器不能识别，就会提供下载 自己动
    <a href="/upload/文件名">下载</a>
-->

</body>
</html>
