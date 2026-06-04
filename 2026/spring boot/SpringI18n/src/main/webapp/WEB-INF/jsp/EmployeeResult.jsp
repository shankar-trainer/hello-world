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
		<div>id is ${employee.id}</div>
		<div>name is ${employee.name}</div>
		<div>salary is ${employee.salary}</div>
	</div>
</body>
</html>