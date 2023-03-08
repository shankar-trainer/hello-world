<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.hello{
  border:solid red;
  width:30%;
  padding:50px;
  background: pink;
  margin: auto;
  
}
</style>
</head>
<body>
<div class="hello">
<%
String cname=request.getParameter("company");
out.println("company is "+cname);
%><br>
date is <%=new java.util.Date() %>
</div>
</body>
</html>