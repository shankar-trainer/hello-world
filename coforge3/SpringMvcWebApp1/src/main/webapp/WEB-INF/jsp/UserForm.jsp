<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form {
	margin-left: 300px;
	background-color: lightyellow;
	padding: 20px;
	border: solid;
	width: 30%;
}

label {
	width: 110pt;
	float: left;
	margin-top: 5px;
}

input {
	margin-top: 5px;
	width: 110pt;
}

button {
	margin-top: 2px;
	width: 110pt;
}
</style>
</head>
<body>
	<form action="hello" method="post">
		<h1>User Form</h1>
		<div>
			<label>Enter Id</label> <input name="id">
		</div>
		<div>
			<label>Enter Name</label> <input name="name">
		</div>
		<div>
			<label>Enter Salary</label> <input name="salary">
		</div>

		<div>
			<button type="submit">Login</button>
			<button type="reset">Cancel</button>
		</div>
	</form>
</body>
</html>