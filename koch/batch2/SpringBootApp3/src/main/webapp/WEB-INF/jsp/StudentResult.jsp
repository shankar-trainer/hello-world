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
	color: blue;
	background: yellow;
	width: 30%;
	margin-left: 400px;
	margin-top: 50px;
	padding: 10px;
	border: solid 2px;
}

body {
	background: lightyellow;
}

div {
	margin-left: 30px;
}
</style>
</head>
<body>
   <form>
	<h1>Student Result</h1>
	<label>Roll is</label><label> ${student.roll}</label>
	<br><label> Name is </label> <label>${student.name}</label>
	<br> <label>Subject is </label> <label>${student.subject}</label>
	<br>
</form>
</body>
</html>