<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<a href="?language=en">English</a> <a href="?language=fr">French</a>
	</div>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

	<form:form modelAttribute="employee" action="empaction">
		<div>
			<spring:message code="emp.id" var="a1"></spring:message>
			<form:label path="Id">
				<spring:message code="emp.id"></spring:message>
			</form:label>
			<form:input path="Id" placeholder="${a1}" />
			<form:errors path="Id"></form:errors>
		</div>
		<div>
			<form:label path="name">
				<spring:message code="emp.name"></spring:message>
			</form:label>
			<form:input path="name" />
			<form:errors path="name"></form:errors>
		</div>
		<div>
			<form:label path="salary">
				<spring:message code="emp.salary"></spring:message>
			</form:label>
			<form:input path="salary" />
			<form:errors path="salary"></form:errors>
		</div>
		<div>
			<button type="submit">Send</button>
			<button type="reset">cancel</button>
		</div>
	</form:form>

</body>
</html>