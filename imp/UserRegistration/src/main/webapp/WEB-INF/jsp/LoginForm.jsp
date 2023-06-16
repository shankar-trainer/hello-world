<html>
<head>
<script>


</script>
<style>
@import url("../../style.css")
</style>
<script type="text/javascript" src="../../validate.js">

</script>

</head>

<body>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<form:form action="loginAction" modelAttribute="login"  onsubmit='return validate1()'>

	<form:label path="id">Enter Id</form:label>
	<form:input path="id" id="id"/>
	<form:errors path="id"/><br>

	<form:label path="pass">Enter Password</form:label>
	<form:input type='password' path="pass" id="pass"/>
	<form:errors path="pass"/><br>

 	<input type="submit"  value="Login">
 	<input type="reset"  value="Cancel">

</form:form>
</body>
</html>