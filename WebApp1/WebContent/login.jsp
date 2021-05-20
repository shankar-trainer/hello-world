<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("css/style1.css");
</style>
</head>
<body>
 <h1>LoginForm</h1>
 
<form action="loginController" method="post">
	<label>Enter Id</label>
	<input name="id"><br>
	<label>Enter Password</label>
	<input name="pass" type="password"><br>
	<br>
	<label>Select User</label><br>
	
	<input type="radio" name="utype" value="user">User<br>
	<input type="radio" name="utype" value="admin">Admin
	
	<br>
	<br>
	<br>
	<input type="submit" value="Login">
	<input type="reset" value="Cancel">
</form>


</body>
</html>