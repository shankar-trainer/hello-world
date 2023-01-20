<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags"  prefix="s"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Form Data </h1>

<s:text name="id.output"></s:text> <s:property value="id"/><br>
<s:text name="name.output"></s:text> <s:property value="name"/><br>
<s:text name="salary.output"></s:text> <s:property value="salary"/><br>
</body>
</html>