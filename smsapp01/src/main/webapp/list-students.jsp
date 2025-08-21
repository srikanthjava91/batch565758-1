<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Students List</title>
</head>
<body>
	<h2>Students List</h2>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Course</th>
			<th>Action</th>
		</tr>
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.course}</td>
				<td><a href="deleteStudent/${student.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="addStudent">Add New Student</a> |
	<a href="/">Home</a>
</body>
</html>

