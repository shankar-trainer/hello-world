<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="/tags/struts-bean" prefix="bean" %>
Id is <bean:write name="cform" property="customerId"/><br>
Name is <bean:write name="cform" property="customerName"/><br>
Salary is <bean:write name="cform" property="customerSalary"/><br>
</body>
</html>