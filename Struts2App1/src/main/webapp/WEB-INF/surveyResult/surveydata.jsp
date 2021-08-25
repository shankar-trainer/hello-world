<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("CSS/file1.css"); 

</style>
</head>
<body>
	<%@taglib uri="/struts-tags" prefix="s"%>
	<div class="style1">

		<h2>Survey  Data</h2>
		Id is
		<s:property value="surveyId"/>
		<br> Name is
		<s:property value="surveyName" />
		<br> Location is
		<s:property value="surveyLocation" />
		<br>
	</div>
</body>
</html>