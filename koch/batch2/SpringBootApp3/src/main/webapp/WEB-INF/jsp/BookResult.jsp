<%@page import="com.cognizant.model.Person"%>
<%@page import="com.cognizant.model.Book"%>
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

out.println("<h3>Person Information </h3>");

Person per1=(Person)  session.getAttribute("person");
out.println("<br>id is "+per1.getId());
out.println("<br>name is "+per1.getName());
out.println("<br>salary is "+per1.getSalary());

out.println("<p><h3>Book Information </h3>");
Book b1=(Book)  session.getAttribute("book");
out.println("<br>Isbn is "+b1.getIsbn());
out.println("<br>Name is "+b1.getBname());
out.println("<br>Cost is "+b1.getCost());
%>
</body>
</html>