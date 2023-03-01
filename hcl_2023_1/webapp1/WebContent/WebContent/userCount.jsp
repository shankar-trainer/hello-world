<!-- declaration  
 declare variable and methods 
 added to servlet class outside all methods  
 -->
<%!
   int count=0;
   int addition(int a, int b){
	   return a+b;
   }
%>
<!--  scriptlet section all code goes into service method of the servlet   -->
<%
int a=10,b=20;
int c=0;

out.println("<h1>user count : "+count+"</h1>");
out.println("<h1> count c : "+c+"</h1>");
out.print("<h1> Addition of "+a+"  and "+b+" is "+addition(a,b)+"</h1>");

count++;
c++;

%>
<!-- expression  -->

no1 is <%=a%><br>
no2 is <%=a%><br>
addition  is <%=addition(a, b)%>

