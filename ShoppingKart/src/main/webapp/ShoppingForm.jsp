<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style1.css">
<style type="text/css">
 form{
 border:dotted 2px;;
 }
 
</style>


</head>
<body>
<form action="ShoppingServlet.jsp">
Session Id is<%=session.getId() %>
<br> 
<h2>Shopping Kart Application</h2>
<label>Enter Product1</label>
<input name="prd1"><br><br>
<label>Enter Product2</label>
<input name="prd2"><br><br>
<input type="submit" value="add Product">
<input type="reset" value="Cancel">
</form>
</body>
</html>