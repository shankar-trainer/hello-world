<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html>
<html>
<s:head/>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:actionerror/>

<div style="border:solid;background:yellow;color:blue;margin:auto;padding:20px;width:30%;">
	<s:form action="userAction">
	<s:textfield label="Enter Id" name="userId"/><br>
	<s:textfield label="Enter Name"  name="userName"/><br>
	<s:textfield label="Enter Salary"  name="userSalary"/><br>
	<s:submit/>
	<s:reset/>
	</s:form>
</div>
</body>
</html>