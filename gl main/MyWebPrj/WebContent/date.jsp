
date is <%=new java.util.Date() %>
<%!

int x=100, y=200;
  int addition(int a, int b){
	  return a+b;
  }

%>

x is <%=x%><br>

<% 
 out.print("no1 is "+x);
 out.print("<br>no2 is "+y);
 int z=addition(x, y);
 out.print("<br>sum is ..."+z);
 
%>
y is <%=y%><br>
sum is <%=addition(x, y)%><br>
sum is <%=addition(20, 30)%><br>



