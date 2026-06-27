<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@page import="com.cts.model.Insurance"%>
	<%@page import="java.util.List"%>

	<%
	String msg = request.getAttribute("msg").toString();
	if (msg.equals("add record")) {
	%>
	<h2>Record added</h2>
	<%
	} else if (msg.equals("show all")) {

	List<Insurance> allInsurance = (List<Insurance>) request.getAttribute("allInsurance");
	%>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>salary</th>
		</tr>
		<%
		for (Insurance insu : allInsurance) {
		%>
		<tr>
			<td><%=insu.getId()%></td>
			<td><%=insu.getName()%></td>
			<td><%=insu.getAmount()%></td>
		</tr>
		<%
		}
		%>
	</table>

	<%
	}
	else if (msg.equals("search by id")) {
    Insurance ins1=(Insurance)request.getAttribute("insurance1");
     if(ins1==null)
    	 out.println("id not present ");
     else {
    	 out.println("<p>insurance found with id ");
    	 out.print("<ul><li>id is "+ins1.getId());
    	 out.print("<li>name is "+ins1.getName());
    	 out.print("<li>amount is "+ins1.getAmount()+"</ul>");
     }
	} 
	else if (msg.equals("delete by id")) {
    Insurance ins1=(Insurance)request.getAttribute("ins");
     if(ins1==null)
    	 out.println("id not present ");
     else {
    	 out.println("<p>insurance deleted  with id ");
    	 out.print("<ul><li>id is "+ins1.getId());
    	 out.print("<li>name is "+ins1.getName());
    	 out.print("<li>amount is "+ins1.getAmount()+"</ul>");
     }
	}
	else if(msg.equals("update record")){
		var ins3=(Insurance)request.getAttribute("ins3");
		if(ins3==null)
			out.println("record with id not present");
		else {
			out.println("record found  and updated");
			out.println("<p>"+ins3);
		}
	}	
	%>

</body>
</html>