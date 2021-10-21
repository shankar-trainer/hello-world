<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.style1{
 
margin-left:250px;
margin-top:100px;
width:50%;
background: yellow;
color:blue;
border:double 4px;
padding: 10px;
}
</style>
</head>
<body>

<div class="style1">
   <h1>Employee Information</h1>
   Id is ${emp.id}<br>
   Name is ${emp.name}<br>
   Salary is ${emp.salary}<br>
   City is ${city}<br>
   
   <%  
   String city1=(String)request.getAttribute("city");
   
   %>
   <h2>City is <%=city1 %></h2>
</div>


</body>
</html>