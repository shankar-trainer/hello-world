<%@page import="com.cognizant.model.User"%>
<%@page import="java.util.List"%>
<html>
<head>
<style>
label {
	width: 220px;
	float: left;
	margin-left: 300px;
	margin-top: 100px;
	padding: 40px;
	border: solid;
}
div{
 background:lightyellow;
 color:green;
 width:70%;
 padding:5px;
 margin-left:300px;
}
</style>
<body>
	<%
	String adminstatus = request.getAttribute("status").toString();
	if (adminstatus == "true") {
	%>
	<label>Admin Login Successful </label>
	<br><br><br><br><br><br><br><br><br><br><br><br>
	<%
	List<User> list1 = (List<User>) request.getAttribute("list");
	out.println("<div>");
	%>
		<h2>List Of Users</h2>
	
	<% 
	out.println("<table bgcolor='yellow' width='40%' border='4'>");
	out.println("<tr><th>Id</th><th>Name</th><th>Age</th><th>Status</th></tr>");

	for (User e : list1) {

		out.println("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getAge() + "</td><td>"
		+ e.getApproved() + "");

	}
	out.println("</table>");
	out.println("</div>");
	} else {
	%>

	<label>Admin Not Present </label>

	<%
	}
	%>
</body>
</html>

