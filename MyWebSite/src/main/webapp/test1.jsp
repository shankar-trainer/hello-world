<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
 .style1{
     margin-left:300px;
     margin-top:100px;
     border:double blue;     
     width:33%;
     padding:30px;
 }
</style>
</head>
<body>
<%@page import="java.util.Date"%>
<div class="style1">
Date is <%=new Date() %>
</div>
<!--  declaration part -->
<%!
    String name="harmesh kumar";
    int count=1;// instance variable
    int addition(int a , int b){
    	return a+b;
    }
%>
<!--  scriptlet coder is added to service method  -->
<%  
int x=10,y=5,z=1;// local variable 
out.print("count is "+count++);
out.print("<br>z is "+z++);
out.print("<br>no1  is "+x);
out.print("<br>no2  is "+y);
out.print("<br>sum   is "+addition(x, y));
%>
<br><br><br><br>

<!--  expression  code is added to service method as  out.println   -->
<div class="style1" style="background: yellow">

No1 is <%=x %><br>
No2 is <%=y %><br>
Addition is <%=addition(x, y) %><br>
</div>

</body>
</html>