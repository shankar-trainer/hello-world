<%@page import="cts.com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome Admin</h1>

<%  

 User user=(User) request.getAttribute("user1");

out.print("id is "+user.getId());
out.print("<br>Name is "+user.getName());


%>
</body>
</html>