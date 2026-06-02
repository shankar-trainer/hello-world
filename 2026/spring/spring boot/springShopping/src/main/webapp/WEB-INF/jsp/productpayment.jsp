<%@page import="com.cts.model.User"%>
<html>
<head>
<style>
@import url("../../style1.css");
label {
	float: left;
	width: 110pt;
}
</style>
</head>
<body>
	<%@page import="com.cts.model.Product"%>
	<%@page import="java.util.List"%>

	<div class="style1">
			<fieldset style="width:30%;">
			User Details
			<%   
			User user=(User)session.getAttribute("user");
			%>
			<p>
			<div>Id is  <%=user.getId()%></div>
			<div>Name is  <%=user.getName()%></div>
		</fieldset>
		
		<h2>Product Payment</h2>
		<p>All Products
		<p>
			<%
			List<Product> plist = (List<Product>)
			session.getAttribute("plist");
			out.println("total product is "+plist.size());
			for (Product p : plist) {
			%>
               <p><%=p.getPrdid() %>--<%=p.getPrdname() %>-- <%=p.getPrdcost() %>
			<%
			}
			%>
		
	</div>
</body>
</html>
