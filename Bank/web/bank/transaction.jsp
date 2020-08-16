<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>转账</title>
    <script type="text/javascript">
        function check() {
            var cardNo = document.getElementsByName("cardNo")[0].value;
            var money = document.getElementsByName("money")[0].value;
            var regCD = /^\d{16}$/;
            var regMon = /^([1-9][0-9]*)+(.[0-9]{1,2})?$/;

            if (!regCD.test(cardNo)) {
                alert("请正确输入16位卡号！");
                return false;
            } else if (!regMon.test(money)) {
                alert("请正确输入金额!");
                return false;
            }
            return true;
        }
    </script>
</head>

<body>
<div <c:if test="${tranStatus=='true'}">style="display: none" </c:if>>
    <div style="width:650px; text-align:center">
        <h2>转账，请输入账户及金额后点击“转账”按钮</h2>
        <form action="${base}/account?pre=tran" method="post" onsubmit="return check()">
            <table align="center">
                <tr>
                    <td>转入账户：</td>
                    <td><input name="cardNo" placeholder="请输入16位账号"/></td>
                </tr>
                <tr>
                    <td>转入金额：</td>
                    <td><input name="money" placeholder="请输入转账金额"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input id="submit" type="submit" value="转账"/></td>
                </tr>
            </table>
        </form>

    </div>

</div>
<div <c:if test="${tranStatus!='true'}"> style="display: none" </c:if>>
    <div style="width:650px; text-align:center">
        <h1>操作已成功，请选择其他操作</h1>
    </div>
</div>
</body>
</html>
