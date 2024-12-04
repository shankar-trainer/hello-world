<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<html>
<head>
<style>
.style1 {
	border: solid;
	padding: 10pt;
	width: 30%;
}
</style>
</head>
<body>

	<div class="style1">
		Java 7 Date is
		<%=new Date()%>
	</div>
	
	<div class="style1">
	Java 8 Date is
	   <%=LocalDate.now()   %>
	</div>

</body>

</html>
