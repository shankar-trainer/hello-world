<html>
<head>
<script>
<script type="text/javascript" src="../../validate.js">

</script>
<style>
 @import url("../../style.css")
</style>
</head>

<body>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<form:form action="UserAction" modelAttribute="user" onsubmit='return validate()'>

	<form:label path="id">Enter Id</form:label>
	<form:input path="id" id="id"/>
	<form:errors path="id"/><br>

	<form:label path="fname">Enter First Name</form:label>
	<form:input path="fname" id="fname"/>
	<form:errors path="fname"/><br>

	<form:label path="lname">Enter Last Name</form:label>
	<form:input path="lname" id="lname"/>
	<form:errors path="lname"/><br>
 	<input type="submit"  value="login">
 	<input type="reset"  value="cancel">

</form:form>
</body>
</html>