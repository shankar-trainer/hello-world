<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>	
<link rel="stylesheet" href='<spring:url value="/resources/style1.css"/>'/>
<style>
  label {
	width:150px;
}
form{
 width:40%;

}
.error1{
 color:red;
}
</style>

</head>
<body>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

	<f:form action="employeeAction" method="post" modelAttribute="employee">
		<div>
			<f:label path="id">Enter Id</f:label>
			<f:input path="id"></f:input>
			<f:errors path="id" cssClass="error1"></f:errors>
		</div>

		<div>
			<f:label path="password">Enter Password</f:label>
			<f:password path="password" />
			<f:errors path="password" cssClass="error1"></f:errors>
		</div>

		<div>
			<f:label path="name">Enter Name</f:label>
			<f:input path="name"></f:input>
			<f:errors path="name" cssClass="error1"></f:errors>
		</div>
		<div>
			<f:label path="salary">Enter Salary</f:label>
			<f:input path="salary"></f:input>
			<f:errors path="salary" cssClass="error1"></f:errors>
		</div>
		<div>
			<f:label path="gender">Gender</f:label><br>
			<f:radiobuttons items="${gender}" path="gender"  delimiter="<br>"/>
			<f:errors path="gender" cssClass="error1"></f:errors>
		</div>
		<div><br>
			<f:label path="hobbies">Select Hobbies</f:label>
			<br>
			<f:checkboxes path="hobbies" items="${hobbies}"  delimiter="<br>" />
			<f:errors path="hobbies" cssClass="error1"></f:errors>
		</div>
		<div>
			<input type="submit"> <input type="reset">
		</div>

	</f:form>
</body>
</html>