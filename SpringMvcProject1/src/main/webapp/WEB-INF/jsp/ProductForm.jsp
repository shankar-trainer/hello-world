<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<form:form modelAttribute="prd" action="prdResult" method="post">
		<form:label path="prdId">Enter Id</form:label>
		<form:input path="prdId" />
		<br>
		<form:label path="prdName">Enter Name</form:label>
		<form:input path="prdName" />
		<br>
		<form:label path="prdCost">Enter Cost</form:label>
		<form:input path="prdCost" />
		<br>
       <input type="submit" value="Add Product" name="operation">
       <input type="submit" value="Show Product" name="operation">
       <input type="submit" value="Search Product" name="operation">


	</form:form>
</body>
</html>