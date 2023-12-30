<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<spring:url value='/resources/style1.css'/>"/>
</head>
<body>
	<form action="hello" method="post">
		<h1>User Form</h1>
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
			<button type="submit">Login</button>
			<button type="reset">Cancel</button>
		</div>
	</form>
</body>
</html>