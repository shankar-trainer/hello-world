<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page isErrorPage="true" %>
<h1>Error Page</h1>

<%=exception.getMessage() %>
<%=exception %>
</body>
</html>