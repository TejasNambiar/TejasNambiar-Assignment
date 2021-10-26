<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="3">
		<tr>
               <th>Employee EmployeeID</th>
               <th>Employee EmployeeName</th>
               <th>Employee EmployeeSalary</th>
		</tr>
              <c:forEach items="${list}" var="emp">
                  <tr>

                     <td><c:out value="${emp.id}" /></td>
                     <td><c:out value="${emp.name}" /></td>
                     <td><c:out value="${emp.salary}" /></td>



                  </tr>
                  </c:forEach>
           </table>
		
		<c:forEach var="exp" begin="1" end="${length}">
			<a href="/SpringMVC/view/${exp}">${exp}</a>
		</c:forEach>
</body>
</html>