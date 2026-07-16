
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, tr, td, th {
	border: solid;
}

table {
	width: 40%;
	background-color: yellow;
	margin: 100pt;
}

tr {
	padding: 5%;
}
</style>
</head>
<body>
	<%@page import="java.util.Date, java.util.List"%>
	Date is
	<%=new Date()%>
	<br>

	<%@page import="java.time.LocalDate"%>
	java 8 Date is
	<%=LocalDate.now()%>

	<%@page import="com.coforge.util.DatabaseUtil"%>
	<%@page import="java.sql.ResultSet"%>
	<%@page import="java.sql.Statement"%>
	<%@page import="java.sql.Connection"%>

	<%!Connection connection;
	Statement statement;
	ResultSet rs;%>

	<%
	connection = DatabaseUtil.getDatabaseConnection();
	statement = connection.createStatement();
	rs = statement.executeQuery("select * from student");
	%>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>City</th>
		</tr>
		<%
		while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
		</tr>

		<%
		}
		%>
	</table>
</body>
</html>