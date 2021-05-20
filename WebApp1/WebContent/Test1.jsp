<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp page</h1>
	Date is
	<%=new java.util.Date()%>

	<%!int count = 1;%>


	<%
		int x = 1;
	%>


	<br> count is
	<%=count++%><br> count1 is
	<%=x++%>

</body>
</html>