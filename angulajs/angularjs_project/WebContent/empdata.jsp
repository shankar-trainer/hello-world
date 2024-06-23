<%@page import="org.json.simple.JSONValue"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.LinkedHashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%!Connection con;
	Statement st;

	public void jspInit() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "mysql");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}%>

<%
	st = con.createStatement();
	ResultSet rs = st.executeQuery("select count(*) from employee");
	rs.next();

	int count = rs.getInt(1);

	rs = st.executeQuery("select * from employee");

	Map map1[] = new LinkedHashMap[count];
	int x = 0;
	List list = new ArrayList();
	
	while (rs.next()) {
		map1[x] = new LinkedHashMap();
		map1[x].put("id", rs.getInt(1));
		map1[x].put("name", rs.getString(2));
		map1[x].put("salary", rs.getInt(3));
		list.add(map1[x]);
	}
	out.print(JSONValue.toJSONString(list));
%>



