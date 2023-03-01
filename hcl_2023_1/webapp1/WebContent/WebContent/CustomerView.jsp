<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("css/style1.css");
</style>

</head>
<body>
	<div class="mystyle">
		Id is
		<!--    below is expression  -->
		<%=request.getParameter("id")%><br> Name is
		<%=request.getParameter("name")%><br>

		<!--    below is scriptlet  -->
		<%
			String id1 = request.getParameter("id");
			String name1 = request.getParameter("name");

			out.println("Id is " + id1);
			out.println("<br>Name is " + name1);
		%>

		<!--    below is expression  -->

		<br> Id is
		<%=id1%><br> Name is
		<%=name1%><br>
	</div>
</body>
</html>