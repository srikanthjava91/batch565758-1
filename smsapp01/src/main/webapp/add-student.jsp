<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Add Student</title>
</head>
<body>
	<h2>Add Student</h2>
	<form action="saveStudent" method="post">
		ID:<input type="text" name="id" /><br>
		<br> 
		
		Name: <input type="text" name="name" /><br>
		<br> 
		
		Course: <input type="text" name="course" /><br>
		<br> 
		
		<input type="submit" value="Save" />
	</form>
	<br>
	<a href="/">Home</a>
</body>
</html>
