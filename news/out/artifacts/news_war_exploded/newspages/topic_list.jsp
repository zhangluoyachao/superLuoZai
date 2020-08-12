<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>添加主题--管理后台</title>
    <link href="${base}/css/admin.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="header">
    <div id="welcome">
        欢迎使用新闻管理系统！
    </div>
    <div id="nav">
        <div id="logo"><img src="${base}/images/logo.jpg" alt="新闻中国"/></div>
        <div id="a_b01"><img src="${base}/images/a_b01.gif" alt=""/></div>
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
        <script language="javascript">
            function clickDel() {
                return confirm("删除请点击确认");
            }
        </script>
        <ul class="classlist">
            <c:if test="${page.list!=null}">
                <c:forEach items="${page.list}" var="t">
                    <li>
                        &#160;&#160;&#160;&#160; ${t.topicName} &#160;&#160;&#160;&#160;
                        <a href="${base}/newspages/topic_modify.jsp?&tid=${t.id}">修改</a>
                        &#160;&#160;&#160;&#160;
                        <a href="${base}/doTopicServlet?pre=delete&tid=${t.id} "
                           onclick='return clickDel()'>删除</a>
                    </li>
                </c:forEach>
            </c:if>
        </ul>
        <!--触发事件，域改变事件 onchange-->
        <script type="text/javascript">
            function change() {
                var count = document.getElementById("pageSize").value;
                location.href = "${base}/doTopicServlet?pageSize=" + count;
            }
        </script>
        <select onchange="change()" id="pageSize">
            <option STYLE="display: none" value="0" selected="selected"></option>
            <option value="5">5</option>
            <option value="10">10</option>
            <option value="15">15</option>
            <option value="20">20</option>
            <option value="25">25</option>
        </select>
        <a href="${base}/doTopicServlet?pageIndex=1">首页</a>
        <a href="${base}/doTopicServlet?pageIndex=${page.pageIndex-1}">上一页</a>
        <a href="${base}/doTopicServlet?pageIndex=${page.pageIndex+1}">下一页</a>
        <a href="${base}/doTopicServlet?pageIndex=${page.totalPage}">尾页</a>
        当前页：${page.pageIndex}/总页数：${page.totalPage} 总记录数：${page.totalCount}

        <script type="text/javascript">
            function onclick1() {
                var index = document.getElementById("pageIndex").value;
                if (index <= 0) {
                    index = 1;
                }
                if (index >${page.totalPage}) {
                    index =  ${page.totalPage};
                }
                location.href = "${base}/doTopicServlet?pageIndex=" + index;
            }
        </script>

        <input style="width: 15px" id="pageIndex" value=""/>页
        <input type="submit" name="submit" onclick="onclick1()" value="查询"/>

    </div>
</div>
<div id="footer">
</div>
</body>
</html>
