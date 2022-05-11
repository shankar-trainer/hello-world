<%@page import="com.cognizant.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome Customer</h2>
Id is ${customer.custId}<br>
Name is ${customer.custName}<br>
Salary is ${customer.custSalary}<br>

<hr>
<h2>Customer Records are </h2>
<%  

Customer customer=(Customer)  session.getAttribute("customer");
out.println("id is "+customer.getCustId());
out.println("<br>name is "+customer.getCustName());
out.println("<br>salary is "+customer.getCustSalary());

%>

</body>
</html>