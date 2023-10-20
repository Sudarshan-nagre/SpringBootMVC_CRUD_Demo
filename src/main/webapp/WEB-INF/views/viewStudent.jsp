<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Student</title>
</head>
<body>
	<c:if test="${null != student.name}">
		<h2>Student details</h2>
		RollNo : ${student.rollNo} <br>
		Name : ${student.name} <br>
		Email : ${student.email} <br>
		Mobile : ${student.mobile} <br>
		Address : ${student.address} <br>
		
		<a href="deleteStudent?rollNo=${student.rollNo}">delete</a>
	</c:if>
	
	<h2><font color='red'>${msg}</font></h2>
	
</body>
</html>