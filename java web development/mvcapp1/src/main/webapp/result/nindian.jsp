<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>North Indian Restaurant</h2>
	<jsp:useBean id="restaurant" class="com.coforge.model.Restaurant"
		scope="session" />

	Id is
	<jsp:getProperty property="id" name="restaurant" /><br> Name is
	<jsp:getProperty property="name" name="restaurant" /><br> Menu
	availables
	<p>
	<ol>
		<li>puri sabj</li>
		<li>roti dal</li>
		<li>chawal dal</li>
		<li>palk paneer</li>
		<li>litti chokha</li>
		<li>biryani</li>
	</ol>


</body>
</html>