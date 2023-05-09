<%@page import="org.tvscreditserviceltd.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table{
 border:solid 10px;
 margin-left:200px;
 margin-top:50px;
}
tr,td{
 border:solid;
 color:blue;
}
th{
border:solid;
font-weight: bold;
}

</style>
</head>
<body>
	<%
		List<Customer> list1 = (List<Customer>) session
				.getAttribute("list1");
	 
	%>
	<table>
		<tr>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Customer Salary</th>
		</tr>
<%for (Customer c : list1) { %>
	<tr>
	<td><%=c.getCustomerId() %></td>
	<td><%=c.getCustomerName() %></td>
	<td><%=c.getCustomerSalary() %></td>
	</tr>
	<%
		}
	%>
	</table>
</body>
</html>