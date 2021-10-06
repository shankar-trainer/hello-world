<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<style type="text/css">
label{
	
	width: 100px;
	float: left;
}

input {
	
	width: 120px;
	margin-bottom: 2px;
	
}

input[type='submit'] {
	
	width: 90px;
	margin-top :5px;
	margin-bottom: 2px;
	margin-right: 15px;
}


input[type='reset'] {
	width: 90px;
	margin-bottom: 2px;
	
}

span{
	color:red;
	font-weight: bold;
	margin-left: 10px;
	
}


form{
	
	margin-left: 450px;
	margin-top: 100px;
	width:30%;
	border: inset yellow 10px; 
	padding: 20px;
	background: yellow;
	color: blue;
}

body{
	background: aqua;
	
}

</style>


<script type="text/javascript">
/* window.onbeforeunload = function() {
	  return "";
	} */

function validate() {
	           //document.getElementById
		var id = document.getElementById('id').value
		var name = document.getElementById('name').value
		var salary =document.getElementById	('salary').value
		
		console.log("id is "+id);
		console.log("name is "+name);
		console.log("salary is "+salary);


		if (id == "") {
			//alert("id is blank")
			document.getElementById('id_err').innerHTML="id is blank"
			return false;
		}

		else if (name == "") {
	//		alert("name is blank")
			document.getElementById('name_err').innerHTML="name is blank"
			return false;
		}

		else if (salary == "") {
			document.getElementById('salary_err').innerHTML="salary is blank"
		//	alert("salary is blank")
			return false;
		}
		else
			return true;
	}
</script>


</head>
<body>

	<form action="login2"  method="get" >
<input name='city' type="hidden" value="new delhi">
		<label>Enter Id </label> <input name="id" id="id"><span id="id_err"></span> <br> 
		
		<label>Enter Name </label> <input name="name" id="name">  <span id="name_err"></span><br> 
<label>Enter Salary </label> <input name="salary" id="salary">  <span id="salary_err"></span><br>
		
		 <input			type="submit" value="Login"> 
		 <input type="reset"			value="Cancel">
	</form>

</body>
</html>