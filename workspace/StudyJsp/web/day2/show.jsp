<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/4
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String password = request.getParameter("password");
    String sex = request.getParameter("sex");
    String[] like = request.getParameterValues("like");
%>
<table>
    <tr>
        <td>姓名：
        </td>
        <td><%=name%>
        </td>
    </tr>

    <tr>
        <td>电话：
        </td>
        <td><%=phone%>
        </td>
    </tr>
    <tr>
        <td>密码：
        </td>
        <td><%=password%>
        </td>
    </tr>
    <tr>
        <td>喜好：
        </td>
        <td><% for (String s : like) {
            out.print(s + "、");
        }%>
        </td>
    </tr>
    <tr>
        <td>性别：
        </td>
        <td><%=sex%>
        </td>
    </tr>

</table>
</body>
</html>
