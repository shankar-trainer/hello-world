<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<jsp:useBean id="employee" class="com.aurionpro.model.Employee" scope="session"/>

Id is <jsp:getProperty name="employee"  property="id" /><br>
name is <jsp:getProperty name="employee"  property="name" /><br>
salary is <jsp:getProperty name="employee"  property="salary" /><br>
<hr> 
using jstl<br>

Id<c:out value="${employee.id}"></c:out><br>
name<c:out value="${employee.name}"></c:out><br>
salary<c:out value="${employee.salary}"></c:out><br>




</body>
</html>