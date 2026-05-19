<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form>
		<label>Enter Country name</label> <input name='country'> <br>
		<input type="submit">
	</form>
	<%
		request.setAttribute("country", request.getParameter("country"));
	%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%
		if (request.getAttribute("country") != null) {
	%>
	<c:choose>
		<c:when test="${country=='india'}">
 Capital of india  is delhi
</c:when>
		<c:when test="${country=='srilanka'}">
 Capital of srilanka  is colombo
</c:when>
		<c:when test="${country=='nepal'}">
 Capital of nepal  is kathmandu
</c:when>

		<c:otherwise>
 No data available
</c:otherwise>

	</c:choose>
	<%
		}
	%>
	<hr>  
	
	<% 
	request.setAttribute("var", "we-are-learning-java");
	
	HashMap<String,String> map1=new HashMap<>();
	map1.put("emp1", "suman kumar");
	map1.put("emp2", "amrita kapoor");
	map1.put("emp3", "sunita suman");
	map1.put("emp4", "pallavi jaiswal");
	map1.put("emp5", "prretam bharti");
	
	request.setAttribute("map1", map1);
	%>
	<hr> 
	map <br>
	
	<c:forEach items="${map1}" var="m">
	 <br> ${m.key} ========>  ${m.value}
	</c:forEach>
	
	
	<c:forTokens items="${var}" delims="-" var="a">
	  ${a}<br>
	</c:forTokens>
	
</body>
</html>