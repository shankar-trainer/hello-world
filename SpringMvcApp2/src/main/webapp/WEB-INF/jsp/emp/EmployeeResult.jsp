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
  Employee emp= (Employee)request.getAttribute("employee");
%>
  Id is ${employee.id}<br>
  Name is ${employee.name}<br>
  Salary is ${employee.salary}<br>
  Gender is <% for(String s:emp.getGender()){
	  out.print(s);
	  
  } %><br>
  Hobbies is <%
  
		  for(String s:emp.getHobbies()){
			  out.print(s+"   ");
			  
		  }
  
  %><br>
</body>
</html>