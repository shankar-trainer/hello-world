<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

	<f:form action="employeeAction" method="post" modelAttribute="employee">
		<div>
			<f:label path="id">Enter Id</f:label>
			<f:input path="id"></f:input>
			<f:errors path="id"></f:errors>
		</div>
		
		<div>
			<f:label path="password">Enter Password</f:label>
			<f:password path="password"/>
			<f:errors path="password"></f:errors>
		</div>
		
		<div>
			<f:label path="name">Enter Name</f:label>
			<f:input path="name"></f:input>
			<f:errors path="name"></f:errors>
		</div>
		<div>
			<f:label path="salary">Enter Salary</f:label>
			<f:input path="salary"></f:input>
			<f:errors path="salary"></f:errors>
		</div>
		<div>
			<f:label path="gender">Gender</f:label>
			<f:radiobuttons items="${gender}" path="gender"/>
			<f:errors path="gender"></f:errors>
		</div>
		<div>
			<f:label path="hobbies">Enter Hobbies</f:label>
			<f:checkboxes path="hobbies"  items="${hobbies}"/>
			<f:errors path="hobbies"></f:errors>
		</div>
		<div>
		<input type="submit">
		<input type="reset">
		</div>

	</f:form>
</body>
</html>