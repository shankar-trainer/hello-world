<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Account Result</h1>
	Name is ${account.name}
	<br> Account Type is
	<%
	out.print("<ol>");
	for (String s : request.getParameterValues("acttype"))
		out.print("<li>" + s);

	out.print("</ol>");
	%>
	<br> Balance is ${account.balance}
	<br> Account Creation date is ${account.accountCreationDate}
	<br> Equity Allocation is ${account.equityAllocation}
	<br> Gender is ${account.gender[0]}
	<br>
</body>
</html>