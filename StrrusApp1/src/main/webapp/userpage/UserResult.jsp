<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="border: inset  blue 30px; background: cyan; color: blue; margin: auto; padding: 40px; width: 30%;margin-top:100px">
Id is <s:property value="userId"/><br>
Name is <s:property value="userName"/><br>
Salary is <s:property value="userSalary"/><br>
Cities are  <s:property value="city"/><br>
Gender is   <s:property value="gender"/><br>
Hobbies are     <s:property value="hobbies"/><br>
</div>

</body>
</html>