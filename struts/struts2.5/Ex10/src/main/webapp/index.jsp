<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head />
</head>
<body>
	<%-- <s:actionmessage/> --%>
	<s:form action="login">
		<s:textfield name="empId" label="Enter Id" />
		<s:textfield name="empName" label="Enter Name" />
		<s:submit></s:submit>
	</s:form>
</body>
</html>