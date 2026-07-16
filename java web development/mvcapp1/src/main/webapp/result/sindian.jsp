<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>South Indian Restaurant</h2>
	<jsp:useBean id="restaurant" class="com.coforge.model.Restaurant"
		scope="session" />

	Id is
	<jsp:getProperty property="id" name="restaurant" /><br> Name is
	<jsp:getProperty property="name" name="restaurant" /><br> Menu
	availables
	<p>
	<ol>
		<li>dosa</li>
		<li>idli</li>
		<li>rice sambhar</li>
		<li>bara</li>
		<li>rasam</li>
		<li>bhajji</li>
	</ol>


</body>
</html>