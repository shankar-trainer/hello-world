<%@page import="org.com.dto.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function deleteCustomer() {
	console.log("delete called  ")
var res=confirm("do you want to delete")
	if(res==true)
		return true;
	else
		return false;
}
/* 
window.onbeforeunload = function() {
	  return "";
	} */
</script>

</head>
<body>

	<%
		List<Customer> customerList = (List<Customer>) request.getAttribute("list");
	%>
	<br>
	<form action="../customer/delete" onsubmit="return deleteCustomer()">
		select Id To delete <select name="id">
			<%
				for (Customer c : customerList) {
			%>
			<option value='<%=c.getId()%>'>
				<%=c.getId()%>
			</option>
			<%
				}
			%>
		</select> <br> <br> <input type="submit" value="Delete">

	</form>
</body>
</html>