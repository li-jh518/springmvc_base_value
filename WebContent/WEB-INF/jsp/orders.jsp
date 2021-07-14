<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<html>
<head></head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	我是订单页面
	<form action="itemsController4/firstController44" method="post">
		订单编号：<input type="text" name="orderId"><br>
		订单用户名称：<input type="text" name="user.username"><br> 
		订单用户密码：<input type="text" name="user.password"><br>
		<input type="submit" value="下订单">
	</form>
</body>
</html>