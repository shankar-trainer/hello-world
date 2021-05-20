<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Title of the document</title>

<style>
@import url("../CSS/style1.css");

form {
	width: 45%;
	background: yellow;
}
</style>

</head>
<body>

	<nav>

		<a href="?language=en">English</a> <a href="?language=fr">French</a>

	</nav>


	<form:form action="uaction" modelAttribute="user" method="get">
		<form:label path="userId">

			<spring:message code="user.id">
			</spring:message>

		</form:label>
		<form:input path="userId" />
		<form:errors path="userId" cssClass="error" />
		<br>

		<form:label path="userName">

			<spring:message code="user.name">
			</spring:message>


		</form:label>
		<form:input path="userName" />
		<form:errors path="userName" cssClass="error" />
		<br>

		<form:label path="userSalary">

			<spring:message code="user.salary">
			</spring:message>

		</form:label>
		<form:input path="userSalary" />
		<form:errors path="userSalary" cssClass="error" />
		<br>
		<input type="submit" value="Send">
		<input type="reset" value="Cancel">

	</form:form>

</body>
</html>