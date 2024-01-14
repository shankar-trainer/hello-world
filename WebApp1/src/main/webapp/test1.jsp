<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  expression --> 
Date is <%=new java.util.Date() %>
<br>
<!--  scriptlet --> 
Time is <%
   out.print(LocalTime.now());
   out.print("<br>no1 is "+x);
   out.print("<br>no2 is "+y);
   out.print("<br>sum  is "+addition(x, y));
%>
<br>
No1 is<%=x %> <br>
No2 is<%=y %> <br>
Sum is <%=addition(x, y) %>
<!-- declaration -->
<%!
  int count=1;
int x=10,y=20;   
int addition(int a, int b){
	return a+b;
}

%>


</body>
</html>