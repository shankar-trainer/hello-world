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
<!-- 
var xmlhttpreq;
	function getdata() {
		var id = document.getElementById('id').value
		console.log('id is '+id)
		
		xmlhttpreq = new XMLHttpRequest();
		//xmlhttpreq.open("GET","http://localhost:9090/AjaxDemo/CustomerData.jsp?cstid="+id);
		//xmlhttpreq.open("POST","CustomerData.jsp?cstid="+id);
		xmlhttpreq.open("GET",
				"../customer/searchcustomer?cstid="+ id);

		xmlhttpreq.onreadystatechange = function() {
			if (xmlhttpreq.readyState === 4 && xmlhttpreq.status === 200) {
				//document.getElementById("id1").innerHTML = xmlhttpreq.responseText
				var c=JSON.parse(xmlhttpreq.responseText)
			
				console.log("id .. is "+c.id)
				console.log("name .. is "+c.name)
				console.log(c)
				document.getElementById("cid").value=c.id
				document.getElementById("name").value=c.name
				document.getElementById("salary").value=c.salary
			}
		};
		xmlhttpreq.send(null)
	}
</script>

-->
<%-- 
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
</script> --%>
<!-- <script type="text/javascript">
	var xmlhttpreq;
	var maxsal;
	var override;
	var name;
	var salary;
	function validate() {
		name1 = document.getElementById("operation1").value
		name = document.getElementById("operation2").value
		name = document.getElementById("operation3").value
		name = document.getElementById("operation4").value
		name = document.getElementById("operation5").value
		console.log('operation is '+name+"  name1  "+name1)
		if (name1 == 'Update Customer') {

			xmlhttpreq = new XMLHttpRequest();
			xmlhttpreq.open("GET", "getcstUpdate");
			var c;
			xmlhttpreq.onreadystatechange = function() {
				if (xmlhttpreq.readyState === 4 && xmlhttpreq.status === 200) {
					//document.getElementById("id1").innerHTML = xmlhttpreq.responseText
					c = JSON.parse(xmlhttpreq.responseText)
					maxsal = c.max_amt_allowed
					override = c.canOverride
					console.log(c)
					document.getElementById("mxsalary").innerHTML = c.max_amt_allowed
					salary = document.getElementById('salary').value
				}
			};
			xmlhttpreq.send(null)
			console.log('called 2............' + name)

			if (salary > maxsal) {
				console.log('sal >max sal ....')
				document.getElementById('cstid').style.visibility = 'visible'
				if (override == true) {
					document.getElementById('override').style.visibility = 'visible'
				} else {
					document.getElementById('notoverride').style.visibility = 'visible'
				}
			}
			
			return false;
		} else
			return true;
	}

	window.onbeforeunload = function() {
		return "";
	}
</script> -->

<!-- <style>
.style1 {
	margin-left: 300px;
	font-weight: bold;
}
</style> -->
</head>
<!--   
from ajax max salary and flag allowing override will come.
then on clicking no max salary cannot be overriden and if yes max salary will be overriden 

no java code in jsp
 -->
<body>
	<div id="cstid" style="visibility: hidden" class='style1'>
		Maximum Salary Allowed To Update <span id="mxsalary"></span> <br>

		<div id="override" style="visibility: hidden">
			<br> Override <br> <input type='button' value='yes'
				onclick="updatemypage()"> <input type='button' value='no'
				style="margin-left: 100px;">
		</div>

		<div id="notoverride" style="visibility: hidden">Can Not
			Override Your salary is greater than max salary</div>
	</div>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form action="login" modelAttribute="cst" method="post"
	 name="form">
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