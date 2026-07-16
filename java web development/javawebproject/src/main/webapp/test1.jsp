<%@ page import="java.time.LocalTime" %>
Date is <%=new java.util.Date() %>
<br>
Time is <%=LocalTime.now()%>
<%--Declaration part--%>
<%!
    int a = 10;
    int b = 20;

    int addition(int x, int y) {
        return x + y;
    }
%>
<br>
<%--Expression--%>
no1 is <%=a%><br>
no2 is <%=b%><br>
addition is <%=addition(a, b)%><br>

<%--scriptlet--%>
<%
    out.println("<br>hello world");
    out.println("<br>no1 is " + a);
    out.println("<br>no2 is " + b);
    out.println("<br>sum  is " + addition(a, b));
%>
