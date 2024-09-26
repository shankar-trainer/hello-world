<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
		session.setAttribute("n1", 190);
		session.setAttribute("n2", 10);
		List<String> list1 = new ArrayList<>();
		list1.add("hello");
		list1.add("welcome");
		list1.add("greeting");
		session.setAttribute("list1", list1);
	%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<c:catch var="e">
	
Result is 	${n1/n2};
	<c:set var="x" value="100" scope="session" />
		<%-- 		
<c:set var="y" value="abc" scope="session" /> --%>
		<c:set var="y" value="0" scope="session" />
		<c:out value="${x/y}"></c:out>
		<br>
		city1 <c:out value="${list1[0]}"></c:out>
		<br>
		city2 <c:out value="${list1[1]}"></c:out>
		<br>
		city3 <c:out value="${list1[2]}"></c:out>
		<br>
		<hr>
		Using for each cities are <br>
		<c:forEach items="${list1}" var="var">
			<c:out value="${var}" />
			<br>
		</c:forEach>
	</c:catch>
	<c:if test="${e!=null}">
		<c:out value="${e}" />
	</c:if>
</body>
</html>