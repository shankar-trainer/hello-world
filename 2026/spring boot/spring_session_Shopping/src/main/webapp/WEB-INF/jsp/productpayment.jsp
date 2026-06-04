<%@page import="com.cts.model.User"%>
<html>

<head>
<style>
@import url("../../style1.css");

label {
	float: left;
	width: 110pt;
}

table {
	border: solid;
	width: 40%;
}

tr, td {
	border: solid blue;
}

button {
	background-color: maroon;
	color: yellow;
	border-radius: 10pt;
}
</style>
</head>

<body>
	<%@page import="com.cts.model.Product"%>
	<%@page import="java.util.List"%>
	<% 
	if(session.isNew()){
		out.println("<div class='style1'>");
		out.println("Logged out sucessfully");
		out.println("<a href='/user/form'>Login Again</a>");
		out.println("</div>");
	}
	else{
	%>
	<div class="style1">
		<form action="/product/logout" style="float: right">
			<button type="submit">logout</button>
		</form>

		<fieldset style="width: 30%;">
			User Details
			<%
		User user = (User) session.getAttribute("user");
		%>
			<p>
			<div>
				Id is
				<%=user.getId()%>
			</div>
			<div>
				Name is
				<%=user.getName()%>
			</div>
		</fieldset>

		<h2>Product Payment</h2>
		<p>All Products
		<p>
			<%
			List<Product> plist = (List<Product>) session.getAttribute("plist");
			if (plist.size() == 0)
				out.println("no products available");
			else {
				out.println("total products are " + plist.size());
				out.println("<table>");
				for (Product p : plist) {
			%>
			<tr>
				<td><%=p.getPrdid()%></td>
				<td><%=p.getPrdname()%></td>
				<td><%=p.getPrdcost()%></td>
			</tr>
			<%
			}
			out.println("</table>");
			}
			%>
		
		<form action="/product/remove">
			enter id to remove product<input name="id">
			<p>
				<button type="submit">remove</button>
		</form>

	</div>
	<% }
	%>
</body>

</html>