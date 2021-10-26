<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<a href="http://localhost:8080/SpringMVC/mvc/SpringMVC/mvc/login?siteLanguage=en">English</a>
	<a href="http://localhost:8080/SpringMVC/mvc/SpringMVC/mvc/login?siteLanguage=fr">French</a>
	<form>
		<table>
			<tr>
				<td><spring:message code="label.username"/></td>
				<td><input type="text" name="username"/>	
			</tr>
			<tr>
				<td><spring:message code="label.password"/></td>
				<td><input type="password" name="password"/>	
			</tr>
			<tr><td><input type="submit" value="${label.submit}"/>
		</table>
	</form>
</body>
</html>