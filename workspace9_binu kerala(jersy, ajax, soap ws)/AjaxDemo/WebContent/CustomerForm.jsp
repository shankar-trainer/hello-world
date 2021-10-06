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
<script type="text/javascript">
var xmlhttpreq;
function getdata() {
	var id= document.getElementById('id2').value
  xmlhttpreq= new XMLHttpRequest();
	//xmlhttpreq.open("GET","http://localhost:9090/AjaxDemo/CustomerData.jsp?cstid="+id);
	//xmlhttpreq.open("POST","CustomerData.jsp?cstid="+id);
	xmlhttpreq.open("GET","CustomerData.jsp?cstid="+id);
	
	xmlhttpreq.onreadystatechange=function(){
		if(xmlhttpreq.readyState===4 && xmlhttpreq.status===200){
			document.getElementById("id1").innerHTML= xmlhttpreq.responseText
		}
	};
		xmlhttpreq.send(null)
}
</script>

</head>
<body>
	<%
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system",
				"manager");
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from customer");
	%>

	Select Id
 <select id="id2" onchange="getdata()"> 
		<%
			while (rs.next()) {
		%>
		<option value="<%=rs.getInt(1)%>"><%=rs.getInt(1)%></option>
		<%
			}
		%>

	</select>
	<br>
	<div id="id1">
	
	</div>
	
	
</body>
</html>