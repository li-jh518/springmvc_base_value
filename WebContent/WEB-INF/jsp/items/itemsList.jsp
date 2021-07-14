<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		商品数据展示
		<table width="100%" height="350px" border="2" bordercolor="blue">
			<tr>
				<th>编号</th>
				<th>名称</th>
				<th>价格</th>
			</tr>
			<c:forEach items="${itemsList}" var="item">
				<tr>
					<td align="center">${item.id}</td>
					<td align="center">${item.name}</td>
					<td align="center">${item.price}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>