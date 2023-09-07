

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.time.LocalDate"%>
<div style="color:blue;border:solid;width:30%;margin-left: 300px;margin-top: 100px;padding: 20px;">

<%-- declaration --%>
<%! 
  int count=1;

   int addition(int a, int b){
	   return a+b;
   }
%>
<%-- scriptlet --%>
<% 
  out.print("<br> count is "+count);
  count=count+1;
  int a=10,b=20;
  int c=addition(a, b);
  out.print("<br>sum of "+a+" and "+b+" is "+c);
%>

<%--  expression --%>
<br><br>
No1 is <%=a %><br>
No2 is <%=b %><br>
Sum  is <%=c %><br>
Addition of 30 and 40 is <%=addition(30, 40) %>

<br><br>
Date is <%=LocalDate.now() %>

</div>
</body>
</html>