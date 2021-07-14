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
	我是注册页面
	<form action="itemsController4/firstController43" method="post">
		<input type="text" name="username"><br>
		<input type="password" name="password"><br> 
		<input type="submit" value="注册">
	</form>
</body>
</html>