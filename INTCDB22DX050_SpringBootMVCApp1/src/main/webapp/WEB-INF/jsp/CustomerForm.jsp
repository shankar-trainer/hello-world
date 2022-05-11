<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

	<f:form action="customerAction" modelAttribute="customer">
		<f:label path="id">Enter Id</f:label>
		<f:input path="id" />
		<f:errors path="id"></f:errors>
		<br>

		<f:label path="name">Enter Name</f:label>
		<f:input path="name" />
		<f:errors path="name"></f:errors>

		<br>

		<f:label path="salary">Enter Salary</f:label>
		<f:input path="salary" />
		<f:errors path="salary"></f:errors>

		<br>

		<input type="submit">
		<input type="reset">
	</f:form>
</body>
</html>