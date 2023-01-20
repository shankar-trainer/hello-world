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

<s:url  action="Main1"     var="eng">
<s:param name='request_locale'>english</s:param>
</s:url>

<s:url action="Main1" var="fr">
<s:param name='request_locale'>french</s:param>
</s:url>

<s:a href="%{eng}">english</s:a>
<s:a href="%{fr}">french</s:a>

<h1>Customer Form</h1>

<s:form action="userAction">
<s:actionmessage/>
<s:actionerror/>

<s:textfield key="user.id" name="id"/>
<s:textfield key="user.name" name="name"/>
<s:textfield key="user.salary" name="salary"/>

<s:submit/>
</s:form>
</body>
</html>