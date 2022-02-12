<%@page import="edu.lpu.model.Employee"%>
<html>
<body>
<% 
Employee employee=(Employee)request.getAttribute("emp");



%>
Id  is <%=employee.getId() %><br>
name  is <%=employee.getName() %><br>
Salary  is <%=employee.getSalary() %><br>

</body>
</html>