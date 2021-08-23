<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Current  Account Page </h1>
<%-- <jsp:useBean id="account"  class="edu.abc.model.Account" scope="request"/>
Id is <jsp:getProperty property="actId" name="account"/><br>
Name is <jsp:getProperty property="actName" name="account"/><br>
 --%>
 
Id is ${account.actId}<br>
Name is ${account.actName}<br>

</body>
</html>