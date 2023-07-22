
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
	width: 40%;
	margin-left: 400px;
	margin-top: 100px;
	padding: 30px;
}
</style>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

	<f:form>

		<div>
			<f:label path="name">Enter Name</f:label>
			<f:input path="name" />
			<f:errors path="name" cssClass="error"></f:errors>
		</div>
		
		<div>
			<f:label path="balance">Enter Balance</f:label>
			<f:input path="balance" />
			<f:errors path="balance" cssClass="error"></f:errors>
		</div>
		
		<div>
			<f:label path="equityAllocation">Enter Equity Allocation</f:label>
			<f:input path="equityAllocation" />
			<f:errors path="equityAllocation" cssClass="error"></f:errors>
		</div>

	</f:form>


</body>
</html>