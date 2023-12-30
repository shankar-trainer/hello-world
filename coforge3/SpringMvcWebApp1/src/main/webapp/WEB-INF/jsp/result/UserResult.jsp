<%@page import="com.coforge.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="css/stylesheet"
	href="<spring:url value='/resources/style1.css'/>" />
</head>
<body>

	<%
	User user = (User) request.getAttribute("user1");
	%>
	<form>
		<div>
			id is
			<%=user.getId()%>
		</div>
		<div>
			name is
			<%=user.getName()%>
		</div>
		<div>
			salary is
			<%=user.getSalary()%>
		</div>
	</form>
	
	<hr>
	<form>
	<h2>Using EL (Expression Language)</h2>
	 <div>id is ${user1.id}
	 </div>
	 
	 <div>name is ${user1.name}
	 </div>
	 
	 <div>salary is ${user1.salary}
	 </div>
	 
	</form>
	
</body>
</html>