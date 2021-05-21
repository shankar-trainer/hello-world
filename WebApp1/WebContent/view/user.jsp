<%@page import="com.cts.model.Login"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Page</h1>
	welcome user
	<%-- <br> your id is
	<%
		Login login = (Login) request.getAttribute("login");
		out.print(login.getId());
	%> --%>
<br> 
Country is ${country}<br>
Id is ${login.id}<br>
User type  ${login.utype}

</body>
</html>