<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form action="userLogin" modelAttribute="user1">
<form:label path="id">Enter User Id</form:label>
<form:input  path="id"/>
<form:errors path="id"/>
<br>

<form:label path="uname">Enter User Name</form:label>
<form:input  path="uname"/>
<form:errors path="uname"/>

<br>

<form:label path="usalary">Enter User Salary</form:label>
<form:input  path="usalary"/>
<form:errors path="usalary"/>

<br>
<input type="submit" value="login">
<input type="reset" value="reset">

</form:form>

</body>
</html>