<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Account Data</h2>
Id is ${account.id}<br>
Name is ${account.name}<br>
Salary is ${account.salary}<br>
Account Creation date  is ${account.actCreation}<br>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div style="color:blue;border:1px solid;background:lightyellow;width:40%;padding:20px;">
	formatted date is  ${account.actCreation}
	<fmt:formatDate value="${account.actCreation}" pattern="dd-MMM-yyyy"/><br>
	<fmt:formatDate value="${account.actCreation}" pattern="dd-MM-yyyy"/><br>
	<fmt:formatDate value="${account.actCreation}" pattern="dd-MMMMM-yyyy"/><br>
	<fmt:formatDate value="${account.actCreation}" pattern="MM-dd-yyyy"/><br>
</div>
</body>
</html>