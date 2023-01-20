<%@page import="com.pathinfotech.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table,tr,td{
 border:1px;
}

</style>
</head>
<body>
	<div style="border: inset blue 30px; background: cyan; color: blue; margin: auto; padding: 40px; width: 30%; margin-top: 100px">

   <% 
      List<Employee> empList=(List<Employee>)  session.getAttribute("list1");
   System.out.println("Result page "+empList.size()+" no of total  record");
    %>
    <table>
    <%     
   for(Employee e:empList){
     out.println("<tr><td>"+e.getEmpId()+"</td><td>"+e.getEmpName()+"</td><td>"+e.getEmpSalary()+"</td></tr>");  
       }     
   %>
   </table>

<%-- 	<s:actionerror/>
		<h1>Employee data</h1>
		Id is
		<s:property value="empId" />
		<br> Name is
		<s:property value="empId" />
		<br> Salary is
		<s:property value="empId" /> --%>
		<br>
	</div>
</body>
</html>