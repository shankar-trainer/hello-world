<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
background: red;
color:yellow;
}
</style>
<title>Insert title here</title>
</head>
<body>

<%@page isErrorPage="true" %>
<h2>Error page</h2>
Error is <%=exception %>

</body>
</html>