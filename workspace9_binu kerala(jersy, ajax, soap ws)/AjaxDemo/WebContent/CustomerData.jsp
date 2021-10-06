<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="oracle.jdbc.driver.OracleDriver"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system",
				"manager");
		Statement st = connection.createStatement();
		int id = Integer.parseInt(request.getParameter("cstid"));
		ResultSet rs = st.executeQuery("select * from customer  where id=" + id);
		System.out.print("...... customer data .jsp called");
	%>


		<%
			while (rs.next()) {
		%>
		<label>Id </label>
		<label><%=rs.getInt(1)%> </label>
		<br>

		<label>Name </label>
		<label><%=rs.getString(2)%> </label>
		<br>
		<label>Salary </label>
		<label><%=rs.getFloat(3)%> </label>
		<br>

		<%
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getFloat(3));
			}
		%>

	</select>


</body>
</html>