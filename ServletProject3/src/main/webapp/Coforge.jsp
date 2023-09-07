<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 @import url("css/style1.css");
</style>
<style type="text/css">
 .hello{
   text-align: center;
   margin-left: 250px;
   width: 60%;
 }
</style>
</head>
<body>

<div class="hello">
	<span style="float:left; color:blue;">Date :<%=LocalDate.now()%></span>
	<span style="float:right;color:blue;">Time :<%=LocalTime.now()%></span>
   <h1>Coforge India </h1>
   <h2>1 billion Company</h2>
   <h3>Greater Noida</h3>
   <h3>UP India</h3>
  </div> 
</body>
</html>