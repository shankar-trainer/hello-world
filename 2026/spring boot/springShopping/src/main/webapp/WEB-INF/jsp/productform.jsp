<%@page import="com.cts.model.User"%>
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
	<form:form modelAttribute="product" action="/product/productsubmit"
		method="post">
		<fieldset style="width:30%;">
			User Details
			<p>
			<div>Id is ${user.id}</div>
			<div>Name is ${user.name}</div>
<% 
session.setAttribute("user",(User)request.getAttribute("user"));
%>
		</fieldset>
		<h3>Product form</h3>
		<div>
			<form:label path="prdid">Enter Product Id</form:label>
			<form:input path="prdid" />
			<form:errors path="prdid"></form:errors>
		</div>
		<div>
			<form:label path="prdname">Enter Product  Name</form:label>
			<form:input path="prdname" />
			<form:errors path="prdname"></form:errors>
		</div>

		<div>
			<form:label path="prdcost">Enter Cost</form:label>
			<form:input path="prdcost" />
			<form:errors path="prdcost"></form:errors>
		</div>

		<div>
			<button type="submit">Add Product</button>
			<button type="reset">Cancel</button>
		</div>
	</form:form>
</body>
</html>
