<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="survey.jsp">
Enter Id<input name='id'><br>
Enter name<input name='name'><br>
Enter salary<input name='salary'><br>
<br>select cities <br>
<select name="cities" multiple="multiple">
<option value="chennai">chennai</option>
<option value="mumbai">mumbai</option>
<option value="sholapur">sholapur</option>
<option value="goregaon">goregaon</option>
<option value="bijapur">bijapur</option>

</select>

<br>

<input type='submit'>
<input type='reset'>
</form>





















<% 
String id=request.getParameter("id");
String name=request.getParameter("name");
String salary=request.getParameter("salary");
if(id!=null && id!="" && name!=null && name!="" && salary!=null && salary!="")
{
	out.println("id is "+id);
	out.println("<br>name is "+name);
	out.println("<br> is "+salary);
	
	}

else
	out.println("some problem");
%>

</body>
</html>