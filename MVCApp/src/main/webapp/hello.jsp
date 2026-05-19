<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
Id is ${param.id}<br>
name is  ${param.name}<br>
City  is  ${param.city}<br>

<%
session.setAttribute("name", request.getParameter("name"));

%>

<c:if test="${name=='training'}">
This is  ${name} department<br>

</c:if>
</body>
</html>