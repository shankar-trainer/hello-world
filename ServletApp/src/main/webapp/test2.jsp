<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.st1 {
	width: 30%;
	margin-left: 300px;
	border: solid blue 3px;
	padding: 20px;
}

.st2 {
	width: 30%;
	margin-left: 300px;
	border: double red 10px;
	padding: 20px;
}
</style>
</head>
<body>
	<%!java.util.Date date1 = new java.util.Date();%>

	<%
		if (date1.getHours() >= 12) {
	%>
	<div class="st1">
		<p>good after noon</p>
		date is
		<%=date1.getDate() + "/" + (date1.getMonth() + 1) + "/" + date1.getYear()%>
		<br>time is
		<%=date1.getHours() + ":" + date1.getMinutes() + ":" + date1.getSeconds()%>
	</div>
	<%
		} else {
	%>
	<div class="st2">
		<p>good morning</p>
		date is
		<%=date1.getDate() + "/" + (date1.getMonth() + 1) + "/" + date1.getYear()%>
				<br>time is
		<%=date1.getHours() + ":" + date1.getMinutes() + ":" + date1.getSeconds()%>
		
	</div>
	<%
		}
	%>

</body>
</html>