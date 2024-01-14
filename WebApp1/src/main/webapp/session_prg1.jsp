<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
Id is <%=session.getId() %>
</div>

<div>
Session  max inactive interval  <%=session.getMaxInactiveInterval() %>
</div>

<div>
Session  created at   <%=new Date(session.getCreationTime()) %>
</div>
<div>
Session last accessed at <%=new Date(session.getLastAccessedTime()) %>
</div>



</body>
</html>