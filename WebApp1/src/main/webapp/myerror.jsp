<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page isErrorPage="true" %>
<div>
    <h2>Error Page </h2>
    <div>Error is <%=exception %> </div> 
</div>
</body>
</html>