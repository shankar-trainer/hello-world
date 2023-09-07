<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("css/style1.css");
</style>

</head>
<body>
	<%
	int id = Integer.parseInt(request.getParameter("pid"));
	String name = request.getParameter("pname");
	float cost = Float.parseFloat(request.getParameter("pcost"));
	%>
	<div class="hello">
		<div>
			<label>Product Id </label>
			<%=id%>
		</div>

		<div>
			<label>Product Name </label>
			<%=name%>
		</div>

		<div>
			<label>Product Cost </label>
			<%=cost%>
		</div>
	</div>
</body>
</html>