<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	background-color: yellow;
	color: blue;
	width: 60%;
	font-size: 15px;
	border: inset red 20px;
	height: 30%;
	margin-left: 300px;
	margin-top: 100px;
}

tr, td, th {
	border: solid;
}
</style>
</head>
<body>
	<%!Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData metadata;%>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/montran", "root", "mysql");
		st = con.createStatement();
		rs = st.executeQuery("select * from employee");
	%>
	<table>
		<tr>
			<%
				metadata = rs.getMetaData();
				for (int c = 1; c <= metadata.getColumnCount(); c++) {
			%>
			<th><%=metadata.getColumnName(c)%></th>

			<%
				}
			%>
		</tr>
		<%
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getFloat(3)%></td>
			<td><%=rs.getDate(4)%></td>
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>