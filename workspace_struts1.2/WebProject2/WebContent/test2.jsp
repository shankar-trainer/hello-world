<h1>Declaration</h1>

<%!int count = 1;// instance variable

	int addition(int a, int b) {
		return a + b;
	}%>
<h2>scriptlet</h2>
// added to servlet service method // declare variables,initialise it,
use all implicit objects
<%
	int x = 1; // local varible
	out.print("user count is " + count++); // increment
	out.print("<br>x is  " + x++); // not increment
	int a = 10, b = 20;
	out.print("<br>no1 is " + a);
	out.print("<br>no2 is " + b);
	out.print("<br>sum is " + addition(a, b));
%>
<hr width="20px" color="blue">
<h2>Expression</h2>
<!--    expression 
      it can have variable name or method
  -->
<br>
<b>No1 is <%=a%></b>
<br>
<u>No2 is <%=b%></u>
<br>
<font color='blue'>Addition is <%=addition(a, b)%></font>
<br>

<h1>Employee Information</h1>
<%@include file="EmployeeData.jsp"%>

