<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!Connection con;
	PreparedStatement pst;
	ResultSet rs;%>
	<%
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/montran", "root", "mysql");
			int id = Integer.parseInt(request.getParameter("id"));

			System.out.println("id is " + id);
			pst = con.prepareStatement("select * from employee where emp_id=?");
			pst.setInt(1, id);
			rs = pst.executeQuery();

			if (rs.next()) {
	out.println("<div style='border:5px inset blue;padding 20px;width:30%;margin-left:100px;margin-top:20px;background:lime'><h2>Record Found</h2>");
				out.println("<br>" + rs.getInt(1) + "    " + rs.getString(2) + "    " + rs.getFloat(3) + "    "
						+ rs.getDate(4));
				out.println("</div>");
			} else {
				
				out.println("<h2>Record Not Found</h2>");

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	%>
</body>
</html>