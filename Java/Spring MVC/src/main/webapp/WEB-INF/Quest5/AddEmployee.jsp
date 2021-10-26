<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<form action="/SpringMVC/display" method="post">
		<table>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>Employee Department</td>
				<td><input type="text" name="department"/></td>
			</tr>
			<tr>
				<td>Employee Designation</td>
				<td><input type="text" name="designation"/></td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td><input type="text" name="salary"/></td>
			</tr>
			<tr><td><center><input type="submit" value="Add"/></center></td></tr>
		</table>
	</form>
</body>
</html>