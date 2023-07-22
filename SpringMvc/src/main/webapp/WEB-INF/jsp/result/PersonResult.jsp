
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

</head>
<body>

	<div class="result">
		<div>
			<h2>Using EL (Expression Language)</h2>
			Id is ${person.personId}
		</div>
		<div>Name is ${person.personName}</div>
		<div>Salary is ${person.personSalary}</div>
	</div>
</body>
</html>