
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

.id1 {
	margin-top: 20px;
}

.id2 {
	margin-top: 30px;
	margin-left: 120px;
}
</style>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

	<f:form modelAttribute="account">

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

		<div class="id1">
			<f:label path="accountCreationDate">Enter Account Creation Date</f:label>
			<f:input path="accountCreationDate"  />
			<f:errors path="accountCreationDate" cssClass="error"></f:errors>
		</div>

		<div class="id1">
			<f:label path="gender">Select Gender</f:label>
		</div>
		<div class="id2">
			<f:radiobuttons path="gender" items="${gender}" delimiter="<br>" />
			<f:errors path="gender" cssClass="error"></f:errors>
		</div>

		<div class="id1">
			<f:label path="acttype">Select Account Type</f:label>
		</div>
		<div class="id2">
			<f:checkboxes path="acttype" items="${acttype}" delimiter="<br>" />
			<f:errors path="acttype" cssClass="error"></f:errors>
		</div>
		<div class="id1">
			<input type="submit"> <input type="reset">
		</div>

	</f:form>


</body>
</html>