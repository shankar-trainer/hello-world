<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="student" class="abc.com.bean.Student" scope="session"/>
Roll is <jsp:getProperty property="roll" name="student"/><br>
Name is <jsp:getProperty property="name" name="student"/><br>
Marks is <jsp:getProperty property="marks" name="student"/><br>


</body>
</html>