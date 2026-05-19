<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("style1.css");
</style>

</head>
<body>

<form action='orderController.jsp'>
<label>Enter user id </label>
<input name="uid"><br>

<label>Enter user name </label>
<input name="uname"><br>

<label>Enter Password </label>
<input  type='password' name="pass"><br>

<label>Select Order Type</label><br><br>

<input type="radio" value="veg" name='otype'>Veg<br>
<input type="radio" value="non-veg" name='otype'>Non Veg<br><br>

<input type="submit">
<input type="reset">

</form>
</body>
</html>