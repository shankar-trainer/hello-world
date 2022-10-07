<%@page import="java.text.DateFormat"%>
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
<%  
 Date date2=(Date) session.getAttribute("date");
  DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG);
  
  out.println("Long format "+dateFormat.format(date2));
%>
<h2>Using jstl date format </h2>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

Long date format <fmt:formatDate value="${date}" dateStyle="long"/><br>
Short date format <fmt:formatDate value="${date}" dateStyle="short"/><br>
Medium date format <fmt:formatDate value="${date}" dateStyle="medium"/><br>


</body>
</html>