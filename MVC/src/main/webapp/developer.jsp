<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Developer Page</h1>
 <jsp:useBean id="employee" scope="session" class="com.coforge.model.Employee"/>
 Id is  <jsp:getProperty name="employee" property="empId" /><br>
 Name is  <jsp:getProperty name="employee" property="empName" /><br>
 
</body>
</html>