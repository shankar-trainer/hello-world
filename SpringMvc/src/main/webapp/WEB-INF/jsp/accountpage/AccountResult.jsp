
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href='<spring:url value="/resources/style1.css"/>' />
<style>
form {
	width: 35%;
	margin-left: 360px;
	margin-top: 100px;
	padding: 30px;
	height: 300px;
}
</style>
</head>
<body>
<form>
	<h1>Account Result</h1>
	Name is ${account.name}
	<br> Account Type is
	<%
	out.print("<ol>");
	for (String s : request.getParameterValues("acttype"))
		out.print("<li>" + s);

	out.print("</ol>");
	%>
	<br> Balance is ${account.balance}
	<br> Account Creation date is ${account.accountCreationDate}
	<br> Equity Allocation is ${account.equityAllocation}
	<br> Gender is ${account.gender[0]}
	<br>
	</form>
</body>
</html>