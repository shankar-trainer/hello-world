<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("css/style1.css");
</style>
<style>
 form{
 width:40%;
 margin-left: 400px;
 }
 h1{
 margin-left: 100px;
 }
</style>
</head>
<body>
<% 
String id= request.getParameter("id");
String product1= request.getParameter("prd1");
String product2= request.getParameter("prd2");
%>

<form action="payment.jsp">
<h2>Products Purchased Are </h2>
    <p>Welcome User 
    <p> Your id is <%=id %> 
    <ol>
    <li><%=product1 %></li>
    <li><%=product2 %></li>
    </ol>
    
    <% 
     session.setMaxInactiveInterval(10);
    
     session.setAttribute("id", id);
     session.setAttribute("prd1", product1);
     session.setAttribute("prd2", product2);
    %>
		<h1>Shopping page</h1>
		<div>
			<label>Product3 </label> <input name="prd3">
		</div>
		<div>
			<label>Product4 </label> <input name="prd4">
		</div>
		
		<input type="submit">
		<input type="reset">

	</form>

</body>
</html>