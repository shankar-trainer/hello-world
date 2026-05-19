	<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("CSS/file1.css");
</style>

<s:head/>
</head>
<body>
<div class="style1" style="width:60%;background: aqua;">
<s:actionerror/>
	<s:form action="surveyAction" >
		<s:textfield name="surveyId" label="Enter Id" value="0"/>
		<s:textfield label="Enter Name" name="surveyName"/>
		<s:textfield label="Enter Location" name="surveyLocation" />
		<s:submit/>
	</s:form>
	</div>
</body>
</html>