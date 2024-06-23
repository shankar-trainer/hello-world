<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.style1{
  border:10px solid;
  margin-left:200px;
  background: wheat;
  padding:50px;
  width:30%;

}

.style2{
  border:10px dotted;
  margin-left:200px;
  background: lime;
  color:yellow;
  padding:50px;
  width:30%;

}
.style3{
  border:10px double;
  margin-left:200px;
  background: black;
  color:white;
  padding:50px;
  width:30%;
}

</style>
</head>
<body>

<%@page import="java.util.Date,java.time.LocalDate" %>
<%@page import="java.time.LocalTime" %>
<%@page contentType="text/plain" %>

<h1>This is jsp page</h1>
<div class="style1">
java 7date is <%=new Date() %>
</div>
<br>
<div class="style2">
java 8 date is <%=LocalDate.now() %>
</div>
<div class="style3">
<br>
java 8 time is <%=LocalTime.now() %>
</div>
</body>
</html>