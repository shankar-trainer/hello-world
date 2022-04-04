<%@page import="com.capgemini.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Information</h1>

<%

Employee employee=(Employee)request.getAttribute("emp");
out.println(" id is "+employee.getId());
out.println("<br>name is "+employee.getName());
out.println("<br> salary is "+employee.getSalary());

%>
</body>
</html>