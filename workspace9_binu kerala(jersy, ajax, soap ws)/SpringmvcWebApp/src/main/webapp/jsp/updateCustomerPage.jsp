<%@page import="org.com.dto.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function updateCustomer() {
		var res = confirm("do you want to update")
		if (res == true)
			return true;
		else
			return false;
	}
	/* 
	 window.onbeforeunload = function() {
	 return "";
	 } */

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

</head>
<body>
	<h1>Update Customer Page</h1>
	<%
		List<Customer> customerList = (List<Customer>) request.getAttribute("list");
	%>
	<!-- onsubmit="return updateCustomer() -->
	<br> select Id To update
	<select name="id" id="id" onchange="getdata()">
		<%
			for (Customer c : customerList) {
		%>
		<option value='<%=c.getId()%>'>
			<%=c.getId()%>
		</option>
		<%
			}
		%>
	</select>

<br>
<br>
	<div id="id1">
	<br>
	
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form modelAttribute="cst" action="../customer/update">
		<label for="id">Id </label>
		<form:input path="id"  id="cid" />
		<br>

		<label for="name">Name </label>
		<form:input path="name"  id="name" />
		<br>
		<label for="salary">Salary </label>
		<form:input path="salary"  id="salary" />

		<input type="submit">
		<br>
	</form:form>
	</div>
</body>
</html>