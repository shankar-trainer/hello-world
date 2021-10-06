<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		session.setMaxInactiveInterval(10);
	%>

	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

	<jsp:useBean id="customer" class="org.com.bean.Customer"
		scope="session">
		<c:set target="${customer}" property="id"   value="1001"/>
		<c:set target="${customer}" property="name" value="${param.name}" />
		<c:set target="${customer}" property="location"  value="${param.location}"   />
		<c:set target="${customer}" property="pin"  value="${param.pin}" />
	</jsp:useBean>
 
	<a href="CustomerDetail.jsp">Customer Detail</a>


</body>
</html>