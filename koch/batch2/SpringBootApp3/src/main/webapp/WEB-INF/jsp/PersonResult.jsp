<%@page import="com.cognizant.model.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label {
	float: left;
	width: 100px;
}

input {
	width: 120px;
}

form {
	color: blue;
	background: yellow;
	width: 40%;
	margin-left: 400px;
	margin-top: 50px;
	padding: 10px;
	border: solid 2px;
}

body {
	background: lightyellow;
}
div{
margin-left:30px;
}
</style>

</head>
<body>
Id is ${person.id}<br>
Name is ${person.name}<br>
Salary is ${person.salary}<br>
<hr>
Using Session 
<hr>
<%

Person per1=(Person)  session.getAttribute("person");
out.println("<br>id is "+per1.getId());
out.println("<br>name is "+per1.getName());
out.println("<br>salary is "+per1.getSalary());

%>
	<form action="bookaction" method="post">
		<div>
			<h1>Book Form</h1>

			<label>Enter ISBN</label> <input name="isbn"><br> 
			<label>Enter Book Name</label> <input name="bname"><br> 
			<label>Enter Cost</label> <input name="cost"><br> 
			<input type="submit">
			<input type="reset">
		</div>
	</form>



</body>
</html>