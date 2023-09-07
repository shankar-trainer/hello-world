<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 @import url("css/style1.css");
</style>

<style type="text/css">
.hello{
 color:red;
 font-weight: bold;
 font-size: 20px;
 width:50%;
 height: 100px;
}
</style>

</head>
<body>

<%@ page isErrorPage="true" %>

<div class="hello">

Error is     ...... 
<br>
<%=exception %>
</div>


</body>
</html>