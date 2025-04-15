<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("../css/person.css")
</style>
</head>
<body>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<h1>Student Form....</h1>
<f:form action="SAction" modelAttribute="student">
<f:label path="roll">Enter Roll</f:label>
<f:input path="roll"/>
<f:errors path="roll"></f:errors>
<br>

<f:label path="name">Enter Name</f:label>
<f:input path="name"/>
<f:errors path="name"></f:errors>

<br>

<f:label path="subject">Enter Subject</f:label>
<f:input path="subject"/>
<f:errors path="subject"></f:errors>

<br>

<input type="submit" value="send">
<input type="reset" value="cancel">
</f:form>

</body>
</html>
