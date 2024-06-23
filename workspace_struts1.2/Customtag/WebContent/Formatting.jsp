<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  

Date date=new Date();
SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	out.print(dateFormat.format(date));
	
	dateFormat=new SimpleDateFormat("dd-MMM-yyyy EEEEE");
	out.print("<br>"+dateFormat.format(date));
	
	dateFormat=new SimpleDateFormat("hh:mm:ss");
	out.print("<br>"+dateFormat.format(date));
	
  request.setAttribute("date", date);
%>
<h2>Using jstl formatting</h2>

<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<f:formatDate value="${date}" pattern="dd-MM-yyyy"/><br>
<f:formatDate value="${date}" pattern="dd-MMM-yyyy EEEEE"/><br>
<f:formatDate value="${date}" pattern="dd-MM-yyyy hh:mm:ss a"/><br>
</body>
</html>