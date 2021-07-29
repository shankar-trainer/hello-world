<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form action="empAction" method="post">
  <s:textfield label="id" name="id"></s:textfield>
  <s:textfield label="name" name="name"></s:textfield>
  <s:textfield label="salary" name="salary"></s:textfield>
  <s:submit></s:submit>
 
</s:form>

</body>
</html>