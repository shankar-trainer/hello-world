<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List"%>
<%@ page import="com.aurionpro.model.EmployeeForm"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
 table{
  border: solid 5px;
  margin-left: 300px;
  margin-top: 10px;
  background-color: yellow;
  padding:20px;
 }
tr,td{
  border:solid 1px;
}
body{
	background-color: lightyellow;
}
h3{
  margin-left: 300px;
  margin-top: 100px;
}
</style>	
</head>
<body>

<% 
String status=  request.getAttribute("status").toString();

if(status.equals("showall")){
  	List<EmployeeForm> list1=(List<EmployeeForm>) request.getAttribute("emplist");
  	out.println("<h3>Employee Record</h3>");
	out.println("<table>");
	for(EmployeeForm emp:list1){
  out.println("<tr><td>"+emp.getId()+"</td><td>"+emp.getName()+"</td><td>"+emp.getSalary()+"</td></tr>");
     }
	out.println("</table>");
%>

<%
}
else
  out.println("<h3>"+request.getAttribute("status")+"</h3>");
%>
</body>
</html>