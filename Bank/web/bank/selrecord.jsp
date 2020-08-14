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
	<tr><td>交易日期</td><td>支出</td><td>存入</td><td>账户余额</td><td>交易类型</td><td>备注</td></tr>
    <tr><td>2016-08-05</td><td>45.00</td><td></td><td>125.5</td><td>消费</td><td></td></tr>
   <tr><td>2016-08-05</td><td></td><td>88</td><td>1125.5</td><td>消费</td><td></td></tr>

</table>
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