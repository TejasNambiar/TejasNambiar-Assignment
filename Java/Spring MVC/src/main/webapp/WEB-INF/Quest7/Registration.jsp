<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
	<form:errors path="cus1.*"></form:errors>
	<form action="/SpringMVC/submit/Registration" name="loginForm" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username"/>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"/>
			</tr>
			<tr>
				<td>Contact</td>
				<td><input type="text" name="contact"/>
			</tr>
			<tr>
				<td>City</td>
				<td><select>
						<option>Vancouver</option>
						<option>Toronto</option>
						<option>Edmonton</option>
						<option>Windsor</option>
					</select></td>
			</tr>
			<tr>
				<td>ZipCode</td>
				<td><input type="text" name="zipcode"/>
			</tr>
			<tr><td><input type="submit" value="Register"/></td></tr>
		</table>
	</form>
</body>
</html>