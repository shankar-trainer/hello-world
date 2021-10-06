<%@page import="org.com.model.Customer"%>
<%@page import="org.com.dto.CustomerUpdate"%>
<html>
<head>

<style>
input {
	float: left;
	width: 100px;
}

input[type='submit'] {
	float: left;
	width: 150px;
}

label {
	float: left;
	width: 100px;
}

form {
	margin-left: 400px;
	margin-top: 200px;
	background: yellow;
	width: 40%;
	border: inset blue 1px;
	padding: 5px;
}
</style>
<script type="text/javascript">
var maxsal="<%=maxsal  %>	";

function validate() {
		console.log('called .........')
		var name = document.getElementById("operation1").value
		console.log('called .........====' + name)

		if (name == 'Update Customer') {
			var salary=document.getElementById('salary').value
			console.log('salary is '+salary)
			console.log('max salary is '+maxsal)
			if(salary>maxsal){
			document.getElementById('cstid').style.visibility = 'visible'
			//[DIV].style.visibility = 'visible'

			console.log('called .........==' + name)
			return false;
			}
		} else
			return true;
	}
 
	window.onbeforeunload = function() {
		return "";
	} 
	function updatemypage() {

		document.form.action = "login?operation='Update Customer'"
		document.form.submit()
	}
</script>
<style>
.style1 {
	margin-left: 300px;
	font-weight: bold;
}
</style>
</head>
<!--   
from ajax max salary and flag allowing override will come.
then on clicking no max salary cannot be overriden and if yes max salary will be overriden 

no java code in jsp
 -->
<body>
	<div id="cstid" style="visibility: hidden" class='style1'>
		Max Salary
		<%!
		float maxsal;
		Customer cst;
		%>		
		
		<%  
		
		cst=new Customer();
		//cst.setId(id);
		%>
		
		<%
		CustomerUpdate cstupdate = (CustomerUpdate) request.getAttribute("cstupdate");
		out.println(cstupdate.getMax_amt_allowed());
		System.out.println("max salary ............."+cstupdate.getMax_amt_allowed());
		 maxsal = cstupdate.getMax_amt_allowed();
		 
	%><br> Override 
	<br>
	
	<input type='button' value='yes'
			onclick="updatemypage()"> <input type='button' value='no'>

	</div>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form action="login" modelAttribute="cst" method="post"
		onsubmit="return validate()" name="form">
		<label>Enter Id</label>
		<form:input path="id" />
		<br>

		<label>Enter Name</label>
		<form:input name="name" path="name" />
		<br>

		<label>Enter Salary</label>
		<form:input path="salary" id="salary" />
		<br>
		<input type="submit" name="operation" id="operation1"
			value="Update Customer">

		<input type="submit" name="operation" id="operation2"
			value="Add Customer">
		<br>
		<input type="submit" name="operation" id="operation3"
			value="Remove Customer">
		<input type="submit" name="operation" id="operation4"
			value="Find Customer">
		<br>
		<input type="submit" name="operation" id="operation5"
			value="Show All Customer">
		<br>

	</form:form>
</body>
</html>