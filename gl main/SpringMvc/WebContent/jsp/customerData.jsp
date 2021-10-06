<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Customer Data</h2>

Id is ${cst.id}<br>
Name is ${cst.name}<br>
Salary is ${cst.salary}<br>
Gender is ${cst.gender}<br>

<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
Hobbies are  
<c:forEach var="h" items="${hobby}">
<c:out value="${h}"/>
</c:forEach>



</body>
</html>