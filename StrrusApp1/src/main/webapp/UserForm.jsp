<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<s:head />
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:actionerror />

	<div
		style="border: double; background: cyan; color: blue; margin: auto; padding: 20px; width: 30%;">
		<s:form action="userAction">
			<h1>User Form</h1>
			<s:textfield label="Enter Id" name="userId" />
			<br>
			<s:textfield label="Enter Name" name="userName" />
			<br>
			<s:textfield label="Enter Salary" name="userSalary" />
			<br>
			
			<s:radio  label="Select Gender" list="{'male','female'}" name="gender" />
			<br>
			
			<s:checkboxlist  label="Select Hobbies" list="{'Swimming','Reading','Music','Movie','Flowering'}" name="hobbies" />
			<br>
			
			<s:select multiple=""  label="Select Cities" list="{'Delhi','Noida','Gurgaon','Aagra','Mathura'}" name="city" />
			<br>
			<span> <s:submit /> <s:reset />
			</span>
		</s:form>
	</div>
</body>
</html>