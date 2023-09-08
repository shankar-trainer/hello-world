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
	<form action="UserController">
		<h1>Loan Application Login</h1>
		<div>
			<label>Enter Id</label> <input id="id" name="id">
		</div>
		<div>
			<label>Enter Name</label> <input id="name" name="name">
		</div>

		<div>
			<label>Enter Salary(Monthly Income)</label> <input id="salary"
				name="salary">
		</div>

		<div style="margin-top: 20px;">
			<label>Select Loan Type</label>
			<div>
				<br> <input type="radio" value="homeloan" name="type">HomeLoan<br>
				<input type="radio" value="personalloan" name="type">PersonalLoan
			</div>
		</div>


		<div style="margin-top: 10px;">
			<input type="submit"> <input type="reset">
		</div>

	</form>
</body>
</html>