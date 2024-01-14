<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("../../style1.css");

</style>
</head>
<body>
	<form action="cstform" method="post">
	<h1>Customer Form</h1>
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