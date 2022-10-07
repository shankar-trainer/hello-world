<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="/struts-tags"  prefix="s"%>
<h1>Product Information</h1>
Id is <s:property value="prdId"/><br>
Name is <s:property value="prdName"/><br>
Cost is <s:property value="prdCost"/><br>
</body>
</html>