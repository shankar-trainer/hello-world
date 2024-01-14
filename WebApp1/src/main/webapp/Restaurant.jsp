<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("css/style1.css");
</style>
<style type="text/css">
label {
	width: 155px;
}
</style>
</head>
<body>

	<form action="FoodController">
		<h1>My Restaurant</h1>
		<div>
			<label>Enter Id</label> <input name="id">
		</div>
		<div>
			<label>Enter Name</label> <input name="name">
		</div>
		<div style="margin-top: 3px;font-weight: bold">
			<label> Select Your Food Type </label>
		</div>
		<br>	<br>
		<div>
			<input type="radio" name="type" value="nindian">North Indian
		</div>
		<div>
			<input type="radio" name="type" value="sindian">South Indian
		</div>
		<div>
		<button type="submit">Order</button>
		<button type="reset">Cancel</button>
		</div>

	</form>

</body>
</html>