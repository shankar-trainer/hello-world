<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("style1.css");
 .styl1{
    border:inset 4px;
    margin-left:300px;
    margin-top:100px;
    color:blue;
    background-color: yellow;
    width:30%;
    padding:10px;
 }
</style>
</head>
<body>
	<form>
		<label>Enter no1</label> <input name='n1'><br> 
		<label>Enter	no2</label> <input name='n2'><br> 
		Select Operation <br> <input type="radio" name="type" value="addition">Addition
		<br> <input	type="radio" name="type" value="subtraction">Subtraction<br>
		<input type="radio" name="type" value="multiplication">Multiplication<br>
		<input type="submit">
	</form>

	<%
		String type = request.getParameter("type");
		if (type != null) {
			int n1 = Integer.parseInt(request.getParameter("n1"));
			int n2 = Integer.parseInt(request.getParameter("n2"));
	%>
	<div class="styl1">
	No1 is
	<%=n1%><br> No2 is
	<%=n2%><br>
	<%

			switch (type) {
			case "addition":
				out.println("addition is " + (n1 + n2));
				break;
			case "subtraction":
				out.println("subtraction is " + (n1 - n2));
				break;
			case "multiplication":
				out.println("multiplication is " + (n1 * n2));
				break;

			}
	%>
	<%
		}
	%>
	</div>
</body>
</html>