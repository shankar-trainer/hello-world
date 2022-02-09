<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style1.css">
<style type="text/css">
form {
	border: dotted 2px;;
}

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

	<div class="class1">
		You have last logged at is  <%=session.getId()%><br> Session Interval is<%=new Date(session.getCreationTime())%><br>
		<br>
		<% 
		session.setMaxInactiveInterval(10);
		%>
		Session Max Inactive Interval is<%=session.getMaxInactiveInterval()%>

		<br>

		<h2>Shopping Kart Application</h2>

		<%
		String product1 = request.getParameter("prd1");
		String product2 = request.getParameter("prd2");
		session.setAttribute("pr1", product1);
		session.setAttribute("pr2", product2);
		%>
		Product1 is
		<%=product1%><br> Product2 is
		<%=product2%><br>
	</div>

	<form action="AllProduct.jsp">
		<h2>Add More Product</h2>

		<label>Enter Product3</label> <input name="prd3"><br>
		<br> <label>Enter Product4</label> <input name="prd4"><br>
		<br> <input type="submit" value="add Product"> <input
			type="reset" value="Cancel">
	</form>



</body>
</html>