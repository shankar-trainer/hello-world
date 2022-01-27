<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@taglib uri="/struts-tags" prefix="s"%>
<link rel="stylesheet" href="CSS/file1.css">
</head>
<body>
	<div class="style1">
		Roll is
		<s:property value="roll" />
		<s:if test="roll>=1001">
			<br> You are good student
	</s:if>

		<s:else>
	You are average student
	</s:else>

		<br> Name is
		<s:property value="name" />
		<br> Marks is
		<s:property value="marks" />
		<br> School is
		<s:property value="#session.schoolName" />
		<br> Location is
		<s:property value="#session.schoolLocation" />
		<br> City is
		<s:property value="#session.city" />
		<br> State is
		<s:property value="#session.state" />
		<br>
	</div>
	<hr>
	
	<s:url var="url" action="generictag">generic tag</s:url><br>
	
	<s:a href="%{url}">generic tag</s:a>

</body>
</html>