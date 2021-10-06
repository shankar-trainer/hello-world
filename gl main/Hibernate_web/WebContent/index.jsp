<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@IMPORT url("style/style1.css");
</style>
</head>
<body>

<form action="EmployeeController">

<label>Enter Id </label>
<input name="id"><br>

<label>Enter Name </label>
<input name="name"><br>

<label>Enter Salary </label>
<input name="salary"><br>

<input type="submit" name="operation" value="Show All Employee">
<input type="submit" name="operation" value="Add Employee"><br>
<input type="submit" name="operation" value="Remove Employee">
<input type="submit" name="operation" value="Search Employee"><br>
<input type="submit" name="operation" value="Update Employee"><br>



</form>

</body>
</html>