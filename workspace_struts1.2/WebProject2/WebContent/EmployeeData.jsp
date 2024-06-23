<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
	Statement st;
	ResultSet rs;
	Connection con;
	%>
	
	<%  
	 Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","mysql");
	st=con.createStatement();
	
	rs=st.executeQuery("select * from employee");
	
	while(rs.next())
	
	out.println("<br>"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
	
	%>
</body>
</html>