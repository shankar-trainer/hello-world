<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
@import url("../../style1.css");
label{
 float:left;
 width:100pt;
}
.style1{
 width:30%;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
	<nav>
	<a href="?lang=en">English</a>
	<a href="?lang=fr">French</a>
	</nav>
	
	
	<form:form modelAttribute="employee" 
	action="/employee/login" method="post" cssClass="style1">
	<%-- 	<div>
			<form:label path="id"><spring:message code="emp.id"></spring:message></form:label>
			<form:input path="id" />
			<form:errors></form:errors>
		</div> --%>
		<div>
			<form:label path="name"><spring:message code="emp.name"></spring:message></form:label>
			<form:input path="name" />
			<form:errors></form:errors>
		</div>
		<div>
			<form:label path="salary"><spring:message code="emp.salary"></spring:message></form:label>
			<form:input path="salary" />
			<form:errors></form:errors>
		</div>
		<div>
		<input type="submit">
		<input type="reset">
		</div>

	</form:form>


</body>
</html>