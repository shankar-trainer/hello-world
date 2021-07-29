<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>

<body>
	
	<s:actionerror/>
	<s:form action="go" method="post">
		<s:textfield label="id" name="id" />
		<br>
		<s:textfield label="name" name="name" />
		<br>
		<s:submit />

	</s:form>
</body>
</html>