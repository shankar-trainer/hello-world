<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- 
<style>
@import url("../css/person.css");
</style>
 -->
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
div{
margin-left:30px;
}
</style>
</head>
<body>

	<form action="empform" method="post">
		<div>
			<h1>Person Form</h1>

			<label>Enter Id</label> <input name="id"><br> 
			<label>Enter Name</label> <input name="name"><br> 
			<label>Enter Salary</label> <input name="salary"><br> 
			<input type="submit">
			<input type="reset">
		</div>
	</form>
</body>
</html>