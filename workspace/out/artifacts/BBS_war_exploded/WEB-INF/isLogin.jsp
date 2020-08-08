<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/6
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>

<%
    if (session.getAttribute("isLogin") != null) {
        if (!(boolean) session.getAttribute("isLogin")) {
            response.sendRedirect("index.jsp");
        }
    } else response.sendRedirect("index.jsp");
%>

