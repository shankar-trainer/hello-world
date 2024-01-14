<h1>Date and Time</h1>
 
<%@page import="java.time.LocalDate"%>

<%
out.print("date is "+LocalDate.now());
%>
<br>

<%@page import="java.time.LocalTime"%>

Time is 
<%
out.print("date is "+LocalTime.now());
%>

<%@page import="java.sql.Statement"; import="java.sql.ResultSet";%>




