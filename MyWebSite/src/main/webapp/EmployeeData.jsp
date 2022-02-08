<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style1.css">

</head>
<body>
<%@page import="java.util.Date"%>
<%@page errorPage="error1.jsp" %>

<%  
 int id=Integer.parseInt(request.getParameter("id"));
 String name=request.getParameter("name");
  
 out.print("date is   "+new Date());
 out.print("id is "+id);
  out.print("<br>name is "+name);
%>
<br>
<label>Id is  <%=id %>  </label> <br>
<label>Name is  <%=name %>  </label> 
</body>
</html>