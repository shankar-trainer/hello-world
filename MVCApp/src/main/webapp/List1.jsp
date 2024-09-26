<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
		List<String> list1 = new ArrayList<>();
		list1.add("java beginner");
		list1.add("java for dummies");
		list1.add("java expert");
		list1.add("java in action");
		session.setAttribute("book", list1);
	%>
	<h2>All Books are</h2>
	${book[0] }
	<br> ${book[1] }
	<br> ${book[2] }
	<br> ${book[3] }
	<br>


</body>
</html>