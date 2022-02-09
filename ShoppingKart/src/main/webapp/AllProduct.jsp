<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div.class1 {
	margin-left: 380px;
	margin-bottom: 50px;
	border: double;
	padding: 20px;
	width: 30%;
}
</style>

</head>
<body>
	<%
	if(session.isNew()){
     out.print("<h2>Your Session is Expired </h2>");
     out.print("<a href='ShoppingForm.jsp'>Login Again</a>");
	}
	else{
	Object prd1 = session.getAttribute("pr1");
	Object prd2 = session.getAttribute("pr2");

	String product3 = request.getParameter("prd3");
	String product4 = request.getParameter("prd4");
	%>
	<div class="class1">
		Product1 is
		<%=prd1%>
		<br> Product2 is
		<%=prd2%><br> <br> Product3 is
		<%=product3%><br> <br> Product4 is
		<%=product4%><br>
	</div>
	<%} %>
</body>
</html>