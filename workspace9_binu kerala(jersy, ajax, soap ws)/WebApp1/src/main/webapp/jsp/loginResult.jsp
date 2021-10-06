<%@page import="org.com.model.Employee"%>
<h1>Employee Result Page</h1>

id is ${emp1.id}<br>
name is ${emp1.name}<br>
salary  is ${emp1.salary}<br>
state  is ${state}<br>
country   is ${country}<br>
city   is ${city}<br>

<%   
Employee emp1=(Employee)request.getAttribute("emp1");

out.print("<br> employee id is "+emp1.getId());
%>
<br>
name is <%=emp1.getName() %><br>
salary  is <%=emp1.getName() %><br>

Employee records <br>
<%=emp1 %>
