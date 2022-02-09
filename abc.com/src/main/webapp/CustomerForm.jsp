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
<script type="text/javascript" src="script/script2.js"></script>
</head>
<body>
<form action="customerdata.jsp" onsubmit="return customer_form_validation()">
<h2>Date is <%=new java.util.Date() %></h2>
<label>Enter Id</label>
<input name="id" id="id"><br>
<label>Enter Name</label>
<input name="name" id="name"><br>
<label>Enter Salary</label>
<input name="salary" id="salary"><br>
<input type="submit" value="Login">
<input type="reset" value="Cancel">

</form>
</body>
</html>