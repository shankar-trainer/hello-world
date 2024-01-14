<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<spring:url value='/resources/style1.css'/>" />
</head>
<body>
	<script type="text/javascript">
		function validate() {
			var id = document.getElementById("id").value
			var name = document.getElementById("name").value
			var salary = document.getElementById("salary").value
			console.log('called  id '+id)
			
			if (id == "") {
				document.getElementById("err_id").innerHTML = "id is blank"
				return false;
			} else if (id <= 0) {
				document.getElementById("err_id").innerHTML = "id is zero or -ve"
				return false;
			} else if (name == "") {
				document.getElementById("err_id").innerHTML = ""
				document.getElementById("err_name").innerHTML = "name is blank"
				return false;
			} else if (salary == "") {
				document.getElementById("err_name").innerHTML =""
				document.getElementById("err_salary").innerHTML = "salary is blank"
				return false;
			} else if (salary<=0) {
				document.getElementById("err_salary").innerHTML = "salary is zero or -ve"
				return false;
			}
			else{
				return true;
			}
		}
	</script>
	<form action="hello" method="post" onsubmit="return validate()">
		<h1>User Form</h1>
		<h4>Javascript Validation</h4>
		<div>
			<label>Enter Id</label> <input name="id" id="id"> 
			<span	id="err_id"></span>
		</div>
		<div>
			<label>Enter Name</label> <input name="name" id="name"> <span
				id="err_name"></span>
		</div>
		<div>
			<label>Enter Salary</label> <input name="salary" id="salary">
			<span id="err_salary"></span>
		</div>

		<div>
			<button type="submit">Login</button>
			<button type="reset">Cancel</button>
		</div>
	</form>
</body>
</html>