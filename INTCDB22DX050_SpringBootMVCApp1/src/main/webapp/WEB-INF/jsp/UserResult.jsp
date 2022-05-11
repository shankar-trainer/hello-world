Id is ${user.id}<%@page import="com.cognizant.model.User"%>
<br>
Name is ${user.name}
<br>
Salary is ${user.salary}
<br>

<hr>
<%
User user = (User) session.getAttribute("user");
%>
<h2>Using Session </h2>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
	</tr>
	<tr>
	<td><%=user.getId() %></td>
	<td><%=user.getName() %></td>
	<td><%=user.getSalary() %></td>
	</tr>
</table>
