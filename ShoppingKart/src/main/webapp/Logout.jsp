<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
session.invalidate();
%>
<h2>You have Logged Out Successfully</h2>
<br>
 <a href='ShoppingForm.jsp'>Login Again</a>
	
</body>
</html>