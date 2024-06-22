<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label {
	width: 110pt;
	float: left;
}

input {
	width: 100pt;
}

form {
	width: 30%;
	margin-left: 300pt;
	margin-top: 30pt;
	padding: 2em;
	background-color: orange;
	border: double 10pt;
}
</style>
</head>
<body>

	<form action="userAction">
	<h1>User Form</h1>
		<div>
			<label>Enter Id</label> <input name="id">
		</div>

		<div>
			<label>Enter Name</label> <input name="name">
		</div>

		<div>
			<input type="submit" value="send"> <input type="reset"
				value="send">
		</div>

	</form>

</body>
</html>

