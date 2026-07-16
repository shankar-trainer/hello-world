<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="RestaurantController" method="post">
  <div>
    <label>enter id </label>
    <input name="id">
  </div>
  
  <div>
    <label>enter name </label>
    <input name="name">
  </div>
  
  <div>
    <label>select the menu type </label>
    <input  type="radio"  name="type" 
    value="sindian">South Indian Food
    <input  type="radio" name="type" 
    value="nindian">North Indian Food
    <input  type="radio" name="type" 
    value="chinese">Chinese Food
  </div>
  <div>
  <input type="submit">
  </div>
</form>

</body>
</html>