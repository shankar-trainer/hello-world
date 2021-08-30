<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bus Booking page</h1>
Ticket Id <%=request.getParameter("id") %><br>
Ticket Cost <%=request.getParameter("cost") %><br>
Ticket from Location <%=request.getParameter("location") %><br>
Ticket from Destination <%=request.getParameter("destination") %><br>
</body>
</html>