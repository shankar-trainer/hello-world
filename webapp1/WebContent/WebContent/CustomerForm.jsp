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
<script type="text/javascript">
 function validate(){
	   var id= document.getElementById('id').value
	   var name= document.getElementById('name').value
   if(id==""){
	   alert('id is blank')
	   return false
   }
   else   if(name==""){
	   alert('name is blank')
	   return false
   }
	   
   else   if(name.length<10){
	   alert('name must of 10 chars ')
	   return false
   }
   else
	   return true
	   
 }

</script>
</head>
<body>
<form action="CustomerView.jsp" method="post" onsubmit="return validate()">
    
    <span style='float:left'><%=java.time.LocalDate.now() %></span>
    <span style='float:right'><%=java.time.LocalTime.now() %></span>
	
	<h1>Customer Form</h1>
	<label>Enter Id</label>
	<input name='id' id="id"><br>
	
	<label>Enter Name</label>
	<input name='name' id="name"><br>
	
	<input type="submit" value="Login">
	<input type="reset" value="Cancel">
	
	</form>
</body>
</html>