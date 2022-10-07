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
<h1>Error Page</h1>

Error is <%=exception.getMessage() %>
</body>
</html>