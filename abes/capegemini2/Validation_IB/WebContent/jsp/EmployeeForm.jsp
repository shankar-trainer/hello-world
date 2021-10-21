<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
label {
	float: left;
	width: 100px;
	margin-right: 20px;
}

.style2 {
	color: red;
	font-weight: bold;
}

.style1 {
	width: 100px;
}

.style3 {
	border: double 4px;
	margin-left: 300px;
	padding: 2em;
	width: 40%;
	color: blue;
	background-color: aqua;
	margin-top: 100px;
}

body {
	background: yellowgreen;
}
</style>
</head>
<body>
	<H1>Login Form</H1>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form modelAttribute="emp" action="loginform" method="post"
		cssClass="style3">

		<form:label path="id">Enter Id</form:label>
		<form:input path="id" cssClass="style1" />
		<form:errors path="id" cssClass="style2"></form:errors>

		<form:label path="name">Enter Name</form:label>
		<form:input path="name" cssClass="style1" />
		<form:errors path="name" cssClass="style2"></form:errors>

		<form:label path="salary">Enter Salary</form:label>
		<form:input path="salary" cssClass="style1" />
		<form:errors path="salary" cssClass="style2"></form:errors>


			<%-- <form:label path="hobby">Select Hobby</form:label>
		<br>
		<br>
	<form:checkboxes items="$(myhobby)" path="hobby" />
		<br>
		<br>
		<form:errors path="hobby" ></form:errors> --%>
		
		<input type="submit" value="login">
		<input type="reset" value="cancel">
	</form:form>

</body>
</html>