<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("css/style.css");
</style>
</head>
<body>

<form action="AccountController">
	<div>
	 <label>Enter Id</label>
	 <input name="id">
	</div>
	
	<div>
	 <label>Enter Name</label>
	 <input name="name">
	</div>
	
	<div>
	 <label>Enter Balance</label>
	 <input name="balance">
	</div>
	
	<div>
	 <label>Select Account Type</label>
	 
	 <div><input type="radio" name="act_type" value="saving">Saving</div>
	 <div><input type="radio" name="act_type" value="current">Current</div>
	 
	</div>
	
	<div>
	<input type="submit">
	<input type="reset">
	</div>
		
	

</form>

</body>
</html>