<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("../../employee.css");
</style>
</head>
<body>
	<%@page isErrorPage="true"%>
	<div class='error1'>
		<h1>Employee Error page</h1>
		<div>
			<%=exception.getMessage()%>
		</div>
	</div>
</body>
</html>