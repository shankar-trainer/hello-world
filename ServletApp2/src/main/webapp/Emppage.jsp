<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="EmpData">
		<label>Enter id </label> <input name="empid"> <input
			type="submit">
	</form>

	<%
		Object obj1 = request.getAttribute("list1");
		Object obj2 = request.getAttribute("error");

		if (obj1 != null) {
			List<String> list = (List<String>) obj1;
			out.println("Record found <br>");
			for (String s : list)
				out.print(s + "   ");

		}
		if (obj2 != null)
			out.println(obj2);
	%>
</body>
</html>