<%@page import="com.coforge.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
@import url("css/style1.css");
</style>
<style type="text/css">
.hello {
	width: 40%;
}
label {
	width:150px;
}
</style>
</head>
<body>

	<div class="hello">
		<h1>Personal Loan Page</h1>

		<%
		if (session.isNew()) {
		%>
		<h2>Your Session has expired</h2>
		<br> <a href="index.jsp">Login Again</a> <br>
		<%
		} else {
		%>

		<jsp:useBean id="user" scope="session" class="com.coforge.model.User" />
		<label>Loan Amount <%=request.getAttribute("amount") %></label><br>
		Id is
		<jsp:getProperty property="id" name="user" /><br> Name is
		<jsp:getProperty property="name" name="user" /><br> Salary is
		<jsp:getProperty property="salary" name="user" /><br>
		<hr>
		<%
		}
		%>
	</div>
</body>
</html>