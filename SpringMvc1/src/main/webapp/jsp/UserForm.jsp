<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	label{
	 float:left;
	 width:120px;
	}
	
	input{
	width:100px;
	}
	form{
	 background:yellow; 
	 margin-left:400px;
	 margin-top:200px;
	 border:solid;
	 width:30%;
	 padding:40px;
	}
	body{
	background:lightyellow;
	
	}
</style>
</head>
<body>
<form action="userForm">
	<label>Enter Id </label>
	<input name="id"><br>
	
	<label>Enter Name </label>
	<input name="name"><br>
	
	<label>Enter Salary </label>
	<input name="salary"><br>
	<input type='submit' value="Send">
	<input type='reset' value="Cancel">
	
</form>
</body>
</html>