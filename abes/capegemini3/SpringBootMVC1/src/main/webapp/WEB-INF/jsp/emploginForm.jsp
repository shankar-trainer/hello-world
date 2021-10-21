<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Form</h1>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form action="login" modelAttribute="customer">
 <form:label path="id">Enter Id</form:label> 
  <form:input path="id"></form:input> 
  <form:errors path="id"></form:errors> 
  <br>
  
  <form:label path="name">Enter Name</form:label> 
  <form:input path="name"></form:input> 
  <form:errors path="name"></form:errors> 
  <br>
    
  <form:label path="salary">Enter Salary</form:label> 
  <form:input path="salary"></form:input> 
  <form:errors path="salary"></form:errors> 
  <br>

 <input type="submit" name="operation" value="add"> 
 <input type="submit" name="operation" value="remove"> 
 <input type="submit" name="operation" value="update"> 
 <input type="submit" name="operation" value="show all"> 
</form:form>

</body>
</html>