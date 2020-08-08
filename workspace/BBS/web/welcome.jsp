<%@ page import="pojo.BBSUser" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function time() {
            var d = new Date();
            var year = d.getFullYear();
            var month = d.getMonth();
            var day = d.getDay();
            var hours = d.getHours();
            var minutes = d.getMinutes();
            var sec = d.getSeconds();
            if (sec < 10)
                sec = "0" + sec;

            if (hours < 10)
                hours = "0" + hours;

            if (minutes < 10)
                minutes = "0" + minutes;

            var time = year + "-" + month + "-" + day + " " + hours + ":" + minutes + ":" + sec;

            document.getElementById("time").innerHTML = time;
        }

        setInterval("time()", 1000);

    </script>
</head>
<body onload="time()">
<%@include file="WEB-INF/isLogin.jsp" %>
<%
    BBSUser user = (BBSUser) session.getAttribute("user");
    String nkn = user.getNickName();
%>
<div>
    <span><%=nkn%>，你好！</span>
    <span id="time"></span>
    <a style="padding-left: 20px" href="createTopic.jsp">我要发贴</a>
    <a style="padding-left: 20px" href="userTopic_control.jsp">我的发帖</a>
</div>
</body>
</html>
