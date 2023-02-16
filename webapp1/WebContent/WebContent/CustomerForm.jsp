<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("css/style1.css");
</style>
</head>
<body>
<form action="CustomerView.jsp" method="post">
    <span style='float:left'><%=java.time.LocalDate.now() %></span>
    <span style='float:right'><%=java.time.LocalTime.now() %></span>
	<h1>Customer Form</h1>
	<label>Enter Id</label>
	<input name='id'><br>
	
	<label>Enter Name</label>
	<input name='name'><br>
	<input type="submit" value="Login">
	<input type="reset" value="Cancel">
	</form>
</body>
</html>