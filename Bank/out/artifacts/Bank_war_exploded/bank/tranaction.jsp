<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
</head>

<body>
<div style="width:650px; text-align:center">
<h2>转账，请输入账户及金额后点击“转账”按钮</h2>
<form>
	<table align="center">
    <tr><td>转入账户：</td><td><input placeholder="请输入16位账号"/></td></tr>
     <tr><td>转入金额：</td><td><input placeholder="请输入转账金额"/></td></tr>
     <tr><td colspan="2" align="center">
      <input type="submit" value="转账"/></td></tr>
     </table>
</form>

</div>


</body>
</html>
<script>
	function checks(obj){
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