<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.form1 {
	width: 30%;
	margin-left: 400px;
	padding: 30px;
	margin-top: 100px;
}

.label1 {
	float: left;
	width: 110px;
}

.input1 {
	width: 110px;
	margin-top: 3px;
}

button {
	margin-top: 7px;
}
</style>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<form:form method="post" action="employeeAction"
		modelAttribute="employee" cssClass="form1"
		cssStyle="border:solid red 3px;">

		<div>
			<form:label path="empId" cssClass="label1">Enter Id</form:label>
			<form:input path="empId" cssClass="input1" />
			<form:errors path="empId"></form:errors>
		</div>
		<div>
			<form:label path="empName" cssClass="label1">Enter Name</form:label>
			<form:input path="empName" cssClass="input1" />
			<form:errors path="empName"></form:errors>
		</div>
		<div>
			<form:label path="empSalary" cssClass="label1">Enter Salary</form:label>
			<form:input path="empSalary" cssClass="input1" />
			<form:errors path="empSalary"></form:errors>
		</div>
		<div>
			<button type="submit">Login</button>
			<button type="reset">Cancel</button>
		</div>

	</form:form>
</body>
</html>