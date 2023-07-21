<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<link rel="stylesheet" href='<spring:url value="/resourses/style1.css"/>' />


</head>
<body>

	<form action="empResult">
		<h1>Employee Form</h1>
		<div>
			<label>Enter Id</label> <input name="id">
		</div>
		
		<div>
			<label>Enter Name</label> <input name="name">
		</div>
		
		<div>
			<label>Enter Salary</label> <input name="salary">
		</div>
		
		<div>
			<input type="submit" value="send">
			<input type="reset" value="cancel">
		</div>
		
		
	</form>
</body>
</html>