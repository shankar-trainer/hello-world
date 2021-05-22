
<%@page import="com.cts.model.Customer"%>
<style>
@import url("../css/mystyle.css");
</style>




<!-- 
<div class='index'>
	<label>Id is </label>
	<label> ${customer.id}</label><br>
	
	<label>Name is </label>
	<label> ${customer.name}</label><br>
	
	<label>Location is </label>
	<label> ${customer.location}</label><br>

</div>

 -->
<%
	if (session.isNew()) {
		out.println("<h2>Your session is expired </h2> ");
	} else {
		Customer customer = (Customer) session.getAttribute("customer");
%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<a href="<%=request.getContextPath()%>/WEB-INF/jsp/Logout.jsp">Logout</a>
<br>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<br>
<a href="${contextPath}/WEB-INF/jsp/Logout.jsp">Logout </a>
<br>

<a href='/WEB-INF/jsp/Logout.jsp'>Logout </a>
 --%>



<a href='Logout'>Logout </a>

<table>

	<caption>Customer Detail</caption>
	<tr>
		<th>Id</th>
		<td><%=customer.getId()%></td>
	</tr>
	<tr>
		<th>Name</th>
		<td><%=customer.getName()%></td>
	</tr>
	<tr>
		<th>Location</th>
		<td><%=customer.getLocation()%></td>
	</tr>
	<tr>
		<th>Country</th>
		<td><%=session.getAttribute("country")%></td>
	</tr>

</table>
<%
	}
%>



