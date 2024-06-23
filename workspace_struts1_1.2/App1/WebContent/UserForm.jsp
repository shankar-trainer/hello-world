<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="/tags/struts-html"  prefix="html"%>

<html:form action="go">
<label>Enter Id</label>
<html:text property="id"></html:text><br>

<label>Enter Name</label>
<html:text property="name"></html:text><br>
<html:submit></html:submit>
<html:reset></html:reset>
</html:form>
</body>
</html>