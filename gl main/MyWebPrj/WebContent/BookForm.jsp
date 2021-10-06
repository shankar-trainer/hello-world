<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="bookInfo.jsp">
<label>Enter isbn</label>
<input name="id"><br>

<label>Enter name</label>
<input name="name"><br>

<label>Select Cities</label><br>
<input type="checkbox" name="city" value="chennai">Chennai
<input type="checkbox" name="city" value="madurai">Madurai
<input type="checkbox" name="city" value="shivkasi">Shivkasi
<input type="checkbox" name="city" value="coimbtore">Coimbtore

<input type="submit" value="ok">

</form>
</body>
</html>