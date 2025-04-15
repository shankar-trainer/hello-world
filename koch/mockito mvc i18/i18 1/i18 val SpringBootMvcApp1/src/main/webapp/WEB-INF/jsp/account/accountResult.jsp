<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


	Name is ${act.name}
	<br> Balance is ${act.balance}
	<br> Equity Allocation is ${act.equityAllocation}
	<br> Account creation date is ${act.accountCreationDate}
	<br> Account creation date is  
	<fmt:formatDate value="${act.accountCreationDate}" dateStyle="long"/><br>
	<fmt:formatDate value="${act.accountCreationDate}" pattern="dd-MM-yy hh:mm:ss  Z"/>
	
	
	<br> Location is ${act.location}
	<br> Gender is ${act.gender}
	<br>

	<hr>
	Account Type is
	<br>

	<c:forEach var="act" items="${accountType}">
		<c:out value="${act}"></c:out>
		<br>
	</c:forEach>

</body>
</html>