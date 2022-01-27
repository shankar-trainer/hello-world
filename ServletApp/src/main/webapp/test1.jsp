date is
<%=new java.util.Date()%>
<!--   Declaration    -->
<!--   Declare instance and static  variable and methods   -->

<%!int x = 10;
	int y = 20;

	int addition(int a, int b) {
		return a + b;
	}

	int counter = 1;%>

<!--   scriptlet   -->
<!-- added to service method       -->
<!-- local variable       -->

<%
	int c = 1;//  local variable inside service method

	out.println("<br>count  is " + counter++);
	out.println("<br>c  is " + c++);

	out.println("<br>no1 is " + x);
	out.println("<br>no2 is " + y);
	out.println("<br>sum  is " + (addition(x, y)));
%>
<!--   expression   -->
<!--   added to out.println   -->
<br><br><br>

No1 is<%=x%><br>
No2 is<%=y%><br>
Addition is<%=addition(x, y)%><br>


