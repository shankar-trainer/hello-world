<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="AccountController">
		<div>
			<label>Enter Account Id</label> <input name="acccountNo">
		</div>

		<div>
			<label>Enter Account User Name</label> <input name="acccountUserName">
		</div>

		<div>
			<label>Enter Account Balance</label> <input name="acccountBalance">
		</div>

		<div>
			<label>Select Account Type</label>
		</div>
		<div>
			<select name="actType">
				<option value="saving">Saving Account</option>
				<option value="current">Current Account</option>
			</select>
		</div>
		<div>
			<input type="submit"> <input type="reset">
		</div>


	</form>

</body>
</html>