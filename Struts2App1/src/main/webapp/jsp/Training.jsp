<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="trainingAdd">
		<s:textfield name="id" label="Enter Id" />
		<s:textfield name="name" label="Enter Name" />
		<s:textfield name="cost" label="Enter Cost" />
		<s:submit />
	</s:form>
	<!--  
http://localhost:9090/Struts2App1/trainingAction.action
 -->
</body>
</html>