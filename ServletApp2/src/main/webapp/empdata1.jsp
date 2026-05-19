<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Statement"%>
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
	Statement pst;
	ResultSet rs;%>
	<%
		List<String> list1=null;
		try {
			list1 = new ArrayList<>();
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/montran", "root", "mysql");
			pst = con.createStatement();
			rs = pst.executeQuery("select * from department");
			while (rs.next())
				list1.add(rs.getString(3));
			System.out.println("list1 size ......"+list1.size());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	%>
	<form>
		<label>Department Id</label> <input name="deptid"><br> <label>Department
			Name</label> <input name="deptid"><br> <label>Department
			Location</label> <select name="dept_loc">
			<%
				for (String s : list1) {
			%>
			<option value="<%=s%>>"><%=s%></option>
			<%
				}
			%>
		</select>

	</form>
</body>
</html>