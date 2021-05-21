<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<style>
@import url("../CSS/style1.css");
</style>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h1>jstl program</h1>
	<p>
		jstl foreach

		<%
		ArrayList<String> menu = new ArrayList<>();
		menu.add("pizza");
		menu.add("burger");
		menu.add("sandwich");
		menu.add("pasta");
		menu.add("momos");
		menu.add("fried chicked");
		request.setAttribute("menu", menu);
	%>
	
	<br>
	<p> Menu Items 
	    <ol>
	   <c:forEach var="m" items="${menu}" >
	     <li>${m}   <c:out value="${m}" /> </li>  
		</c:forEach>
		
	</ol>
		<c:forEach var="i" begin="1" end="20" step="2">
			<c:out value="${i}"></c:out>
		</c:forEach>
		<h2>for tokens </h2>
		
		<c:forTokens   var="language" items="java,php,dotnet,python" delims=",">
			<c:out value="${language}"></c:out>
		</c:forTokens>
		
		<%  
		  Date date=new Date();
		   request.setAttribute("date", date);
		%>
		
		<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
		<hr>
		<br>Date 1 <fmt:formatDate value="${date}"   dateStyle="long" /><br>
		<br>Date 2 <fmt:formatDate value="${date}"   dateStyle="medium" /><br>
		<br>Date 3 <fmt:formatDate value="${date}"   dateStyle="short" /><br>
		
		<br>Date 4 <fmt:formatDate value="${date}"   pattern="dd-MM-yyyy" /><br>
		
		<br>Date 5 <fmt:formatDate value="${date}"   pattern="dd-MM-yyyy hh:mm:ss" /><br>
		
		<br>Date 6 <fmt:formatDate value="${date}"   pattern="dd-MM-yyyy hh:mm:ss Z" /><br>
		<br>Date 7 <fmt:formatDate value="${date}"   pattern="dd-MM-yyyy hh:mm:ss Z G" /><br>
		
		
		
		
		
</body>

</html>

