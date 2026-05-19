<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("../CSS/file1.css");
</style>

</head>
<body>
	<%@taglib uri="/struts-tags" prefix="s"%>
	<div class="style1">
		Id is
		<s:property value="id" />
		<br> Name is
		<s:property value="name" />
		<br> Age is
		<s:property value="age" />
		<br>
		<br> Comment is
		<s:property value="comment" />
		<br>

	</div>
</body>
</html>