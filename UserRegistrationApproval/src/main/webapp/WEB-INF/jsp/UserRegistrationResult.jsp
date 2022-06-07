<html>
<head>
<style>
label{
	width:120px;
	float:left;
    margin-left:300px;
    margin-top:100px;
    padding: 40px;
    border:solid;
}
</style>

<body>
   <%  
   String userregstatus=  request.getAttribute("userregstatus").toString();

   if(userregstatus=="true"){
  %>
    <label>User Registration Successful </label>
  <% 
   }
 else{
   %>

 <label>UserAlready Present   </label>

  <%
  }
  %>
</body>
</html>

