<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
@import url("../../style1.css");
</style>
</head>
<body>
<%@ page isErrorPage="true"    %>

<div class="style1" style="width:30%">
<h2> Error Page</h2>
Error is <%=exception.getMessage() %>
<p>
<a href="insurance/form">insurance form</a>

</div>
</body>
</html>