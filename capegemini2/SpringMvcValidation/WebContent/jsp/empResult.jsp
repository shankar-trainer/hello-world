<%@page import="org.com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Employee Record </h1>
<%  
Employee emp=(Employee)   request.getAttribute("emp");
out.println("Id is "+emp.getId());
out.println("<br>Name is "+emp.getName());
out.println("<br>Salary is "+emp.getSalary());

%>
<hr size="10pt" color="blue">

Id is ${emp.id}<br>
Name is ${emp.name}<br>
Salary is ${emp.salary}<br>
City is ${city}<br>

</body>
</html>