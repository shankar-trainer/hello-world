<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="color:red;border:solid 5px;margin-left:300px;padding:30px;margin-top:100px;width:30%">
<h1>Error page</h1>
Error is  <%=request.getAttribute("error") %>
</div>
</body>
</html>