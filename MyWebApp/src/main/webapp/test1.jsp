
date is <%=new java.util.Date() %>
<!--  declarative section   added to class -->

<%!
int count=1;

int addition(int p, int q){
	return p+q;
}

%>
<!--  scriptlet added to service   -->
<% 
int x=1; 
int k=9,m=8;
out.print("<br>count is "+count++);
out.print("<br>x is "+x++);
out.print("<br>sum  of  "+k+" and "+m+" is "+addition(k, m));
%>

<!--  expression  is added to output  inside service   -->
<div style="background: blue;color:yellow;border:solid;width:30%;margin-left:300px;padding:20px">
no1 is <%=k %><br>
no2 is <%=m %><br>
sum  is <%=addition(k, m) %><br>
</div>






