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
<form action="CalcResult.jsp">
  <label>Enter No1 </label>
  <input name='n1'><br>
  
  <label>Enter No2 </label>
  <input name='n2'><br>
  
  <label>Select Operation </label><br><br>
   <input type="radio" name='operation' value="addition">Addition<br>
   <input type="radio" name='operation' value="subtraction">Subtraction<br>
   <input type="radio" name='operation' value="multiplication">Multiplication<br>
   <input type="radio" name='operation' value="division">Division<br>
   <input type='submit' value="send">
   <input type='reset' value="cancel">
   
  </form>
</body>
</html>