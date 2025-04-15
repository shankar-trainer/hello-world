<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Employee Error</h2>
<%@page isErrorPage="true" %>
<h1>Error Page</h1>

<%=exception.getMessage() %>
</body>
</html>