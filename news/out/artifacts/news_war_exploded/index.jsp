<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>


<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>新闻中国</title>
    <link href="${base}/css/main.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript">
        function check() {
            var login_username = document.getElementById("uname");
            var login_password = document.getElementById("upwd");
            if (login_username.value == "") {
                alert("用户名不能为空！请重新填入！");
                login_username.focus();
                return false;
            } else if (login_password.value == "") {
                alert("密码不能为空！请重新填入！");
                login_password.focus();
                return false;
            }
            return true;
        }

        function focusOnLogin() {
            var login_username = document.getElementById("uname");
            login_username.focus();
        }

        function register() {
            location.href = "${base}/register.jsp";
        }
    </script>
    <c:if test="${t==null}">
        <jsp:forward page="/doNewsServlet?pre=showNewsByTopic"/>
    </c:if>
</head>

<body>

<div id="header">
    <div id="top_login">
        <form action="${base}/doUsersServlet?pre=login" method="post" onsubmit="return check()">
            <label> 登录名 </label>
            <input type="text" name="uname" value="" class="login_input"/>
            <label> 密&#160;&#160;码 </label>
            <input type="password" name="upwd" value="" class="login_input"/>
            <input type="submit" class="login_sub" value="登录"/>

            <label id="error"> </label>

        </form>
        <input type="submit" class="login_sub" onclick="register()" value="注册"/>
        <img src="${base}/images/friend_logo.gif" alt="Google" id="friend_logo"/>

    </div>
    <div id="nav">
        <div id="logo"><img src="${base}/images/logo.jpg" alt="新闻中国"/></div>
        <div id="a_b01"><img src="${base}/images/a_b01.gif" alt=""/></div>
        <!--mainnav end-->
    </div>
</div>

<div id="container">
    <%@include file="index-elements/index_sidebar.jsp" %>
    <div class="main">
        <div class="class_type"><img src="${base}/images/class_type.gif" alt="新闻中心"/></div>
        <div class="content">
            <ul class="class_date">
                <li id='class_month'>
                    <c:forEach var="to" items="${t}">
                        <a href="${base}/doNewsServlet?pre=showNewsByTopic&tid=${to.id}">
                            <b>${to.topicName} </b>
                        </a>
                    </c:forEach>
                </li>
            </ul>
            <ul class="classlist">
                <c:forEach var="n" items="${p.list}">
                    <li>
                            ${n.title}
                            ${n.author}
                    </li>
                </c:forEach>

                <p align="right"> 当前页数:[${p.pageIndex}/${p.totalPage}]
                    <c:choose>
                        <c:when test="${p.pageIndex<=1}">
                            <a href="#">首页</a>
                            <a href="#">上一页</a>
                        </c:when>
                        <c:otherwise>
                            <a href="${base}/doNewsServlet?pre=showNewsByTopic&pageIndex=1&tid=${t.id}">首页</a>
                            <a href="${base}/doNewsServlet?pre=showNewsByTopic&pageIndex=${p.pageIndex-1}&tid=${t.id}">上一页</a>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${p.pageIndex>=p.totalPage}">
                            <a href="#">下一页</a>
                            <a href="#">尾页</a>
                        </c:when>
                        <c:otherwise>
                            <a href="${base}/doNewsServlet?pre=showNewsByTopic&pageIndex=${p.pageIndex+1}&tid=${t.id}">下一页</a>
                            <a href="${base}/doNewsServlet?pre=showNewsByTopic&pageIndex=${p.totalPage}&tid=${t.id}">尾页</a>
                        </c:otherwise>
                    </c:choose>


                    [当前页数：${p.pageIndex}/总页数：${p.totalPage}/总条数：${p.totalCount}]

                </p>
            </ul>
        </div>
        <%@include file="index-elements/index_rightbar.html" %>
    </div>
    <%@include file="index-elements/index_bottom.html" %>
</div>

</body>
</html>
