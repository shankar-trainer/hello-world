
<%@page import="org.com.dto.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.col{
  width:13.3%;
  float:left;
  color: white;
  background: black;
  //border:solid  1px;
}

.col1{
  width:20.0%;
  float:left;
 
}

</style>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<%-- 
		${msg }
	<br>
	
	<c:forEach var="cst" items="${list}">
  ${cst.id }
  ${cst.name}
  ${cst.salary}<br>--
</c:forEach>
	
<c:forEach var="x" begin="1" end="10" step="2">
      ${x}
      Item <c:out value="${x}" />
		<p>
</c:forEach> --%>
	<%
		List<Customer> customerList = (List<Customer>) request.getAttribute("list");
	%>

<div class="col">Id</div>
<div class="col">Name</div>
<div class="col">Salary</div>
<br>
	<%
		for (Customer c : customerList)
		{
			out.println("<br><div class='col'>"+c.getId() + "</div><div class='col'> "+c.getName()+"</div><div class='col'>   "+c.getSalary()+"</div>");
		}
	%>
	<br>
	<br>
	<br>

	<nav>
	
	<a href="../customer/delCustomerPage" class="col1">Delete Customer</a>
	<a href="../customer/updateCustomerPage" class="col1">Update Customer</a>
	
	</nav>
	
	<button></button>
	
</body>
</html>