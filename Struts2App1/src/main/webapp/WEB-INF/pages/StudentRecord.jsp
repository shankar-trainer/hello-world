<%@page import="com.example.model.MyStudent"%>
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

List<MyStudent> list1= (List<MyStudent>) session.getAttribute("list1");
if(list1==null)
	System.out.println("list1 is null...................");
else 
	System.out.println("list1 is not  null...................");
%>
	<table border='1' aligen='center' bgcolor='aqua'>
		<% 
for(MyStudent s:list1){
%>
		<tr>
			<td><%=s.getRoll() %></td>
			<td><%=s.getName() %></td>
			<td><%=s.getLocation() %></td>
		</tr>
		<% } %>

	</table>
</body>
</html>