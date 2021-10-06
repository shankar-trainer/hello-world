<%@page import="org.com.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Employee Data  </h1>
Id is ${emp.id}<br>
Name  is ${emp.name}<br>
<%  

 Employee employee=(Employee)   request.getAttribute("emp");
  for(String s:employee.getLocation())
	  out.print("<br>"+s);


%>


</body>
</html>