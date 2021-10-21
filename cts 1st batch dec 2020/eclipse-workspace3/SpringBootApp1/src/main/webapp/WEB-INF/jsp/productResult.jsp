<%-- <%@page import="org.cts.model.Product"%>
<%  

Product product= (Product) request.getAttribute("prd");
out.print("Id is "+product.getId());

%>

<br>
Name is <%=product.getName() %> 
<br>
Cost is <%=product.getCost() %> 
 --%>

<hr>


<%
	Object err = request.getAttribute("error");
	if (err == null) {
%>
Id is ${prd.id}
<br>
Name is ${prd.name}
<br>
Cost is ${prd.cost}
<br>
<%
	} else {
%>

Error is
<%=err%>

<%
	}
%>


