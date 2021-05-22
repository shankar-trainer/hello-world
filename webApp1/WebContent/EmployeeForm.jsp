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
  label {
	 width: 100px;
	 float: left;
}
input {
	 width: 120px;
	 margin-top: 5px;
}
input[type='submit']{
 width:100px;
}
form {
   margin-left: 400px;
   margin-top: 200px;
   background-color: orange;
   color:blue;
   border:solid;
   width:30%;	
   padding: 1em;
}
</style>
</head>
<body>

<form action="UserServlet">

<%  

LocalDate date=LocalDate.now();
LocalTime time=LocalTime.now();

%>
Date is <%=date %><br>
Time is <%=time %>
<br><br>

  <label>Enter Id </label>
  <input name="id">
     <br> 
  <label>Enter Name </label>
  <input name="name">
  <br>
  <input type="submit" value="Login">
  <input type="reset" value="Cancel">
 
</form>

</body>
</html>