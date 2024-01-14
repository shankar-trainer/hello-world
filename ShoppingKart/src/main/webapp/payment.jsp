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
<style>
form {
	width: 40%;
	margin-left: 400px;
}

h1 {
	margin-left: 100px;
}
</style>
</head>
<body>
	<%
	if(session.isNew()){
	   out.print("<h2>Your Session has Expired");
	   out.print("<br><br><br><a href='Shopping.jsp'>Login Again");
	}
	else{
	Object id = session.getAttribute("id");
	Object product1 = session.getAttribute("prd1");
	Object product2 = session.getAttribute("prd2");
	String product3 = request.getParameter("prd3");
	String product4 = request.getParameter("prd4");
	
	%>
	<form>
		<h2>Products Purchased Are</h2>
		<p>Welcome User
		<p>
			Your id is
			<%=id%>
		<ol>
			<li><%=product1%></li>
			<li><%=product2%></li>
			<li><%=product3%></li>
			<li><%=product4%></li>
		</ol>
	</form>
	<%} %>
</body>


</html>