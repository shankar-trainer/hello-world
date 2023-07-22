 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href='<spring:url value="/resources/style1.css"/>' />
 
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form modelAttribute="person" action="personAction" method="post">
		<fieldset>
			<legend> Person Form </legend>

			<div>
				<form:label path="personId">Enter Id</form:label>
				<form:input path="personId" name="personId" />
				<form:errors path="personId"></form:errors>
			</div>

			<div>
				<form:label path="personName">Enter Name</form:label>
				<form:input name="personName" path="personName" />
				<form:errors path="personName"></form:errors>
			</div>

			<div>
				<form:label path="personSalary">Enter Salary</form:label>
				<form:input path="personSalary" name="personSalary" />
				<form:errors  path="personSalary"></form:errors>
			</div>

			<div>
				<input type="submit" value="send"> <input type="reset"
					value="cancel">
			</div>

		</fieldset>
	</form:form>
</body>
</html>