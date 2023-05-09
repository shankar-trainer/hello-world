<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("file1.css");
</style>
</head>
<body>
<div class="style1" style="width:60%;background: aqua;">
<s:actionerror/>
	<s:form action="customerAction">
		<s:textfield name="customerId" label="Enter Id" value="0"/>
		<s:textfield label="Enter Name" name="customerName"/>
		<s:textfield label="Enter Salary" name="customerSalary" value="0"/>
		<s:submit/>
        <s:reset/>
	</s:form>
	</div>
</body>
</html>