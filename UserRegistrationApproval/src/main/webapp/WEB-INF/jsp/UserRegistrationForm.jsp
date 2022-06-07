<html>
<head>
<script type="text/javascript" src="../../validate.js">

</script>
<style>
 @import url("../../style.css")
</style>
</head>

<body>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<form:form action="userRegistration" modelAttribute="user" onsubmit='return validate()'>

	<form:label path="id">Enter Id</form:label>
	<form:input path="id" id="id"/>
	<form:errors path="id"/><br>

	<form:label path="name">Enter  Name</form:label>
	<form:input path="name" id="name"/>
	<form:errors path="name"/><br>

	<form:label path="age">Enter Age</form:label>
	<form:input path="age" id="age"/>
	<form:errors path="age"/><br>
	
	<form:label path="pass">Enter Password</form:label>
	<form:input path="pass" id="pass" type='password'/>
	<form:errors path="pass"/><br>

 	<input type="submit"  value="Register">
 	<input type="reset"  value="cancel">

</form:form>
</body>
</html>