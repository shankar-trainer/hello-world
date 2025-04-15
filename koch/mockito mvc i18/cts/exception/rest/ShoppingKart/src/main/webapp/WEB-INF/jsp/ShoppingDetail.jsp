<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collection"%>
<%@page import="com.cts.model.Product"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("../CSS/style1.css");
</style>
</head>
<body>

	<h1>Shopping Detail ${country}</h1>
	<h2>${shop}</h2>
<hr>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<spring:message code="welcome"></spring:message>

<hr>
	
	<%
		String operation = (String) request.getAttribute("operation");
		if (operation.equals("Add Product")) {
	%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<span class="msg"> ${msg} </span>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Cost</th>
			<th>Location</th>
		</tr>
		<tr>
			<td>${prd.prdId}</td>
			<td>${prd.prdName}</td>
			<td>${prd.prdCost}</td>
			<td>${prd.prdLocation}</td>
		</tr>
	</table>
	<%
		} else if (operation.equals("Show All Product")) {
	%>

<%-- 	<%
		HashMap<Integer, Product> map = (HashMap<Integer, Product>) request.getAttribute("prdMap");

			Collection<Product> productList = map.values();
			for (Product p : productList) {
	%>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Cost</th>
			<th>Location</th>
		</tr>
		<tr>
			<td><%=p.getPrdId()%></td>
			<td><%=p.getPrdName()%></td>
			<td><%=p.getPrdCost()%></td>
			<td><%=p.getPrdLocation()%></td>
		</tr>
		<%
			}
		%>
	</table> --%>
	
	<hr width="10px" color="blue">
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Cost</th>
			<th>Location</th>
		</tr>

		<c:forEach items="${prdMap}" var="prd">

			<tr>
				<td><c:out value="${prd.value.prdId}"></c:out></td>
				<td>${prd.value.prdName}</td>
				<td>${prd.value.prdCost}</td>
				<td>${prd.value.prdLocation}</td>
			</tr>
		</c:forEach>
	</table>

	<hr width="10px" color="blue">



	<%
		} else if (operation.equals("Search Product")) {
	%>
	<span class="msg"> ${msg} </span>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Cost</th>
			<th>Location</th>
		</tr>
		<tr>
			<td>${prd.prdId}</td>
			<td>${prd.prdName}</td>
			<td>${prd.prdCost}</td>
			<td>${prd.prdLocation}</td>
		</tr>
	</table>
	<%
		} else if (operation.equals("Remove Product")) {
	%>
	<span class="msg"> ${msg} </span>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Cost</th>
			<th>Location</th>
		</tr>
		<tr>
			<td>${prd.prdId}</td>
			<td>${prd.prdName}</td>
			<td>${prd.prdCost}</td>
			<td>${prd.prdLocation}</td>
		</tr>
	</table>
	<%
		}

		else if (operation.equals("Update Product")) {
	%>
	<span class="msg"> ${msg} </span>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Cost</th>
			<th>Location</th>
		</tr>
		<tr>
			<td>${prd.prdId}</td>
			<td>${prd.prdName}</td>
			<td>${prd.prdCost}</td>
			<td>${prd.prdLocation}</td>
		</tr>
	</table>
	<%
		}
	%>
	<br>

	<input type="button" value="Back" onclick="javascript:history.back()">

	<hr>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h2>Example1 for each</h2>
	<c:forEach var="i" begin="1" end="10">
		<c:out value="${i}"></c:out>
		<br>
	</c:forEach>
	<%
		List<String> city = new ArrayList<>();
		city.add("delhi");
		city.add("chennai");
		city.add("mathura");
		city.add("virdavan");
		request.setAttribute("city", city);
	%>

	<h2>Example2 for each</h2>

	<c:forEach var="mycity" items="${city}">
        City is<c:out value="${mycity}"></c:out>
		<p>
	</c:forEach>

	<ul>
		<c:forTokens items="java, html,css,spring, spring boot" var="s"
			delims=",">
			<li><c:out value="${s}"></c:out></li>
		</c:forTokens>
	</ul>

	<h2>Example3 forToken</h2>
	<%
		request.setAttribute("name", "jack john mark april arnold");
	%>
	<c:forTokens items="${name}" delims=" " var="p">
		<c:out value="${p}"></c:out>
		<br>
	</c:forTokens>


	<h2>Example3 formatting</h2>
	<%
		request.setAttribute("date", new Date());
	%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
	default date is
	<f:formatDate value="${date}" />
	<br> long date is
	<f:formatDate dateStyle="long" value="${date}" />
	<br> short date is
	<f:formatDate dateStyle="short" value="${date}" />
	<br> medium date is
	<f:formatDate dateStyle="medium" value="${date}" />
	<br> date is
	<f:formatDate type="date" pattern="dd-MM-yyyy hh:mm:ss" value="${date}" />
	<br>



</body>
</html>