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

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		if (id == "")
			response.sendRedirect("greeting.jsp?err=id is blank");
		else if (name == "")
			response.sendRedirect("greeting.jsp?err=name is blank");
		else {
	%>
	<br> I
	<%=id%><br> Name is
	<%=name%>
	<%
		}
	%>
	<%!Date date = new Date();
	String s = null;%>
	<br>
	<br>
	<%
		if (date.getHours() < 12) {
	%>
	<font color="blue"> <b>Good Morning </b> <br> Time is <%=date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds()%>
	</font>

	<%
		} else if (date.getHours() >= 12) {
	%>
	<font color="green"> <b><i>Good AfterNoon</i> </b> <br>
		Time is <%=date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds()%>
	</font>

	<%
		}
	%>

</body>
</html>