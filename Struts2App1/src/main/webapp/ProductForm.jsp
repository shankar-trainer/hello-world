<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="/struts-tags" prefix="s"%>
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
		<a href='prdAction.action?request_locale=en'>English</a> <a
			href='prdAction.action?request_locale=fr'>French</a>
		<s:form action="prdAction">

			<s:label>Product Page</s:label>
			<s:textfield name="prdId" key="prd.label.id" />
			<s:textfield name="prdName" key="prd.label.name" />
			<s:textfield name="prdCost" key="prd.label.cost" />
			<s:submit />

		</s:form>
	</div>
</body>
</html>