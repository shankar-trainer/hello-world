<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Id is <%=request.getParameter("id") %>
<% 
String name=request.getParameter("name");
String salary=request.getParameter("salary");
out.println("<br>name is "+name);
out.println("<br>salary  is "+salary);
%>
<p>
<b>salary is <%=salary %></b>
</body>
</html>