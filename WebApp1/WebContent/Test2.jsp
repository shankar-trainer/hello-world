<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int x = 3;%>

	<%
		if (x % 2 == 0)
			out.print(x + " is even no");
		else
			out.print(x + " is  odd no");
	%>
<hr>
	<div style="border:solid 1px;padding:2em;background: rgb(214,214,214);color:blue;width:20%;">
	<%
		if (x % 2 == 0) {
	%>

	<%=x%>
	is Even No
	<%
		} else {
	%>


	<%=x%>
	is Odd No
	<%
		}
	%>
	</div>
</body>
</html>