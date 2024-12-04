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
	if (session.isNew()) {
	%>
	<h2>Your session has expired</h2>
	<%
	} else {
	%>
	<div>
		<h2>Current Account Data</h2>
		<jsp:useBean id="accou" class="w"
			scope="session" />
		<div>
			Id is
			<jsp:getProperty property="id" name="account" />
		</div>
		<div>
			Name is
			<jsp:getProperty property="name" name="account" />
		</div>
		<div>
			Balance is
			<jsp:getProperty property="balance" name="account" />
		</div>
		<div>
		Location :<%=session.getAttribute("location") %>
		</div>

	</div>
	<%
	}
	%>

</body>
</html>