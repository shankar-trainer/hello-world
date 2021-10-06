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

	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form modelAttribute="cst" action="../customer/update">

		<%
			while (rs.next()) {
		%>
		<label for="id">Id </label>
		<form:input path="id" value="<%=rs.getInt(1)%>" />
		<br>

		<label for="name">Name </label>
		<form:input path="name" value="<%=rs.getString(2)%>" />
		<br>
		<label for="salary">Salary </label>
		<form:input path="salary" value="<%=rs.getFloat(3)%>" />

		<input type="submit">
		<br>
		<%
			}
		%>
	</form:form>
</body>
</html>