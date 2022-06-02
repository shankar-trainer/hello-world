<html>
<head>
<script>

function validate(){
   var id=document.getElementById('id').value
   var fname=document.getElementById('fname').value
   var lname=document.getElementById('lname').value
   
   if(id=="")
     {
     alert("id is blank")
     return false
     }
 else   if(fname=="")
     {
     alert("first name  is blank")
     return false
     }
   else if(lname=="")
     {
     alert("last name is blank")
     return false
     }
     else{
     return true
     }
}

</script>
<style>
label{
	width:120px;
	float:left;
    margin-right:5px;
}
input{
	width:140px;
}
input[type='submit']{
	width:130px;
	margin-bottom:1px;
}
input[type='reset']{
	width:130px;
	margin-bottom:1px;
}
errors,span{
  color:red;
  font-weight:bold;
}
form{
	background:yellow;
	border:solid blue 12px;
	width:40%;
	padding:20px;
	margin-top:100px;
	margin-left:300px;
	color:blue;
}

body{
 background:yellowlight;	
}
</style>
</head>

<body>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<form:form action="UserAction" modelAttribute="user" onsubmit='return validate()'>

	<form:label path="id">Enter Id</form:label>
	<form:input path="id" id="id"/>
	<form:errors path="id"/><br>

	<form:label path="fname">Enter First Name</form:label>
	<form:input path="fname" id="fname"/>
	<form:errors path="fname"/><br>

	<form:label path="lname">Enter Last Name</form:label>
	<form:input path="lname" id="lname"/>
	<form:errors path="lname"/><br>
 	<input type="submit"  value="login">
 	<input type="reset"  value="cancel">


</form:form>


</body>
</html>