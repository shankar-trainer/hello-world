<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
label{
	width: 100px;
	float: left;
}

input {
	
	width: 120px;
	margin-bottom: 2px;
	
}

input[type='submit'] {
	
	width: 160px;
	margin-top :5px;
	margin-bottom: 2px;
	margin-right: 15px;
}


input[type='reset'] {
	width: 90px;
	margin-bottom: 2px;
}
form{
background:yellow;
width:30%;
margin-left: 400px;
margin-top: 100px;
border:double blue 10px;
padding: 10px;
}
</style>

</head>
<body>


<form action="customerController">

<label>Enter Id</label>
<input  name="id"><br>

<label>Enter Name</label>
<input  name="name"><br>

<label>Enter Salary</label>
<input  name="salary"><br>

<input type="submit" name="operation"  value="Add Customer">
<input type="submit" name="operation" value="Remove Customer"><br>
<input type="submit" name="operation" value="Search Customer">
<input type="submit" name="operation" value="Update Customer"><br>
<input type="submit" name="operation" value="Show All Customer">
</form>




</body>
</html>