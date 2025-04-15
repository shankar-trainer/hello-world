<%@page import="com.cts.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	List<Employee> empList = (List<Employee>) request.getAttribute("emplist");
	%>
	<table>
		<%
		for (Employee emp : empList) {
		%>
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getName()%></td>
			<td><%=emp.getSalary()%></td>
		</tr>
	</table>

	<%
	}
	%>

</body>
</html>