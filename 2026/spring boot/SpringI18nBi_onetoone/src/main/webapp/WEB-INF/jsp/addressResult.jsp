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
	Address	Added in database
		<p>
		<div>id is ${address1.addr_id}</div>
		<div>location is ${address1.location}</div>
		<div>pin is ${address1.pincode}</div>

		
		<%   
		
	var emp=(Employee)request.getAttribute("employee");
		session.setAttribute("emp1",emp);
		
		%>
	</div>
	
</body>
</html>