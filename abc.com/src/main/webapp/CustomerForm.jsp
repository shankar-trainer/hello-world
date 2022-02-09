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
</head>
<body>
<form action="customerdata.jsp">
<h2>Date is <%=new java.util.Date() %></h2>
<label>Enter Id</label>
<input name="id"><br>
<label>Enter Name</label>
<input name="name"><br>
<label>Enter Salary</label>
<input name="salary"><br>
<input type="submit" value="Login">
<input type="reset" value="Cancel">

</form>
</body>
</html>