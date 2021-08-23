<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Vegeterian Page </h1>

<h2>Discount is <%=request.getParameter("discount") %></h2>
User name is <%=request.getParameter("uname")%><br>
User Id is <%=request.getParameter("uid")%><br>



</body>
</html>