<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: lightyellow;">

<div>
  <h2 style="margin-left:250pt;color:maroon">Coforge Ltd</h2>
  <div style="float:right">
    Date :<%=LocalDate.now() %>
  </div>
  <div style="border:solid blue;width:40%;margin-left:240pt">
     <pre>
     Greater Noida 
     UP 
     India
     </pre> 
  </div>
</div>
</body>
</html>