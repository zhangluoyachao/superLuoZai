<%@ page import="java.sql.Date" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/7
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">

    </style>
</head>
<body>
<%
    Date date = Date.valueOf(LocalDate.of(1998, 3, 9));
    request.setAttribute("date", date);
    List<String> lstr = new ArrayList<>();
    lstr.add("撒大苏打萨达萨达萨达撒旦撒的大事的撒发顺丰啊沙发沙发阿峰阿斯弗啊发");
    lstr.add("撒大苏打萨达萨达萨达撒旦撒的大事的撒发顺丰啊沙发沙发阿峰阿斯弗啊发");
    lstr.add("撒大苏打萨达萨达萨达撒旦撒的大事的撒发顺丰啊沙发沙发阿峰阿斯弗啊发");
    lstr.add("撒大苏打萨");
    lstr.add("撒大苏打萨达萨达萨达撒旦撒的大事的撒发顺丰啊沙发沙发阿峰阿斯弗啊发");
    lstr.add("撒大苏打萨达萨达萨达撒旦撒的大事的撒发顺丰啊沙发沙发阿峰阿斯弗啊发");
    lstr.add("撒大苏打萨达萨达萨达撒旦撒的大事的撒发顺丰啊沙发沙发阿峰阿斯弗啊发");
    lstr.add("撒大苏打萨达萨达萨达撒旦撒的大事的撒发顺丰啊沙发沙发阿峰阿斯弗啊发");
    lstr.add("撒大苏打萨达萨达萨达撒旦撒的大事的撒发顺丰啊沙发沙发阿峰阿斯弗啊发");
    lstr.add("撒大苏打萨达萨达萨达撒旦撒的大事的撒发顺丰啊沙发沙发阿峰阿斯弗啊发");
    lstr.add("撒大苏打萨达萨达萨达撒旦撒的大事的撒发顺丰啊沙发沙发阿峰阿斯弗啊发");
    pageContext.setAttribute("list", lstr);
%>
<c:forEach var="s" items="${list}">
    <p>
        <c:if test="${s.length()>10}">
            ${fn:substring(s, 0, 10)}....
        </c:if>
        <c:if test="${s.length()<10}">
            ${s}
        </c:if>
    </p>
</c:forEach>

</body>
</html>
