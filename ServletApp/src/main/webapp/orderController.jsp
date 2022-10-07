<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String otype = request.getParameter("otype");
		if (otype.equals("veg")) {
	%>

	<jsp:forward page="order/veg.jsp">
		<jsp:param value="30" name="discount" />
	</jsp:forward>

	<%
		} else if (otype.equals("non-veg")) {
	%>

	<jsp:forward page="order/non-veg.jsp">
		<jsp:param value="20" name="discount" />
	</jsp:forward>

	<%
		}
	%>

</body>
</html>