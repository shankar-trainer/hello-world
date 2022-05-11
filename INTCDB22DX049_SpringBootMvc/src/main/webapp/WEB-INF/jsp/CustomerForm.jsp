<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label {
	width: 110px;
	float: left;
}

input {
	width: 110px;
	margin-bottom: 5px;
}

form {
	background: yellow;
	text: blue;
	padding: 20px;
	border: solid 4px;
	margin-left: 300px;
	margin-top: 160px;
	width: 30%;
}

body {
	background: lightyellow;
}
</style>
<script>
	function validate() {
		console.log("validate called")
		var id = document.getElementById("custId").value
		var name = document.getElementById("custName").value
		var salary = document.getElementById("custSalary").value
		if (id == "") {
			
			alert("id is blank")
			console.log("id is blank")
			return false;
		} else if (name == "") {
			alert("name is blank")
			return false;
		} else if (salary == "") {
			alert("salary is blank")
			return false;
		} else
			return true;
	}
</script>
</head>
<body>
	<%
	session.setMaxInactiveInterval(10);
	%>

	<form action="cAction" onsubmit="return validate()">
		<label>Enter Id</label> <input name="custId" id="custId"><br>

		<label>Enter Name</label> <input name="custName" id="custName"><br>

		<label>Enter Salary</label> <input name="custSalary" id="custSalary"><br>
		<input type="submit"> <input type="reset">
	</form>
</body>
</html>