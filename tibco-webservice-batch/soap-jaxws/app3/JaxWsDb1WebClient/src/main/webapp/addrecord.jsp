<%@page import="com.cts.dao.Customer"%>
<%@page import="java.util.List"%>
<%@page import="com.cts.dao.CustomerDaoImpl"%>
<%@page import="com.cts.dao.CustomerDaoImplService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.welcome {
	border: double 12pt;
	width: 30% padding:120pt;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	CustomerDaoImplService dao = new CustomerDaoImplService();
	CustomerDaoImpl customerDaoImplPort = dao.getCustomerDaoImplPort();
	%>
	<%
	int id = Integer.parseInt(request.getParameter("id"));

	String name = request.getParameter("name");
	float salary = Float.parseFloat(request.getParameter("salary"));

	Customer customer = new Customer();
	customer.setId(id);
	customer.setName(name);
	customer.setSalary(salary);
	try {
		if (customerDaoImplPort.addCustomer(customer)) {
	%>
	<div class="welcome">
		<div>Record added</div>
		<div>
			id =<%=id%></div>
		<div>
			name =<%=name%></div>
		<div>
			salary =<%=salary%></div>
	</div>
	<%
	} else
	out.println("Record not added");
	} catch (Exception e) {
	out.println("error is " + e.getMessage());
	}
	%>

</html>