<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Id is ${param.id}<br>
name is ${param.name}<br>
salary is ${param.salary}<br>
cities are 
<ol>
<li>${paramValues.cities[0]}</li>
<li>${paramValues.cities[1]}</li>
<li>${paramValues.cities[2]}</li>
</ol>

</body>
</html>