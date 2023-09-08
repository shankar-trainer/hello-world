<%@page import="com.coforge.model.User"%>
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
 width: 40%;
}
</style>
</head>
<body>

<div class="hello">
   <h1>Home Loan Page</h1>
   <% 
   if(session.isNew()){
   %>
      <h2>Your Session has expired</h2>
      <br>
      <a href="index.jsp">Login Again</a>
      <br>
      
   <% } else {
  User user= (User)session.getAttribute("user");
	   %>
   <label>Id is <%=user.getId() %></label><br>
   <label>Name is <%=user.getName() %></label><br><br>
   <label>Salary is <%=user.getSalary() %></label><br>
   <%} %>
   <hr>
   
</div>
</body>
</html>