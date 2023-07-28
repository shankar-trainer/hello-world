<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("../../employee.css");
</style>
<style type="text/css">
 .id1{
 margin-left: 350px;
 }
</style>
</head>
<%@page import="com.abc.model.Employee"%>
<%@page import="java.util.List"%>

<body>
	<div class="myclass">
	<h2>Record Added</h2>
		<div>Id is ${employee.id}</div>
		<div>Name is ${employee.name}</div>
		<div>salary is ${employee.salary}</div>
	</div>
	
	<div>
	<h2 class="id1">All Employee Records Are  </h2>
	<% 
	List<Employee> emplist=(List<Employee>)	request.getAttribute("list");
	 out.print("<table>");
	for(Employee e:emplist){
	 out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>");
	}
	 out.print("</table>");
	%>
	</div>
	
	
</body>
</html>