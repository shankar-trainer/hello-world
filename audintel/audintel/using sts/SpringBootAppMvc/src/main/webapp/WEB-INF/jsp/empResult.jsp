<html>
<head>
<style>
@import url('../../user.css')
</style>
</head>
<body>
<%@ page import="com.audintel.model.Employee"%>
<%@ page import="java.util.List"%>
<%
String submit=request.getAttribute("submit").toString();
if (submit.equals("getAllEmployeeRecord")){
List<Employee>  list=(List<Employee>)request.getAttribute("empList");
 
 for(Employee e:list)
  out.println("<br>"+e.getId()+"\t"+e.getName()+"\t"+e.getSalary());

 out.println("In table<br>");

 for(Employee e:list){
  out.println("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>");
   }
  out.println("</table>");
  }
else{
%>
    <h2>Employee  Result</h2>
    Id is ${emp.id}<br>
    Name is ${emp.name}<br>
    salary is ${emp.salary}<br>
   <%
   }
    %>
</body>
</html>