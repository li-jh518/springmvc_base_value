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
	批量删除用户 复杂数据中的数组
	<form action="itemsController4/firstController45" method="post">
		<table width="50%" border=2>
			<tr>
				<th>选择</th>
				<th>名称</th>
			</tr>
			<tr>
				<th><input type="checkbox" value="1" name="ids"></th>
				<th>肯德基</th>
			</tr>
			<tr>
				<th><input type="checkbox" value="2" name="ids"></th>
				<th>麦当劳</th>
			</tr>
			<tr>
				<th><input type="checkbox" value="3" name="ids"></th>
				<th>全聚德</th>
			</tr>
			<tr>
				<td colspan="2"><center>
						<input type="submit" value="批量删除">
					</center></td>
			</tr>
		</table>
	</form>
</body>
</html>