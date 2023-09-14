<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<body>
<f:form action="AccountAction" modelAttribute="account">

<f:label path="accountId">Enter Account Id</f:label>
<f:input path="accountId"/>
<br>

<f:label path="accountHolderName">Enter Account Name</f:label>
<f:input path="accountHolderName"/>
<br>

<f:label path="balance">Enter Account Balance</f:label>
<f:input path="balance"/>
<br>
<input type="submit">
<input type="reset">

</f:form>
</body>
</html>