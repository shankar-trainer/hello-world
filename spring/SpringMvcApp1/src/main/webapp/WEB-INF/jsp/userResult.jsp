<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

 /* @import url("resources/static/style1.css"); */
 
 .style1 {
	background: lightyellow;
	width: 40%;
	margin: 100pt;
	padding: 20pt;
	color: blue;
	border:double;
}
  
 </style>
</head>
<body>
<%@page isELIgnored="false" %>
<div class="style1">
	<h2>User Result</h2>
    <div>Id is ${user.id}</div>
    <div>Name is ${user.name}</div>
    <div>Salary is ${user.salary}</div>
 </div>   
</body>
</html>