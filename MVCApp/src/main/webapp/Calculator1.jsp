<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("style1.css");

.styl1 {
	border: inset 4px;
	margin-left: 300px;
	margin-top: 100px;
	color: blue;
	background-color: yellow;
	width: 30%;
	padding: 10px;
}
</style>
</head>
<body>
	<form>
		<label>Enter no1</label> <input name='n1'><br> <label>Enter
			no2</label> <input name='n2'><br> Select Operation <br> <input
			type="radio" name="type" value="addition">Addition <br>
		<input type="radio" name="type" value="subtraction">Subtraction<br>
		<input type="radio" name="type" value="multiplication">Multiplication<br>
		<hr>
		<label>ur choice</label>
		<br>
		<input type="checkbox" name='choice' value="science">science<br>
		<input type="checkbox" name='choice' value="literature">literature<br>
		<input type="checkbox" name='choice' value="finearts">finearts<br>
		<input type="checkbox" name='choice' value="music">music<br>
		<input type="submit">
	</form>
	<div class="styl1">
     <label>ur choices are</label
     <br>
       <ol>
     <li> ${paramValues.choice[0] }
     <li> ${paramValues.choice[1] }
     <li> ${paramValues.choice[2] }
     <li> ${paramValues.choice[3] }
     </ol>
	<%
		String type = request.getParameter("type");
		if (type != null) {
	%>
		No1 is ${param.n1 }<br> No2 is ${param.n2 }<br>
		<%
			switch (type) {
				case "addition":
		%>
		Addition is ${param.n1 + param.n2}
		<%
			break;
				case "subtraction":
		%>
		Subtraction is ${param.n1 - param.n2}
		<%
			break;
				case "multiplication":
		%>
		Multiplication is ${param.n1 * param.n2}
		<%
			break;
				}
			}
		%>
	</div>
</body>
</html>