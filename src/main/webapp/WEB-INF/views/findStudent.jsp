<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Student</title>
</head>
<body>
	<form:form action="findStudent" method="post" modelAttribute="student">
		<table>
			<tr>
				<td> Enter RollNo : </td>
				<td> <form:input path="rollNo" /> </td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"/></td>
				<td> <input type="reset"  value="Clear"/> </td>
			</tr>
		</table>
	</form:form>
</body>
</html>