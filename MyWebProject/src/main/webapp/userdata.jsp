<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' type='text/css' href="css/style1.css">
</head>
<body>

<%@page  errorPage="error.jsp"%>

	<%
	int  id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	float salary = Float.parseFloat(request.getParameter("salary"));
	%>
	<label> Id is <%=id%>	</label><br>
	<label> Name is <%=name%>	</label><br>
	<label> Salary is <%=salary%>	</label>
</body>
</html>