<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import
url("css/user.css")
</style>
<style type="text/css">
body {
	background-color: lightyellow;
}

.type {
	font-weight: bold;
	font-style: italic;
	font-size: 20px;
}

form {
	margin-top: 50px;
	width: 30%;
}
</style>
</head>
<body>

	<form action="EmployeeController">
		<h1>Employee Page</h1>
		<div>
			<label>Employee Id</label> <input name="empId">
		</div>
		<div>
			<label>Employee Name</label> <input name="empName">
		</div>
		<div>
			<label>Employee PassWord</label> <input name="empPass" type="password">
		</div>
		<div>
			<div style="margin-top: 10px;">
				<span class="type">Employee Type</span>
			</div>
			<div>
				<div>
					<input name="type" type="radio" value="Software Department">Software
					Department
				</div>

				<div>
					<input name="type" type="radio" value="Management Department">Management
					Department
				</div>
			</div>

		</div>
		<div style="margin-top: 10px">
			<input type="submit"> <input type="reset">
		</div>
	</form>


</body>
</html>