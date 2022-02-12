<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label {
	float: left;
	width: 100px;
}

input {
	width: 120px;
}

form {
	padding: 20px;
	margin-left: 380px;
	background: lightyellow;
	border: inset 10px;
	width: 40%;
}

body {
	background: pink;
}

</style>
</head>
<body>
<form action="EmpAction">
<h1>Employee Form</h1>
<label>Enter Id</label>
<input name="id"><br>

<label>Enter Name</label>
<input name="name"><br>

<label>Enter Salary</label>
<input name="salary"><br>
<input type='submit'>
<input type='reset'>
</form>
</body>
</html>