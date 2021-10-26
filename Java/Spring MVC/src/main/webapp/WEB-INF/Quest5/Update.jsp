<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/SpringMVC/display" method="post">
		<table>
			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="id" value="${employee.id}" readonly/></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="name" value="${employee.name}"/></td>
			</tr>
			<tr>
				<td>Employee Department</td>
				<td><input type="text" name="department" value="${employee.department}"/></td>
			</tr>
			<tr>
				<td>Employee Designation</td>
				<td><input type="text" name="designation" value="${employee.designation}"/></td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td><input type="text" name="salary" value="${employee.salary}"/></td>
			</tr>
			<tr><td><center><input type="submit" value="Update"/></center></td></tr>
		</table>
	</form>
</body>
</html>