<%@page import="org.aurionpro.UserForm"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.style1 {
	background: yellowlight;
	color: blue;
	border: 5px;
	margin-left: 300px margin-top:100px;
}

label {
	width: 120px;
}
</style>

</head>
<body>
	<h1>Success page</h1>
	<%
		UserForm user = (UserForm) request.getAttribute("user");
	%>

	<div class="style1">
		<label>Id is</label> <label><%=user.getId()%></label> <br> 
		<label>Name	is</label> <label> <%=user.getName()%></label><br> 
		<label>Salary is</label> <label> <%=user.getSalary()%>	</label> <br>
	</div>

</body>
</html>