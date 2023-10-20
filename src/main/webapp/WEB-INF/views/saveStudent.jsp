<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
	<c:if test="${!msg}">
		<h1>${msg}</h1>	
	</c:if>
	<form:form action="saveStudent" method="post" modelAttribute="student">
		<table>
			<tr>
				<td> Name : </td>
				<td> <form:input path="name" /> </td>
			</tr>
			<tr>
				<td> Email : </td>
				<td> <form:input path="email" /> </td>
			</tr>
			<tr>
				<td> Mobile : </td>
				<td> <form:input path="mobile" /> </td>
			</tr>
			<tr>
				<td> Address : </td>
				<td> <form:input path="address" /> </td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"/></td>
				<td> <input type="reset"  value="Clear"/> </td>
			</tr>
		</table>
	</form:form>
	<c:if test="${!msg}">
		<h3><a href="/"> HomePage</a></h3>	
	</c:if>
</body>
</html>