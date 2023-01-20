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
		style="border: double; background: cyan; color: blue; margin: auto; padding: 10px; width: 30%;">
		<s:form action="empAction">
		 			<h1>Employee Form</h1>
			<s:textfield label="Enter Id" name="empId" />
			<br>
			<s:textfield label="Enter Name" name="empName" />
			<br>
			<s:textfield label="Enter Salary" name="empSalary" />
			<br>
				<s:submit value="login"/>
				
			 <s:submit value="Add Employee"  action="addEmpAction"/>
			 <s:submit value="Remove Employee"  action="removeEmpAction"/>
			 <s:submit value="Search Employee" action="searchEmpAction" />
			 <s:submit value="ShowAll Employee" action="showAllEmpAction" />
			 <s:submit value="update Employee"  action="updateMpAction" />
			</span>
		</s:form>
	</div>
</body>
</html>