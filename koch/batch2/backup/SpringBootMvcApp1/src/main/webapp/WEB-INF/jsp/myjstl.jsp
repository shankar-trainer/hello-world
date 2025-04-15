<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ taglib uri="jakarta.tags.sql" prefix="sql" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>


<h2> Jstl  For Each </h2>
<c:forEach var="a" items="1,2,3,4,5,6,7">
  
  <div>${a}</div>
  <div>
  <c:out value="${a}"></c:out>
  </div>
</c:forEach> 

</body>
</html>