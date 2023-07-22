
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    .abc{
       border:solid;
       margin-left: 400px;
       margin-top: 100px;
       padding:20px;
       width:30%;
       height: 200px;
       background-color: lightyellow;
    }
    #id1,h1{
      margin-top:20px;
      margin-left:70px;
    }
</style>
</head>
<body>
	<div class="abc">
		<h1>Welcome Page</h1>
		<div id="id1">
			<a href="hello">Employee Form</a>
		</div>

		<div id="id1">
			<a href="pform">Person Form</a>
		</div>
		
		<div id="id1">
			<a href="account/actform">Account Form</a>
		</div>
	</div>
</body>
</html>