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
	width:40%;
}
tr,td,th{
  border:solid blue  1px;
}
</style>
</head>
<body>
<h1>Customer Result page</h1>

	<%
		Customer customer = (Customer) request.getAttribute("customer");
	%>
	<table>

<tr>
<th>Id</th>
<th>Name</th>
<th>Salary</th>
</tr>
		<tr>
			<td><%=customer.getId()%></td>
			<td><%=customer.getName()%></td>
			<td><%=customer.getSalary()%></td>
		</tr>
	</table>
	<br>
	<input type="button" value="back" onclick="javascript:history.back()" style="margin-left: 400px;">
	
</body>
</html>