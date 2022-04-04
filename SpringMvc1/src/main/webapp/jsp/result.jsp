<%@page import="com.capgemini.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Data</h1>
<%
User u=(User)request.getAttribute("user");
out.println("user id is "+u.getId());
out.println("<br>user name is "+u.getName());
out.println("<br>user salary is "+u.getSalary());

%>
</body>
</html>