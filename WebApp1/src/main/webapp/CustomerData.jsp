<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page errorPage="myerror.jsp" %>

<%  

int id=Integer.parseInt(request.getParameter("id"));

String nm=request.getParameter("name");

out.println("id is "+id);
out.println("<br>name  is "+nm);
%>
</body>
</html>