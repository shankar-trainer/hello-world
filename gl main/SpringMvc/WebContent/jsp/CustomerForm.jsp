<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
label {
	float: left;
	width: 170px;
	color: blue;
	font-weight: bold;
}

.style1 {
	width: 120px;
}

.style2 {
	color: red;
	width: 120px;
	font-weight: bold;
}

.style3 {
	border: inset blue 10px;
	background: aqua;
}
</style>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form action="cstResult" modelAttribute="cst" cssClass="style3">
		<label>Enter Id</label>
		<form:input path="id" cssClass="style1" />
		<form:errors path="id" cssClass="style2" />
		<br>

		<label>Enter Name</label>
		<form:input path="name" cssClass="style1" />
		<form:errors path="name" cssClass="style2" />
		<br>

		<label>Enter Salary of 5 digit and 2 decimal</label>
		<form:input path="salary" cssClass="style1" />
		<form:errors path="salary" cssClass="style2" />
		<br>
		<br>
		<label>Gender</label>
		<form:radiobuttons path="gender" items="${gender}" cssClass="style1" />
		<form:errors path="gender" cssClass="style2" />

		<br>
		<label>Hobbies</label>
		<br>
		<br>

		<form:checkboxes path="hobby" items="${hobby}"/>
		<br>

		<form:errors path="hobby"  cssClass="style2"/>
		<br>
		<input type="submit" value="send">
	</form:form>
</body>
</html>