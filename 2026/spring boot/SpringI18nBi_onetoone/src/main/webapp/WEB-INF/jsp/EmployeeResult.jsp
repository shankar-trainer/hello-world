<%@page import="com.cts.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
@import url("../../style1.css");

label {
	float: left;
	width: 100pt;
}

.style1 {
	width: 30%;
}
</style>
</head>
<body>

	<div class="style1">
		Added in database
		<p>
		<div>id is ${employee.id}</div>
		<div>name is ${employee.name}</div>
		<div>salary is ${employee.salary}</div>

		<fieldset>
		<%   
		
	var emp=(Employee)request.getAttribute("employee");
		session.setAttribute("emp1",emp);
		
		%>
			<form action="/employee/addAddress" method="post">
				<h3>Address Form</h3>
				<div>
					<label>Enter location</label> <input name="location">
				</div>

				<div>
					<label>Enter PinCode</label> <input name="pincode">
				</div>
				<div>
					<button type="submit">Add Address</button>
					<button type="reset">Cancel</button>
				</div>
			</form>
		</fieldset>
	</div>
</body>
</html>