<%@page import="org.com.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table,h1 {
	border: double 1px;
	margin-left: 300px;
	width: 40%;
}

tr, td, th {
	border: solid blue 1px;
}
</style>
</head>
<body>

	<%
		Customer customer[] = (Customer[]) request.getAttribute("customer");
	    if(customer.length>=1){
	%>
	<table>

		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>
		<%
			for (Customer customer2 : customer) {
		%>

		<tr>
			<td><%=customer2.getId()%></td>
			<td><%=customer2.getName()%></td>
			<td><%=customer2.getSalary()%></td>
		</tr>

		<%
			}
		%>

	</table>
	<% }
	    else
	    {
	    %>
	    <h1>No Customer Record</h1>
	    <%} %>
	<br>
	<input type="button" value="back" onclick="javascript:history.back()"
		style="margin-left: 400px;">
</body>
</html>