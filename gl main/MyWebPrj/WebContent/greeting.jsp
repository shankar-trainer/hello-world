<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@IMPORT url("style/style1.css");
</style>
</head>
<body>
<% 
String error=request.getParameter("err");
if(error!=null)
  out.print("<center><font size='5' color='red'>"+error+"</font></center>");	
%>
	<form action="userinfo.jsp">
		<label>Enter Id</label> <input name="id" > <br> 
		<label>Enter Name</label> <input name="name"> <br> 
		<input type="submit" value="Login"> 
		<input type="reset" value="Cancel">
	</form>

</body>
</html>