<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 弓长四夕是猪
  Date: 2020/8/19
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:if test="${list==null}">
    <jsp:forward page="/showUsers"/>
</c:if>
<html>
<head>
    <title>Title</title>
    <script src="${base}/javaScript/jquery-3.0.0.min.js" type="text/javascript"></script>

</head>
<body>
<a href="#">异步</a>
<input type="button" value="下一页">

<div>
    <c:forEach var="u" items="${list}">
        <p>${u.id} ${u.username}</p>
    </c:forEach>
</div>

</body>
</html>
<script>
    $("a").click(function () {
        <%--   //$.post() $.get()
          //默认同ajax  type = "post"
          //data可以不写 用url传值
          //dataType可以不写 默认"text"

          // $.post(url, data, function (result) {
          //
          // }, dataType);
         $.post("${base}/showUsers", function (result) {
              //注：dataType如果写成json那么可以省去转换，result就为转化后的内容

              //解析json格式的返回值 $.parseJSON();
              //如果是集合或者数组会解析成js数组
              //如果是对象会被转换成js对象
              var list = $.parseJSON(result);
              var str = "";
              for (var i = 0; i < list.length; i++) {
                  str += "<p>"
                      + list[i].username
                      + list[i].password
                      + "</p>";
              }
              $("div").html(str);
          });--%>
        $.post("${base}/showUsers", function (result) {
            var str = "";
            for (var i = 0; i < result.length; i++) {
                str += "<p>"
                    + result[i].username
                    + result[i].id
                    + "</p>";
            }
            $("div").html(str);

        }, "json");
    });

    var pageIndex = 1;
    $("input[type='button']").click(function () {
        pageIndex++;
        $.post("${base}/showUsers?pre=ajaxShow&pageIndex=" + pageIndex, function (result) {
            for (var i = 0; i < result.length; i++) {
                var p = "<p>" + result[i].id + result[i].username + "</p>";
                $("div").append(p);
            }
        }, "json");
    });
</script>