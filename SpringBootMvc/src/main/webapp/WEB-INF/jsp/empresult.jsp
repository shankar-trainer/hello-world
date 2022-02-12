<%@page import="edu.lpu.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body {
	background: pink;
}

</style>
</head>
<body>
<%  
 Employee emp=(Employee)request.getAttribute("emp1");
  

%>
Id is <label><%=emp.getId() %></label><br>
Name is <label><%=emp.getName() %></label><br>
Salary is <label><%=emp.getSalary() %></label><br>

</body>
</html>