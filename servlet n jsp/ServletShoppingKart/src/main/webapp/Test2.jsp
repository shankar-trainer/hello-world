<%-- declaration syntax  this is comment --%>
<%!
    int count=1;// are instance variable
    int x=10;
    int y=20;

    int addition(int a, int b){
       return a+b;
    }
%>
<%-- scriptlet  syntax   8 implicit object , code added to jsp service method --%>
<%
  int c=1; // local variable
 out.println("count is "+count++);
 out.println("<div>Local count is "+c+++"</div>");
 out.println("<div>First No is  "+x+"</div>");
 out.println("<div>Second No is  "+y+"</div>");
 int z=addition(x,y);
 out.println("<div>Addition of "+x+" and "+y+" is  "+z+"</div>");
%>

<%-- expression equivalent to out , added to service method --%>

<div>No1 is <%=x%></div>
<div>No2 is <%=y%></div>
<div>Sum is <%=addition(x,y)%></div>