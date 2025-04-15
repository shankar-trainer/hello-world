<!DOCTYPE html>
<html>
  <head>
	 <style>
		@import url("employee.css");
		</style>
	</head>
	
<body>
	<%@page errorPage="error.jsp" %>
	
	<form action="employeeAction" method="post">
	<h1>Employee Form</h1>
		<div>
			<label>Enter Id </label>
			<input name="empId">
		</div>
		<div>
			<label>Enter Name </label>
			<input name="empName">
		</div>
		<div>
			<label>Enter Salary </label>
			<input name="empsalary">
		</div>
		<div>
			<button type='submit'>Login</button>
			<button type='reset'>Cancel</button>
			<div>
	</form>	


</body>

</html>