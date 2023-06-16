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
   Object credential=  request.getAttribute("credential");

   if(credential==null){
  %>
    <label>User Not Found </label>
  <% 
   }
 else{
   %>

 <label>User Found With Credential <%=credential%> </label>

  <%
  }
  %>
</body>
</html>

