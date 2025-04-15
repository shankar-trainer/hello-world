<%@page import="com.cts.model.Customer"%>
<html>
<head>
<style>
@import url("../CSS/style1.css");
</style>
</head>
<body>
	<div class='customer'>
		<%
			Customer customer = (Customer) request.getAttribute("customer");

			if (customer == null) {
				Object error = request.getAttribute("error");
				out.print(error);
			} else {
		%>
		Id is
		<%=customer.getCustId()%><br> Name is
		<%=customer.getCustName()%><br> Location is
		<%=customer.getCustLocation()%><br>
		<%
			}
		%>
		
		<hr> 
		
		<%

			if (customer == null) {
				%>
				${error}
				<%
			} else {
		%>
		Id is ${customer.custId }<br>
		
		Name is ${customer.custName }<br>
		
		Location is ${customer.custLocation }<br>
		
		<%
			}
		%>
		
	</div>

</body>

</html>

