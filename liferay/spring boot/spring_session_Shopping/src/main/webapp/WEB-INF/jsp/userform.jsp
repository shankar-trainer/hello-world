<html>
<head>
<style>
@import url("../../style1.css");

label {
	float: left;
	width: 110pt;
}

button {
	color: white;
	background-color: blue;
	margin-left: 3pt;
	width: 90pt;
	border-radius: 10pt;
}

.style2 {
	color: red;
	text-decoration: underline;
}
</style>
</head>
<body>
	<h2>User Form</h2>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form modelAttribute="user" action="usersubmit" method="post">
		<div>
			<form:label path="id">Enter Id</form:label>
			<form:input path="id" />
			<form:errors path="id"></form:errors>
		</div>
		<div>
			<form:label path="name">Enter Name</form:label>
			<form:input path="name" />
			<form:errors path="name"></form:errors>
		</div>
		<div>
			<button type="submit">login</button>
			<button type="reset">cancel</button>
		</div>
	</form:form>
</body>
</html>
