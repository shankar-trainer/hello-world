<%@page import="com.example.model.Library"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.form {
	border: solid;
	padding: 50pt;
	background: lightyellow;
	width: 50%;
	margin-left: 200pt;
	border-radius: 20pt;
	margin-top: 50pt;
}

.label {
	float: left;
	width: 100pt;
}

.error {
	color: red;
}
table,tr,td,th{
  border:solid;
}

</style>
</head>

<body>
<%  
 if(session.isNew()){
	 out.println("<h2>Your Session is expired</h2>");
	 out.println("<p><a href='index'>start again<a></p>");
 }
 else{
%>
	<div class="form">
		<%
//		String operation = request.getAttribute("operation").toString();
		String operation = session.getAttribute("operation").toString();

		if (operation.equals("show all library")) {

			List<Library> allLibrary = (List<Library>) request.getAttribute("showall");

			out.print("<table>");
			out.print("<tr>");
			out.print("<th>Id</th>");
			out.print("<th>Name</th>");
			out.print("<th>Location</th>");

			for (Library library : allLibrary) {
				out.print("<tr><td>" + library.getLibraryId() + "</td><td>" + library.getLibraryName() + "</td><td>"
				+ library.getLibraryLocation() + "</td></tr>");
			}
			out.print("</table>");
		} else if (operation.equals("add library")) {

			out.println("<h1>Record Added</h1>");
		}
		
		 else if (operation.equals("update")) {

		Library lib1=(Library)	request.getAttribute("updateLibrary");
			out.println("<h1>Record Updated</h1>");
			out.println("<h2> Updated Record is </h2>"+lib1);
		}
		%>
<%
}
%>

	</div>


</body>
</html>