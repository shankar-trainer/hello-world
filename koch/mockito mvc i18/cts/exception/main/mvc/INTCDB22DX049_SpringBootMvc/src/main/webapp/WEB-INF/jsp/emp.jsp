<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Id is
	<%=request.getParameter("id")%><br> Name is
	<%=request.getParameter("name")%><br> Salary is
	<%=request.getParameter("salary")%><br>
	<hr>
	<h2>Using EL</h2>

     Id is ${param.id}<br>
    Name is ${param.name}<br>
     Salary is ${param.salary}<br>
     
	<h2>Using JSTL</h2>
<% 
request.setAttribute("date1", new java.util.Date()); 
request.setAttribute("amount", 2000000.566565); 

%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="f"%>
     Id is <c:out value="${param.id}"></c:out><br>
     Name is <c:out value="${param.name}"></c:out><br>
     Salary is <c:out value="${param.salary}"></c:out><br>
   <br>Todays Date is  dd-MM-yyyy format   <f:formatDate value="${date1}" pattern="dd-MM-yyyy"  />
   <br>Todays Date is  dd-MM-yyyy format   <f:formatDate value="${date1}" pattern="dd-MMM-yyyy"  />
   <br>Todays Date is  dd-MM-yyyy format   <f:formatDate value="${date1}" pattern="dd-MMMMM-yyyy"  />
    <br>Amount is ${amount}
    <br>Amount is <f:formatNumber maxFractionDigits="2" value="${amount}" ></f:formatNumber>
     
     
</body>
</html>