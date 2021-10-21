<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label {
	float: left;
	width: 100px;
	margin-right: 20px;
}

.style1 {
	width: 100px;
}

.style2 {
	color: red;
	font-weight: bold;
}

.style3 {
	border: double 4pt;
	margin-left: 300px;
	padding: 2em;
	width: 40%;
	color: blue;
	background-color: yellow;
	margin-top: 100px;
}

body {
	background: yellowgreen;
}
</style>
</head>
<body>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<form:form modelAttribute="emp" action="loginform" method="post"
		cssClass="style3">
		<h1>Employee Form</h1>

		<form:label path="id">Enter Id</form:label>
		<form:input path="id" cssClass="style1" />
		<form:errors path="id" cssClass="style2" />
		<br>

		<form:label path="name">Enter Name</form:label>
		<form:input path="name" cssClass="style1" />
		<form:errors path="name" cssClass="style2" />
		<br>

		<form:label path="salary">Enter Salary</form:label>
		<form:input path="salary" cssClass="style1" />
		<form:errors path="salary" cssClass="style2" />
		<br>
		<br>

		<input type="submit" value="AddRecord">
		<input type="reset" value="Cancel">
	</form:form>

</body>
</html>