<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>showAllUser</h2>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>username</th>
			<th>备注</th>
		</tr>
		<c:forEach items="${listAllUser}" var="li">
			<tr>
				<td>${li.userid}</td>
				<td>${li.username}</td>
				<td><a href="/mytest/showUser.do?id=${li.userid}" >显示信息</a></td>
				 
			</tr>
		</c:forEach>
	</table>
</body>
</html>