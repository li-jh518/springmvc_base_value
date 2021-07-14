<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	欢迎来到springmvc 参数传递
	<br>
	<a href="itemsController/firstController">注解请求url地址解决方案</a>
	<br>
	<a href="goodsController/firstController">注解请求url地址解决方案</a>
	<br>
	<a href="itemsController/secondController">注解请求url地址解决方案 第二个方法</a>
	<br>
	<a href="itemsController2/firstController2">注解请求url地址解决方案 返回值为字符串
		不能够带model必须把model作为参数</a>
	<br>
	<a href="itemsController3/firstController3?id=43">简单参数从客户端到控制器
		request作参数</a>
	<br>
	<a href="itemsController4/firstController41?sid=4">简单参数从客户端到控制器
		基本数据类型作参数</a>
	<br>
	<a href="itemsController4/firstController42">简单参数从客户端到控制器
		基本数据类型作参数名称不同</a>
	<br>
	<a href="itemsController4/to43">去注册页面，为了完成模型传值</a>
	<br>
	<a href="itemsController4/to44">去订单页面，为了完成模型传值包含模型</a>
	<br>
	<a href="itemsController4/to45">去删除页面，为了完成数组传值</a>
	<br>
</body>
</html>