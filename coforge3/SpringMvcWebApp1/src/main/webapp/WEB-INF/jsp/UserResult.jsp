<%@page import="com.coforge.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%  
User user=(User)  request.getAttribute("user1");

%>
<div>
id is <%=user.getId() %>
</div>
<div>
name is <%=user.getName() %>
</div>
<div>
salary is <%=user.getSalary() %>
</div>

</body>
</html>