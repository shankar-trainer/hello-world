<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  
int isbn=Integer.parseInt(request.getParameter("isbn"));
String bname=request.getParameter("bname");
String author=request.getParameter("author");

%>
Isbn is <%=isbn %><br>
Book Name is <%=bname %><br>
Author is <%=author %><br>

</body>
</html>