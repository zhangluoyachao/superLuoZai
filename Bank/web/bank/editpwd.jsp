<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>修改密码</title>
    <script type="text/javascript">
        function onCheck() {
            var reg = /^\d{6}$/;
            var oldPwd = document.getElementsByName("oldPwd")[0].value;
            var newPwd = document.getElementsByName("newPwd")[0].value;
            var checkPwd = document.getElementsByName("checkPwd")[0].value;

            if (!reg.test(oldPwd) || !reg.test(newPwd) || !reg.test(checkPwd)) {
                alert("请正确输入表单信息！");
                return false;
            } else if (newPwd != checkPwd) {
                alert("两次输入的新密码不同！");
                return false;
            }
            return true;
        }
    </script>
</head>

<body>
<div <c:if test="${status=='成功'}">style="display: none" </c:if>>
    <div style="width:650px; text-align:center">
        <h2>修改密码，请输入原密码与新密码点击“修改”按钮</h2>
        <form action="${base}/account?pre=modifyPwd" method="post" onsubmit="return onCheck()">
            <table align="center">
                <tr>
                    <td>原密码：</td>
                    <td><input placeholder="请输入原密码" name="oldPwd"/></td>
                </tr>
                <tr>
                    <td>新密码：</td>
                    <td><input placeholder="请输入新密码" name="newPwd"/></td>
                </tr>
                <tr>
                    <td>重复密码：</td>
                    <td><input placeholder="请输入新密码" name="checkPwd"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="修改"/></td>
                </tr>
            </table>
        </form>

    </div>
</div>
<div <c:if test="${status!='成功'}">style="display: none" </c:if>>
    <div style="width:650px; text-align:center">
        <h1>密码修改成功!请进行其他操作！</h1>
    </div>
</div>

</body>
</html>
