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
		<%=request.getParameter("id")%><br> Name is
		<%=request.getParameter("name")%><br>
	</div>
</body>
</html>