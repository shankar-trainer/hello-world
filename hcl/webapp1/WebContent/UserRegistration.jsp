<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("css/style1.css");
</style>

</head>
<body>
	<%
		String nameerr, emailerr, phoneerr, doberr, addresserr;
		if (request.getParameter("nameerr") == null)
			nameerr = "";
		else
			nameerr = request.getParameter("nameerr");

		if (request.getParameter("emailerr") == null)
			emailerr = "";
		else
			emailerr = request.getParameter("emailerr");

		if (request.getParameter("doberr") == null)
			doberr = "";
		else
			doberr = request.getParameter("doberr");

		if (request.getParameter("addresserr") == null)
			addresserr = "";
		else
			addresserr = request.getParameter("addresserr");

		if (request.getParameter("phoneerr") == null)
			phoneerr = "";
		else
			phoneerr = request.getParameter("phoneerr");
	%>
	<form action="UserRegistrationServlet" method="post">
		<h1>User Form</h1>

		<label>Enter Name</label> <input name='name'> <span><%=nameerr%>
		</span> <br> <label>Enter EmailId</label> <input type='email'
			name='email'><br> <span><%=emailerr%> </span> <br>

		<label>Enter DOB</label> <input type='date' name='dob'><br>
		<span><%=nameerr%> </span> <br> <label>Enter Address</label>
		<textarea name='address' rows="5" cols="20"></textarea>
		<span><%=addresserr%> </span> <br> <br> <label>Enter
			Phone No</label> <input type='number' name='phone'><br> <span><%=phoneerr%>
		</span> <br> <input type="submit" value="login"> <input
			type="reset" value="cancel">
	</form>
</body>
</html>