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
<style type="text/css">
	.mystyle{
	margin-left:10px;
	margin-top:10px;
	};
</style>
</head>
<body>
<form>
	<h1>Calculator Program</h1>
	<label>Enter No1</label>
	<input name='n1' ><br>
	
	<label>Enter No2</label>
	<input name='n2' ><br>
	<input type="submit" value="Result">
	<input type="reset" value="Cancel">
	
	<% 
	 String n1=request.getParameter("n1");
	 String n2=request.getParameter("n2");
	 %>
	 
	 <div class="mystyle">
	
	 <% 
	 if(n1!=null && n2!=null)
	 {
	 int p1=Integer.parseInt(n1);
	 int p2=Integer.parseInt(n2);
	 
	 out.println("<br>Addition is "+(p1+p2));
	 out.println("<br>Subtraction is "+(p1-p2));
	 out.println("<br>Multiplication is "+(p1*p2));
	 out.println("<br>Division is "+(p1/p2));
	 
	 }
	%>
	</div>
</form>
</body>
</html>