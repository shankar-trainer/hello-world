<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("../CSS/style1.css");
</style>

</head>
<body>

<div class="error">
<h2> You have following error </h2>
<%@page isErrorPage="true" %>
<%=exception.getMessage() %>
	<button  onclick="javascript:history.back()">Back</button> 
</div>

</body>
</html>