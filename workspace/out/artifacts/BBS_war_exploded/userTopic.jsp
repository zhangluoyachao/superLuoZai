<%@ page import="pojo.BBSTopic" %>
<%@ page import="java.util.List" %>
<%@ page import="java.sql.Date" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="WEB-INF/isLogin.jsp" %>
<table border="1" cellpadding="10" cellspacing="0">
    <tr>
        <th>帖子ID</th>
            <th>帖子标题</th>
            <th>帖子内容</th>
            <th>浏览数量</th>
            <th>回复数量</th>
            <th>发帖时间</th>
            <th>发帖人ID</th>
            <th>最后回复时间</th>
            <th>最后回复人ID</th>
    </tr>
<%
    List<BBSTopic> list = (List<BBSTopic>)request.getAttribute("list");
    for (BBSTopic bbsTopic :list) {
        int tid= bbsTopic.getTid();
        String ttitle = bbsTopic.getTitle();
        int viewcount = bbsTopic.getViewCount();
        int replycount = bbsTopic.getReplyCount();
        int createuser = bbsTopic.getCreateUser();
        Date createtime = bbsTopic.getCreateTime();
        Date lastreplytime = bbsTopic.getLastReplyTime();
        int lastreplyuser = bbsTopic.getLastReplyUser();
        String tcontent = bbsTopic.gettContent();
%>
    <tr>
        <td><%=tid%></td>
        <td><%=ttitle%></td>
        <td><%=viewcount%></td>
        <td><%=replycount%></td>
        <td><%=createuser%></td>
        <td><%=createtime%></td>
        <td><%=lastreplytime%></td>
        <td><%=lastreplyuser%></td>
        <td><%=tcontent%></td>

    </tr>
<%
    }
%>
</table>
</body>
</html>
