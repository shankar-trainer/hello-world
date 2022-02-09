<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- declaration part  -->
<%! 
 int count=1;
 String country="india";
  int addition(int a, int b){
	  return a+b;
  }
%>
<!--  scriptlet part -->
<% 
int x=10,y=5,z=1;
out.print("page hits "+count++);
out.println("<br> country is "+country);
out.println("<br> local z incremented  is "+z++);
out.println("<br> no1 is  "+x);
out.println("<br> no2 is  "+y);
int p=addition(x,y);
out.println("<br> sum is  "+addition(x,y));
%>

<hr>
<b>Page hits </b><%=count %><p>
<b>Country is  </b><%=country %><p>
<b>No1 is  </b><%=x %><p>
<b>No2 is  </b><%=y %><p>
<b>Sum is  </b><%=addition(x,y) %><p>

</body>
</html>