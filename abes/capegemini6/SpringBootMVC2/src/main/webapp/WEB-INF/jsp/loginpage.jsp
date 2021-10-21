<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label{
 width:100px;
 float:left;
}
input{
 width:100px;
}
form{
margin-left:250px;
margin-top:100px;
width:50%;
background: yellow;
color:blue;
border:double 4px;
padding: 10px;
}
body{
background: pink;
}
</style>
</head>
<body>


<form action="login" method="post">
<h1>Employee Login Page</h1>
<label>Enter Id </label>
<input name="id"><br>

<label>Enter Name </label>
<input name="name"><br>

<label>Enter Salary </label>
<input name="salary"><br>
<input type='submit' value="Login">
<input type='reset' value="Cancel">

</form>


</body>
</html>