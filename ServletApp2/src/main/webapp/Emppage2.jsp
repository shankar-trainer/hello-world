<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	var xhr;

	function showdata() {
		var id = document.getElementById('empid').value;
		if (id == "")
			alert("id is blank")
		else {
			xhr = new XMLHttpRequest();
			xhr.onreadystatechange = function() {
				document.getElementById("data").innerHTML = this.responseText
			};
			console.log("id is ....."+id)
			xhr.open("GET","http://localhost:9090/ServletApp2/empdata.jsp?id=" + id)
			xhr.send()
		}
	}
</script>
</head>
<body>
	<label>Enter id </label>
	<input name="empid" id="empid">
	<br>
	<hr>
	<input type="button" value="getData" onclick="showdata()">
	<div id="data"></div>
</body>
</html>