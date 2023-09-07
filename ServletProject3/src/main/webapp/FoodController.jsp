<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String foodtype = request.getParameter("ftype");

	if (foodtype.equals("north")) {
	%>
	<jsp:forward page="result/northindianfood.jsp"></jsp:forward>
	<%
	}

	else if (foodtype.equals("south")) {
	%>
	<jsp:forward page="result/southindianfood.jsp"></jsp:forward>
	<%
	}
	%>
</body>
</html>