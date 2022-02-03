<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link  rel='stylesheet' type='text/css' href="css/style1.css"  >
</head>
<body>
<h2 style="margin-left:300px;">Date is <%=new Date() %></h2>

<form  action="userdata.jsp">

<label>Enter id </label>
<input name="id"><br>

<label>Enter Name </label>
<input name="name"><br>

<label>Enter Salary </label>
<input name="salary"><br>

<input type='submit' value='login'>
<input type='reset' value='cancel'>

</form>
</body>
</html>