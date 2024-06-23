<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page errorPage="myerror.jsp" %>
<body>
	<%
		float n1 = Float.parseFloat(request.getParameter("n1"));
		float n2 = Float.parseFloat(request.getParameter("n2"));

		String op = request.getParameter("operation");

		if (op.equals("addition"))
			out.println("addition  of " + n1 + " and " + n2 + " is "
					+ (n1 + n2));
		else if (op.equals("subtraction"))
			out.println("subtraction  of " + n1 + " and " + n2 + " is "
					+ (n1 - n2));

		else if (op.equals("multiplication"))
			out.println("multiplication  of " + n1 + " and " + n2 + " is "
					+ (n1 * n2));
		else if (op.equals("division"))
			out.println("division  of " + n1 + " and " + n2 + " is "
					+ (n1 / n2));
		else {
			out.println("wrong operation");
			out.print("<br><a href='calculator.jsp'>calculator form</a>");
		}
	%>
</body>
</html>