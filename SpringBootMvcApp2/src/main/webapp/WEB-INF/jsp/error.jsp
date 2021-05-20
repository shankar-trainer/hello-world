<h1>Error Page</h1>

<%@page isErrorPage="true"%>

Following error

<%
out.print(exception.getMessage());
%>

<% 

System.out.println(exception.getMessage()+" .....................");

%>
