<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta http-equiv="expires" content="0"/>
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
    <meta http-equiv="description" content="This is my page"/>
    <title>管理后台</title>
    <link href="${base}/css/admin.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header">
    <div id="welcome">欢迎使用新闻管理系统！</div>
    <div id="nav">
        <div id="logo"><img src="${base}/images/logo.jpg" alt="新闻中国"/></div>
        <div id="a_b01"><img src="${base}/images/a_b01.gif" alt=""/></div>
    </div>
</div>
<div id="admin_bar">
    <div id="status">管理员： ${user.username} &#160;&#160;&#160;&#160; <a href="#">login out</a></div>
    <div id="channel"></div>
</div>
<div id="main">
    <%@include file="console_element/left.html" %>
    <div id="opt_area">
        <script language="javascript">
            function clickDel() {
                return confirm("删除请点击确认");
            }

        </script>
        <ul class="classlist">
            <c:if test="${p.list!=null}">
                <c:forEach items="${p.list}" var="t">
                    <li>
                        &#160;&#160;&#160;&#160; ${t.title} &#160;&#160;&#160;&#160;
                        <a href="#">修改</a>
                        &#160;&#160;&#160;&#160;
                        <a href="#" onclick='return clickDel()'>删除</a>
                    </li>
                </c:forEach>
            </c:if>
        </ul>
        <select>
            <option value="5">5</option>
            <option value="10">10</option>
            <option value="15">15</option>
            <option value="20">20</option>
        </select>
        <c:if test="${p.pageIndex<=1}">
            <a href="#">首页</a>
            <a href="#">上一页</a>
            <a href="${base}/doNewsServlet?pageIndex=${p.pageIndex+1}">下一页</a>
            <a href="${base}/doNewsServlet?pageIndex=${p.totalPage}">尾页</a>
        </c:if>
        <c:if test="${p.pageIndex>=p.totalPage}">
            <a href="${base}/doNewsServlet?pageIndex=1">首页</a>
            <a href="${base}/doNewsServlet?pageIndex=${p.pageIndex-1}">上一页</a>
            <a href="#">下一页</a>
            <a href="#">尾页</a>
        </c:if>
        <c:if test="${p.pageIndex>1 and p.pageIndex<p.totalPage}">
            <a href="${base}/doNewsServlet?pageIndex=1">首页</a>
            <a href="${base}/doNewsServlet?pageIndex=${p.pageIndex-1}">上一页</a>
            <a href="${base}/doNewsServlet?pageIndex=${p.pageIndex+1}">下一页</a>
            <a href="${base}/doNewsServlet?pageIndex=${p.totalPage}">尾页</a>
        </c:if>
        [当前页数：${p.pageIndex}/总页数：${p.totalPage}/总条数：${p.totalCount}]
        <input size="1"/>页
        <input type="submit" value="查询"/>

    </div>
</div>
<div id="footer">
</div>
</body>
</html>
