<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
  label{
   width:130px;
    float:left;
  }
  input {
   width:140px;
}
body{
background: pink;
}
.style1{
  width:40%;
  margin-left: 200px;
  margin-top: 100px;
  background: yellow;
  border: double 10px;
  padding: 10px;
  color: blue;
}
.style2{
  color: red;
}

</style>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<form:form action="/cstLogin" method="post" modelAttribute="customer" 
	cssClass="style1">
		<form:label path="id" >Enter Id</form:label>
		<form:input path="id" />
		<form:errors path="id" cssClass="style2"></form:errors>
		<br>

		<form:label path="name">Enter Name</form:label>
		<form:input path="name" />
		<form:errors path="name" cssClass="style2"></form:errors>
		<br>

		<form:label path="salary">Enter Salary</form:label>
		<form:input path="salary" />
		<form:errors path="salary" cssClass="style2"></form:errors>
		<br>

		<form:label path="email">Enter MailId</form:label>
		<form:input path="email" />
		<form:errors path="email" cssClass="style2"></form:errors>
		<br>

		<form:label path="ssn">Enter SSN</form:label>
		<form:input path="ssn" />
		<form:errors path="ssn" cssClass="style2"></form:errors>
		<br>
		
		<input type="submit"   name="operation" value="Add Customer">
		<input type="submit"   name="operation" value="ShowAll Customer">
		<input type="submit"   name="operation" value="Search Customer">
		<input type="reset" value="Cancel">

	</form:form>
</body>
</html>