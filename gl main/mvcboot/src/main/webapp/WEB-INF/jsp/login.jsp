<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Employee Login Form  </h1>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<form:form action="empLogin" modelAttribute="emp">

<label>Enter Id</label>
<form:input path="id" />
<form:errors path="id" />
<br>

<label>Enter Name</label>
<form:input path="name" />
<form:errors path="name" />
<br>

<br>
<form:errors path="location" />
<br>
<label>Enter Location</label>
<form:checkboxes path="location" items="${loc_list}"/>

<br>
<input type="submit" value="Login">
<input type="reset" value="Cancel">


</form:form>


</body>
</html>