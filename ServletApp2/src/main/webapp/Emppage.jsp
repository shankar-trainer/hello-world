<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EmpData">
<label>Enter id </label>
<input name="empid">
<input type="submit">
</form>

<%   
Object obj1=  request.getAttribute("list1");
if(obj1!=null){
	List<String> list=(List<String>)obj1;
	if(list.size()>0){
	out.println("Record found <br>");
	for(String s:list)
		out.print(s+"   ");
	}
	else if(list.size()==0)
		out.println("Record not found ");
}


%>
</body>
</html>