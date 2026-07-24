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
<div style="border:solid;margin:100pt;padding:20pt;color:red;
width:30%;
">
<h1> This is Error page</h1>

error is <%=exception.getMessage() %>
</div>
</body>
</html>