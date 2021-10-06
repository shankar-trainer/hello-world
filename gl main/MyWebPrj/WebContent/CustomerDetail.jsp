<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Customer Detail</h1>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<%
if (session.isNew()){
%>
<h1>Your session has expired</h1>
<%}
else{
%>
<jsp:useBean id="customer" class="org.com.bean.Customer" scope="session"/>
Id is <c:out value="${customer.id}"/><br>
Name is <c:out value="${customer.name}"/><br>
Location is <c:out value="${customer.location}"/><br>
Pin is <c:out value="${customer.pin}"/><br>

	<%-- 
Id is	<jsp:getProperty name="customer" property="id"/>	<br>
Name is 	<jsp:getProperty name="customer" property="name"/>	<br>
Location is 	<jsp:getProperty name="customer" property="location"/><br>	
Pin is <jsp:getProperty name="customer" property="pin"/>	 --%>
	<%
	}
%>
</body>
</html>