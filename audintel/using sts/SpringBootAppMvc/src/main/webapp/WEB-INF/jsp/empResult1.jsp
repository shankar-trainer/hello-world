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
List<Employee>  list=(List<Employee>)request.getAttribute("empList");
 for(Employee e:list)
  //out.println("<br>"+e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
  out.println("<br>"+e);
%>
</body>
</html>