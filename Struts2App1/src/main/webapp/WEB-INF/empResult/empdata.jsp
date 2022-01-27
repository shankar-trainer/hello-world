<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("CSS/file1.css"); 

</style>
</head>
<body>
	<%@taglib uri="/struts-tags" prefix="s"%>
	<div class="style1">

		<h2>Employee Data</h2>
		Id is
		<s:property value="empId"/>
		<br> Name is
		<s:property value="empName" />
		<br> Salary is
		<s:property value="empSalary" />
		<br> Gender is
		<s:property value="gender" />
		<br> Job are
		<s:property value="job" />
		<br> City are
		<s:property value="city" />
		<br> States are
		<s:property value="state" />
		<br>
	</div>
</body>
</html>