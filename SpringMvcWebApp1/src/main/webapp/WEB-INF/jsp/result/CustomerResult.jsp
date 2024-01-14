<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<spring:url value='/resources/style1.css'/>" />
</head>
<body>
	<form>
		<h3>Customer Result</h3>
		<div>Id is ${customer.customerId}</div>

		<div>Name is ${customer.customerName}</div>

		<div>Salary is ${customer.customerSalary}</div>
	</form>
</body>
</html>