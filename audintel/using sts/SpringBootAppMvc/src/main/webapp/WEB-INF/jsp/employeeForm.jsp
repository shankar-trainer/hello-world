<html>
<head>
<style>
@import url('../../user.css')
</style>
</head>
<body>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h1>Employee Form</h1>

<form:form action="empAction" modelAttribute="emp" method="post">
	<form:label path="id">Enter Id</form:label>
	<form:input path="id"/>
	<form:errors path="id"/>
    <br>

	<form:label path="name">Enter Name</form:label>
	<form:input path="name"/>
	<form:errors path="name"/>
    <br>

	<form:label path="salary">Enter salary</form:label>
	<form:input path="salary"/>
	<form:errors path="salary"/>
    <br>
	<input type='submit' name="submit"  value="send">
	<input type='submit' name="submit" value="getAllEmployeeRecord">
	<input type='reset' value='cancel'>
</form:form>

</body>
</html>