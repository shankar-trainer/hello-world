<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>
Current Account 
</h1>

<jsp:useBean id="account" class="com.coforge.model.AccountUser" scope="session" />
Account no is <jsp:getProperty property="acccountNo" name="account"/><br>
User Name  <jsp:getProperty property="acccountUserName" name="account"/><br>
balance <jsp:getProperty property="acccountBalance" name="account"/><br>

</body>
</html>