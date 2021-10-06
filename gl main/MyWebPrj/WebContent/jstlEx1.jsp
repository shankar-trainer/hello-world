<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:forEach var="i" begin="10" end="30" step="3">
<c:out value="${i}"></c:out>
</c:forEach>


<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="f"%>

<% 
Date date=new Date();
request.setAttribute("date", date);

request.setAttribute("n1", 644545.676776);

%>

NumberFormat <f:formatNumber  value="${n1}" type="currency" currencySymbol="$" maxFractionDigits="2" /><br>
NumberFormat <f:formatNumber  value="${n1}" type="currency"  currencySymbol="₹" maxFractionDigits="2" />

<br>

Date format medium <f:formatDate value="${date}" dateStyle="medium"/><br>
Date format long <f:formatDate value="${date}" dateStyle="long"/><br>
Date format short <f:formatDate value="${date}" dateStyle="short"/><br>
Date format short <f:formatDate value="${date}" dateStyle="short"  type="both" timeStyle="short"/><br>



</body>
</html>