<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
     <script>
      function checkvalidation(){
       var id=document.getElementById("id").value;
       var name=document.getElementById("name").value;
        if(id=="")
          {
          alert("id is blank")
          return false
          }
        else if(isNaN(id))
          {
          alert("id is not a number")
          return false
          }
        else if(name=="")
          {
          alert("name is blank")
          return false
           }
        else if(name.length<5)
          {
          alert("name length must of at least 5 character")
          return false
          }
         else {
         return true
          }
      }
     </script>
</head>
<body>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalTime" %>
<%@ page errorPage="error.jsp" %>

 <div style="height:30pt;margin-top:20pt">
 <span style="float:left">   <%=LocalDate.now() %></span>
 <span style="float:right"><%=LocalTime.now() %></span>
 </div>

<form class="border border-warning text-light bg-dark  p-5 w-75 m-5"
 style="border-radius:20pt"
onsubmit="return checkvalidation()">
<div class="form-group">
  <label>Enter Id </label>
  <input name="id" id="id" class="form-control">
</div>

<div class="form-group">
  <label>Enter Name </label>
  <input name="name" id="name" class="form-control">
</div>
<div class="form-group">
  <button type='submit' value='login' class='btn btn-secondary mr-5'>Login</button>
  <button type='reset' value='cancel' class='btn btn-secondary'>Cancel</button>
</div>
</form>
</body>
</html>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
 if(id!=null && name!=null){
 int id1=Integer.parseInt(id);
%>
<div class='border border-primary p-5 m-5 w-50'>
 <div>Id is <%=id1%></div>
 <div>Name is <%=name%></div>
</div>
<% } %>