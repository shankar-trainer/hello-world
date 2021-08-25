<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="/struts-tags" prefix="s"%>

	<s:form action="actAction">
		<s:textfield label="Enter Account id " name="accountId" />
		<s:textfield label="Enter Account Name " name="accountName" />
		<s:textfield label="Enter Account Location " name="accountLocation" />
		<s:submit />
	</s:form>

</body>
</html>