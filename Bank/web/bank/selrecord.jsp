<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>无标题文档</title>
</head>

<body>
<div style="width:650px;">
    <h2>查询交易记录，输入起始日期和结束日期点击“查询”按钮</h2>
    <form>
        查询日期范围：<input type="date"/>到<input type="date"/> <input type="submit" type="查询"/>
    </form>
    <table border="1" width="95%">
        <tr>
            <td>交易日期</td>
            <td>支出</td>
            <td>存入</td>
            <td>账户余额</td>
            <td>交易类型</td>
            <td>备注</td>
        </tr>
        <c:forEach items="${page.list}" var="record">
            <tr>
                <td>${record.tran_date}</td>
                <td>${record.expense}</td>
                <td>${record.income}</td>
                <td>${record.balance}</td>
                <td>${record.tran_type}</td>
                <td>${record.remark}</td>
            </tr>
        </c:forEach>

    </table>
    <div style="text-align: center">
        <c:choose>
            <c:when test="${page.pageIndex==1}">
                <a href="#">首页</a>
                <a href="#">上一页</a>
            </c:when>
            <c:otherwise>
                <a href="${base}/record?pageIndex=1">首页</a>
                <a href="${base}/record?pageIndex=${page.pageIndex-1}">上一页</a>
            </c:otherwise>
        </c:choose>

        <c:choose>
            <c:when test="${page.pageIndex==page.totalPage}">
                <a href="#">下一页</a>
                <a href="#">尾页</a>
            </c:when>
            <c:otherwise>
                <a href="${base}/record?pageIndex=${page.pageIndex+1}">下一页</a>
                <a href="${base}/record?pageIndex=${page.totalPage}">尾页</a>
            </c:otherwise>
        </c:choose>

        [当前页数：${page.pageIndex}/总页数：${page.totalPage}]

    </div>
</div>


</body>
</html>
<script>
    function checks(obj) {
        var val = obj.value;
        alert(val);
    }

    var num = "0123123.21";


    var reg = /^\d+(\.\d{1,2})?$/;
    //var result = num.RegExp(reg);
    var reg1 = /^\d{16}$/;

    var reg2 = /^\d{4}-\d{1,2}-\d{1,2}$/;

    var date = new Date("2015-08-08");
    var date1 = new Date("2015-09-08");


</script>