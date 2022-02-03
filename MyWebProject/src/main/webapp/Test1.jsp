
Date is <%=new java.util.Date() %>
<!--  declarative -->
<%!
int c=0;

int addition(int a, int b){
	return a+b;
}
%>
<!--  scriptlet -->
<% 
int a=0;
int x=10;
int y=20;

  out.println("<br>count is "+c++);
  out.println("<br>a is "+a++);
  out.println("<br>x is "+x);
  out.println("<br>y is "+y);
  out.println("<br>sum is "+addition(x, y));
%>
<!--  expression -->
<div style="color:blue;border:solid;width:30%">
No1 is <%=x %><br>
No2 is <%=y %>
Sum is <%=addition(x, y) %>

</div>



