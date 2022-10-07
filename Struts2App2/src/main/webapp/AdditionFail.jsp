<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head/>
</head>
<body>
<h3>Error Page</h3>
<s:actionerror/>
<h2> Exception object transferred to </h2>
<s:property value="[0].top"/>
<hr>

<s:property value="%{exception.message}"/>
<h2>Exception Detail </h2>
<s:property value="%{exceptionStack}"/>
</body>
</html>