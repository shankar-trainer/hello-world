<%@page import="com.cts.dao.Customer"%>
<%@page import="java.util.List"%>
<%@page import="com.cts.dao.CustomerDaoImpl"%>
<%@page import="com.cts.dao.CustomerDaoImplService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	CustomerDaoImplService dao = new CustomerDaoImplService();
	CustomerDaoImpl customerDaoImplPort = dao.getCustomerDaoImplPort();
	List<Customer> clist = customerDaoImplPort.getAllCustomer();

	if (clist.isEmpty()) {
	%>
	<h2>No record Present</h2>
	<%
	} else {
	%>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>
		<%
		for (Customer c : clist) {
		%>
		<tr>
			<td><%=c.getId()%>
			<td><%=c.getName()%>
			<td><%=c.getSalary()%>
		</tr>
		<%
		}
		%>
	</table>
	<%
	}
	%>

</body>
</html>