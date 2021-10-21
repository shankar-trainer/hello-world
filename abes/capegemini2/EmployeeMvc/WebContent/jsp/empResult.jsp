<%@page import="org.com.controller.Employee" %>
<%@page language="java" contentType="text/html;charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Employee Record</h1>
<% Employee emp=(Employee) request.getAttribute("emp");
	out.println("id is "+emp.getId());
	out.println("name is "+emp.getName());
	out.println("salary is "+emp.getSalary());

%>

<hr size="10pt">
Id is ${emp.id}<br>
Name is ${emp.name}<br>
salary is ${emp.salary}<br>
City is ${emp.city}<br>
 
</body>
</html>