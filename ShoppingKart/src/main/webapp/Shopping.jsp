<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("css/style1.css");
</style>
<style>
 form{
 width:40%;
 margin-left: 400px;
 }
 h1{
 margin-left: 100px;
 }
</style>
</head>
<body>
	<form action="shopping2.jsp">
		<h1>Shopping page</h1>
		<div>
			<label>Enter Id</label> <input name="id">
		</div>
		<div>
			<label>Product1 </label> <input name="prd1">
		</div>
		<div>
			<label>Product2 </label> <input name="prd2">
		</div>
		
		<input type="submit">
		<input type="reset">

	</form>
</body>
</html>