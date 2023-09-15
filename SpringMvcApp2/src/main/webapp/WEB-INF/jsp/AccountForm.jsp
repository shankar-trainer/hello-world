<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>	
<link rel="stylesheet" href='<spring:url value="/resources/style1.css"/>'/>
<style>
  label {
	width:150px;
}
.error1{
 color:red;
}
form{
 width:39%;
}
</style>
</head>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<body>
<f:form action="AccountAction" modelAttribute="account">

<f:label path="accountId">Enter Account Id</f:label>
<f:input path="accountId"/>
<f:errors path="accountId" cssClass="error1"></f:errors>
<br>

<f:label path="accountHolderName">Enter Account Name</f:label>
<f:input path="accountHolderName"/>
<f:errors path="accountHolderName" cssClass="error1"></f:errors>
<br>

<f:label path="balance">Enter Account Balance</f:label>
<f:input path="balance"/>
<f:errors path="balance" cssClass="error1"></f:errors>

<br>
<input type="submit">
<input type="reset">

</f:form>
</body>
</html>