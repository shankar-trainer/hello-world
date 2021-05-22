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
 <script type="text/javascript" src="script/script1.js"></script>
 
 <style type="text/css">
  .label_class{
    width: 130pt;
  }
 
  </style>
</head>
<body>

<form action="UserController" onsubmit="return validate()" method="post">

	<input name="id"  id="id" type="text" placeholder="Enter Id "><br>
	<input name="password" id="password"  type="password" placeholder="Enter Password "><br>
	<input name="repassword" id="repassword" type="password" placeholder="Enter Re Password "><br>
	<input name="name" type="text"  id="name"  placeholder="Enter Name "><br>
	
	<br>
	<label class='label_class'>Select User Type</label>
	<br>
	
	<input type="radio" value="admin" name="userType" >Admin
	<br><input type="radio" value="user" name="userType" >User
	<br><br>
	
	<input type="submit" value="Login">
	<input type="reset" value="Cancel">
	
</form>




</body>
</html>