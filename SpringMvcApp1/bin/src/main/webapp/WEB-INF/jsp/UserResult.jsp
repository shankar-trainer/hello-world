Id is ${user.id}<%@page import="com.coforge.model.User"%>
<br>
Name is ${user.name}
<br>
Salary is ${user.salary}
<br>

<hr>

<%
User user = (User) request.getAttribute("user");
%>
<div>
	Id is
	<%=user.getId()%>
</div>
<div>
	Name is
	<%=user.getName()%>
</div>
<div>
	Salary is
	<%=user.getSalary()%>
</div>
