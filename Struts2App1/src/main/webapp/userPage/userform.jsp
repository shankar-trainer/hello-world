<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("../CSS/file1.css");
</style>
</head>
<body>
	<%@taglib uri="/struts-tags" prefix="s"%>
<div class="style1">
	<s:form action="myaction">
	
	<div style="text-align:center;background:yellow;color:red;">
	<s:label > UserForm</s:label>
	</div>
		<s:textfield label="Enter Id" name="id" />
		<s:textfield label="Enter Name" name="name" />
		<s:textfield label="Enter Age" name="age" />
		<s:textarea label="Enter Comments " name='comment' rows='4'>  </s:textarea>
		 <s:submit /> <s:reset />
	</s:form>
</div>

</body>
</html>