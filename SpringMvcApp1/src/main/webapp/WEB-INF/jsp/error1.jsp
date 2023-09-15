<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href='<spring:url value="/resources/style1.css"/>'/>

</head>
<%@page isErrorPage="true"  %>
<body>
<form>
  Error  is <%=exception.getMessage() %>
</form>
</body>
</html>