<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("css/style1.css");
</style>
<style type="text/css">
label {
	float: left;
	width: 160px;
}
input {
	width: 160px;
}

</style>
</head>
<body>
	<span style="float:left; color:blue;">Date :<%=LocalDate.now()%></span>
	<span style="float:right;color:blue;">Time :<%=LocalTime.now()%></span>
	<form action="ProductResult.jsp">
	<br>
		<div>
			<label>Enter Product Id</label> <input name="pid">
		</div>

		<div>
			<label>Enter Product Name</label> <input name="pname">
		</div>

		<div>
			<label>Enter Product Cost</label> <input name="pcost">
		</div>
		<div>
		<input type="submit">
		<input type="reset">
		</div>

	</form>
</body>
</html>