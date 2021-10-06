<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<style type="text/css">
label {
	width: 100px;
	float: left;
}

input {
	width: 120px;
	margin-bottom: 2px;
}

input[type='submit'] {
	width: 90px;
	margin-top: 5px;
	margin-bottom: 2px;
	margin-right: 15px;
}

input[type='reset'] {
	width: 90px;
	margin-bottom: 2px;
}

.error {
	color: red;
	font-weight: bold;
	margin-left: 10px;
}

form {
	margin-left: 450px;
	margin-top: 100px;
	width: 50%;
	border: inset yellow 10px;
	padding: 20px;
	background: yellow;
	color: blue;
}

h1 {
	margin-left: 450px;
}

body {
	background: aqua;
}
</style>
<script type="text/javascript">
	function validate() {
		var id = document.getElementById('id').value
		var name = document.getElementById('name').value
		var salary = document.getElementById('salary').value
		if (id == "") {
			alert("id is blank")
			return false
		} else if (name == "") {
			alert("name is blank")
			return false
		} else if (salary == "") {
			alert("salary is blank")
			return false
		} else
			return true;
	}
</script>


</head>
<body>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<a href="../index.jsp">Home</a>
<br>
<br>
<br>

	<h1>Add Customer Form</h1>
	<form:form action="../customer/addCustomer" modelAttribute="cst">
	
<%-- 		<label for="id">Enter Id</label>
		<form:input path="id"/>
		<br> --%>

		<label>Enter Name</label>
		<form:input path="name" id="name"/>
		<br>

		<label>Enter Salary</label>
		<form:input path="salary" id="salary"/>
		
		<br>
		<input type="submit" value="Add Customer">
	</form:form>

</body>
</html>