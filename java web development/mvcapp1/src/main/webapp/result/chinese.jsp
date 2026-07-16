<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Chinese Indian Restaurant</h2>
	<jsp:useBean id="restaurant" class="com.coforge.model.Restaurant"
		scope="session" />

	Id is
	<jsp:getProperty property="id" name="restaurant" /><br> Name is
	<jsp:getProperty property="name" name="restaurant" /><br> Menu
	availables
	<p>
	<ol>
		<li>momos</li>
		<li>manchurian</li>
		<li>hakka noodles</li>
		<li>spring role</li>
		<li>veg role</li>
		<li>chilli potato</li>
	</ol>


</body>
</html>