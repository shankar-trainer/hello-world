<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> <title>Insert title here</title> </head>

<body>
	<%@taglib uri="/struts-tags" prefix="s"%> 
	<a href='LoginAction.action?request_locale=en'>English</a>
<a href='LoginAction.action?request_locale=de'>German</a>
<a href='LoginAction.action?request_locale=fr'>French</a>	

	<s:form action="LoginAction">
		<s:textfield name="roll" key="field.roll" />
		<s:textfield name="name" key="field.name" />
		<s:textfield name="subject" key="field.subject" />
		<s:submit value="Login" />
	</s:form>
	
	
</body>
</html>
