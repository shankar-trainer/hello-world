<%@page import="java.util.Date,java.util.Calendar"%>
<%@page contentType="text/html" %>
<%@page session="true" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
date is <%=new Date() %>
<br><br><br>
time  is <%
Calendar calendar=Calendar.getInstance();
out.println(calendar.get(Calendar.HOUR)+":"+calendar.MINUTE);
 
 
 %>
Session id is <%=session.getId() %>

</body>
</html>