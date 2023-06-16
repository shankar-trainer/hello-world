<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label {
	width: 110px;
	float: left;
}

input {
	width: 110px;
	margin-bottom: 5px;
}

form {
	background: yellow;
	text: blue;
	padding: 20px;
	border: solid 4px;
	margin-left: 300px;
	margin-top: 160px;
	width: 30%;
}

body {
	background: lightyellow;
}
</style>
</head>
<body>
<c:forEach var="a" begin="1" end="10" step="2">

No is.. <c:out value="${a}"></c:out><br>

</c:forEach>


<%

List<String> cityList=new ArrayList<>();
cityList.add("delhi");
cityList.add("chennai");
cityList.add("madurai");
cityList.add("ooty");
cityList.add("madurai");

session.setAttribute("city", cityList);

%>
<h2>City Lists Are </h2>
<ol>
<c:forEach var="c" items="${city}">
<li><c:out value="${c}"></c:out></li>
</c:forEach>
</ol>

<hr>

<form action="empaction">
<label>Enter Id</label>
<input name="id"><br>

<label>Enter Name</label>
<input name="name"><br>

<label>Enter Salary</label>
<input name="salary"><br>
<!-- <label>Enter DOB</label>
<input name="dob" type="text"><br>
 -->


<input type="submit">
<input type="reset">

</form>

<h2>Using ForEach Tokens</h2>
<c:forTokens items="ram goes to school" delims=" " var="a">
<c:out value="${a}"></c:out><br>
</c:forTokens>

<h2>Using ForEach Tokens</h2>
<c:forTokens items="we-all-are-learning-java" delims="-" var="a">
<c:out value="${a}"></c:out><br>
</c:forTokens>

<h2>Using If</h2>
<% 
request.setAttribute("marks", 67);


%>
<div style="color:blue;border:solid;width:30%;margin-left:200px;padding: 20px;">
<h3>Marks is <c:out value="${marks}"></c:out></h3>
<c:if test="${marks>=75}">
 <label>Distinction</label>
</c:if>
<c:if test="${marks>=60 && marks<75}">
 <label>First Division</label>
</c:if>

<c:if test="${marks>=50 && marks<60}">
 <label>Second Division</label>
</c:if>

<c:if test="${marks>=35 && marks<50}">
 <label>Third Division</label>
</c:if>

<c:if test="${marks>=0 && marks<35}">
 <label>Fail</label>
</c:if>
</div>


</body>
</html>


