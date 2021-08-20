<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action='bankingController'>
<label>Enter Id</label>
<input name="actid"><br>

<label>Enter Name</label>
<input name="actName"><br>

<label>Enter Password</label>
<input  type='password' name="actpass"><br>

<label>Select Account Type</label>
<input  type="radio" name="acttype" value="saving">Saving<br>
<input  type="radio" name="acttype" value="current">Current<br>

<input type="submit" value='login'>
<input type="reset" value='reset'>

</form>
</body>
</html>