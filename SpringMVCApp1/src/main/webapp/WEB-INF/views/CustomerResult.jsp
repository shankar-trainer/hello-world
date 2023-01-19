<%@page import="com.pathinfotech.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Data</h1>
<%-- Id is ${customer.CustomerId}<br>
Name is ${customer.CustomerName}<br>
Salary is ${customer.CustomerSalary}<br>
 --%>
 <hr>
<%  
Customer customer=(Customer)  request.getAttribute("customer");

%>
Id is <%=customer.getCustomerId() %><br>
Name is <%=customer.getCustomerName() %><br>
Salary is <%=customer.getCustomerSalary() %><br>

</body>
</html>