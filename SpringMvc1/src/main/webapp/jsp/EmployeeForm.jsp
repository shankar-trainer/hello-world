<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	form:label{
	 float:left;
	 width:120px;
	}
	
	form:input{
	width:100px;
	}
	form{
	 background:yellow; 
	 margin-left:400px;
	 margin-top:200px;
	 border:solid;
	 width:30%;
	 padding:40px;
	}
	body{
	background:lightyellow;
	}
	form:errors{
   color:red;
   font-weight: bold;	
	}
</style>

</head>
<body>

<form:form action="empAction" modelAttribute="emp">
	<form:label path="id">Enter Id</form:label>
	<form:input path="id"/>
	<form:errors path="id"/>
	<br>
	
	<form:label path="name">Enter Name</form:label>
	<form:input path="name"/>
	<form:errors path="name"/>
	<br>
	
	<form:label path="salary">Enter Salary</form:label>
	<form:input path="salary"/>
	<form:errors path="salary"/>
	<br>
	
	<input type='submit' value='Login'>
	<input type='reset' value='Cancel'>
</form:form>
</body>
</html>