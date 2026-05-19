	<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("CSS/file1.css");
</style>

<s:head/>
</head>
<body>
<div class="style1" style="width:60%;background: aqua;">
<s:actionerror/>
	<s:form action="empAction" >
		<s:textfield name="empId" label="Enter Id" value="0"/>
		<s:password name="empPass" label="Enter Password"/>
		<s:textfield label="Enter Name" name="empName"/>
		<s:textfield label="Enter Salary" name="empSalary" value="0"/>
		<s:checkboxlist list="{'delhi','chennai','mumbai','noida'}" name="city" label="Select City"   />
		<s:radio list="{'male','female'}" name='gender' label="select Gender"/>
		<s:select label="select state" list="{'','mp','maharastra','tamil nadu','HP','AP','telangana','UP'}" name='state'></s:select>
		<s:combobox  name='job' list="{'','developer','analyst','tester','designer','project leader','team leader'}" label="select Job"/>
		<s:submit/>
	</s:form>
	</div>
</body>
</html>