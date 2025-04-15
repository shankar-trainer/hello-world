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
<h2> Error page</h2>
<%=exception.getMessage() %>

<div>
<a href='libraryForm'>Go back</a>

</div>
</body>
</html>