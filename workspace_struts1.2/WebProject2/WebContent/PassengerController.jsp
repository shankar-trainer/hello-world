<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Controller Page</h1>
	<%
		String type = request.getParameter("type");
		if (type.equals("car")) {
	%>
	<jsp:forward page="car.jsp"></jsp:forward>
	<%
		}
		if (type.equals("bus")) {
	%>
	<jsp:forward page="bus.jsp"></jsp:forward>
	<%
		}
		if (type.equals("train")) {
	%>
	<jsp:forward page="train.jsp"></jsp:forward>

	<%
		}
		if (type.equals("flight")) {
	%>
	<jsp:forward page="flight.jsp"></jsp:forward>
	<%
		}
	%>








</body>
</html>