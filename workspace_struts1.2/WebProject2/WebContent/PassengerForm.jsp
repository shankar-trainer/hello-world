<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
@IMPORT url("css/style.css");
</style>
</head>
<body>

<form action="PassengerController.jsp">
<h1>passenger Form</h1>
<label>Enter Id</label>
<input name='id'><br>

<label>Enter Name</label>
<input name='name'><br>

<label>Conveyance Type</label>

<input type="radio" name='type'  value='bus'>Bus<br>
<input type="radio"  name='type' value='train'>Train<br>
<input type="radio" name='type' value='flight'>Flight<br>
<input type="radio" name='type' value='car'>Car<br>
<br>
<input type="submit" value="go">
<input type="reset" value="cancel">

</form>
</body>
</html>