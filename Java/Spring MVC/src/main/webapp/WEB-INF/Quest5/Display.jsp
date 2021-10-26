<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<table>
		<c:forEach items="${list}" var="employees">
			<tr>
				<td><c:out value="${employees.id}" /></td>
				<td><c:out value="${employees.name}" /></td>
				<td><c:out value="${employees.department}" /></td>
				<td><c:out value="${employees.designation}" /></td>
				<td><c:out value="${employees.salary}" /></td>
				<td><a href="/SpringMVC/edit/${employees.id}">Edit</a></td>
				<td><a href="/SpringMVC/delete/${employees.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="/SpringMVC/add">Add Employees</a>
</body>
</html>