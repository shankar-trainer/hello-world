<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("../../style1.css");

</style>
</head>
<body>
<%@page isErrorPage="true" %>
<form>
<h2> Error page</h2>
 <p> Error is <%=exception.getMessage() %>
</form>
</body>
</html>