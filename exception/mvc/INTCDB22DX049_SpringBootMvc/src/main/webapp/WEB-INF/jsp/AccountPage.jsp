<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("../../account.css");
</style>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="f" %>
<form action="actAction">
<h1>Account Page</h1>
<label>Enter Id</label>
<input name='actId'><br>

<label>Enter Name</label>
<input name='actName'><br>

<label>Enter Salary</label>
<input name='actSalary'><br>

<label>Enter Account Creation date</label>
<input name='actCreationDate'><label>In Format Of (dd-MM-yyyy)</label><br>
<br>
<input type="submit" value="Login">
<input type="reset" value="Cancel">

</form>

</body>
</html>