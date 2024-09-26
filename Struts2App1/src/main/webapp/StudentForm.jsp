<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/file1.css">
<s:head/>
</head>
<body>
<s:actionerror/>
	<div class="style1">
		<s:form action="studentAction">
			<s:textfield name="roll" label="Enter Roll" />
			<s:textfield name="name" label="Enter Name" />
			<s:textfield name="marks" label="Enter Marks" />
			<s:submit value="Login" />
		</s:form>

	</div>
</body>
</html>