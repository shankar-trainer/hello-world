<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="css/style1.css" rel="stylesheet" />
<script type="text/javascript" src="js/script1.js">

</script>

</head>
<body>

	<header style="margin-left: 500px;">
		<h1>Product Form</h1>
	</header>

	<article>
		<form action="prdform" method="post" onsubmit="return validate()">

	<label>Enter Product Id</label> <input name="id"   type="number" id="id"><br>
	<label>EnterProduct Name</label> <input name="name" id="name"><br>
	<label>Enter Product Cost</label> <input name="cost" id="cost"  ><br>
			<input type="submit" value="Send"> <input type="reset"
				value="Cancel">

		</form>
	</article>

</body>

</html>