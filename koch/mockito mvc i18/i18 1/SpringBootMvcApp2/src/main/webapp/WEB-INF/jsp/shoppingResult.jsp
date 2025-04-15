
<%@page import="com.cts.model.Product"%>
<%@page import="java.util.List"%>
<style>
@import url("../CSS/style1.css");
</style>
<h2>${msg}</h2>
<%
	if (session.isNew()) {
		out.print("<h2>Your Session is expired</h2>");
	} else {
		Object msg = request.getAttribute("msg");

		if (msg.toString().equals("Product Added")) {
%>
Product Details
<br>
Product Id ${product.prdId}
<br>
Product Name ${product.prdName}
<br>
Product Cost ${product.cost}
<br>
<%
	}

		else if (msg.toString().equals("All Product")) {
			//		List<Product> plist = (List<Product>) request.getAttribute("allprd");

			List<Product> plist = (List<Product>) session.getAttribute("allprd");
%>
<table>
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Cost</th>
	</tr>

	<%
		for (Product p : plist) {
	%>
	<tr>
		<td><%=p.getPrdId()%></td>
		<td><%=p.getPrdName()%></td>
		<td><%=p.getCost()%></td>
	</tr>

	<%
		}
	%>
</table>
<%
	} else if (msg.toString().equals("Product Found")) {
			Product prd1 = (Product) request.getAttribute("prd");
%>
<div class='class2'>
	Id is
	<%=prd1.getPrdId()%><br> Name is
	<%=prd1.getPrdName()%><br> Cost is
	<%=prd1.getCost()%><br>
</div>
<%
	}
	}
%>