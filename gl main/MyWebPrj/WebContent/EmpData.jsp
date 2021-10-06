<%@page import="javax.naming.NamingException"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
	background-color: green;
	color: yellow;
	width: 40%;
	margin-left: 350px;
	border:  double 10px;
	padding: 2em;
}
td,tr{
border: inset blue 3px;
}
</style>
</head>
<body>
	<%@page import="java.sql.Connection"%>

	<h1>Employee Record</h1>
	<%@page import="java.sql.PreparedStatement,java.sql.ResultSet"%>

	<%!
	InitialContext context;
	DataSource ds;
	PreparedStatement pst;
	ResultSet rs;
	Connection connection; 
	%>

	<%
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/TestDB");
			connection=ds.getConnection();
			pst=connection.prepareStatement("select * from employee");
			rs=pst.executeQuery();
			%>
			<table>
			<% 
			while(rs.next()){
			%>
		    <tr>
		    <td><%=rs.getInt(1) %></td>
		    <td><%=rs.getString(2) %></td>
		    <td><%=rs.getFloat(3) %>
		    </td>
		    
		    </tr>	
			<%
			}
		%>
		</table>
		<% 	
		} catch (NamingException e) {
			e.printStackTrace();
			out.print(e);
		}
	%>


</body>
</html>