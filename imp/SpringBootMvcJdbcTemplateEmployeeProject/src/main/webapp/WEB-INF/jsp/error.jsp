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
error is 
<%=exception.getMessage() %>
      <h3>${exception.exceptionMsg}</h3>

</body>
</html>