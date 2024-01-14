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
	<form>
	<h1>Customer Data</h1>
		<div>
			Id is ${customer.customerId}
		</div>
		<div>
		Name is ${customer.customerName}
		</div>
		<div>
		salary is ${customer.customerSalary}
		</div>

	</form>
</body>
</html>