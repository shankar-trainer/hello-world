<%@page import="com.abc.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Employee> list1 = (List<Employee>) session.getAttribute("list1");
	if (list1 == null)
		System.out.println("list1 is null...................");
	else
		System.out.println("list1 is not  null...................");
	%>
	<table border='1' align='center' bgcolor='aqua'>
		<%
		for (Employee e : list1) {
		%>
		<tr>
			<td><%=e.getId()%></td>
			<td><%=e.getName()%></td>
			<td><%=e.getSalary()%></td>
		</tr>
		<%
		}
		%>

	</table>
</body>
</html>