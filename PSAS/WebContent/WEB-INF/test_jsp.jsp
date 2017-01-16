<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>test_jsp</title>
</head>
<body>
	<table cellpadding="0px" cellspacing="0px" border="1px">
		<tr>
			<th>logId</th>
			<th>logMsg</th>
			<th>logTime</th>
			<th>userId</th>
			<th>userInfo</th>

		</tr>
		<c:forEach items="${logs }" var="l">
			<tr>
				<td>${l.logId }</td>
				<td>${l.logMsg }</td>
				<td>${l.logTime }</td>
				<td>${l.userId }</td>
				<td>${l.userInfo }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>