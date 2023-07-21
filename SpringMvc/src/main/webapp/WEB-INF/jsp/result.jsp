<%@page import="com.coforge.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Employee emp = (Employee) request.getAttribute("employee");
	%>
	<div>
		Id is
		<%=emp.getId()%>
	</div>
	<div>
		Name is
		<%=emp.getName()%>
	</div>
	<div>
		Salary is
		<%=emp.getSalary()%>
	</div>

</body>
</html>