<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>添加主题--管理后台</title>
    <link href="../css/admin.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="header">
    <div id="welcome">
        欢迎使用新闻管理系统！
    </div>
    <div id="nav">
        <div id="logo"><img src="../images/logo.jpg" alt="新闻中国"/></div>
        <div id="a_b01"><img src="../images/a_b01.gif" alt=""/></div>
    </div>
</div>
<div id="admin_bar">
    <div id="status">管理员： ${user.username} &#160;&#160;&#160;&#160; <a href="newspage/login.jsp?action=loginout">login
        out</a></div>
    <div id="channel"></div>
</div>
<div id="main">
    <%@include file="console_element/left.html" %>
    <div id="opt_area">
        <ul class="classlist">
            <c:forEach items="${requestScope.list}" var="t">
                <li>
                    &#160;&#160;&#160;&#160; ${t.topicName} &#160;&#160;&#160;&#160;
                    <a href='topic_modify.jsp?oldtname=${t.topicName}'>修改</a>
                    &#160;&#160;&#160;&#160;
                    <a href='topoc_delete_console.jsp?tname=${t.topicName}'>删除</a>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
<div id="footer">
</div>
</body>
</html>
