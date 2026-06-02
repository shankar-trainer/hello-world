<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<form:form action="addRecord" modelAttribute="insurance" method="post"
		cssClass="style1">

		<div>
			<form:label path="id">Enter Id </form:label>
			<form:input path="id" />
			<form:errors path="id" cssClass="style2"></form:errors>
		</div>

		<div>
			<form:label path="name">Enter Name </form:label>
			<form:input path="name" />
			<form:errors path="name" cssClass="style2"></form:errors>
		</div>

		<div>
			<form:label path="amount">Enter Amount </form:label>
			<form:input path="amount" />
			<form:errors path="amount" cssClass="style2"></form:errors>
		</div>

		<div>
			<div style="margin-top: 5pt;">
				<button type="submit" name="submit" value="add record">add
					record</button>
				<button type="submit" name="submit" value="show all">show
					all record</button>

				<button type="submit" name="submit" value="search by id">
					search by id</button>
			</div>
			<div style="margin-top: 5pt;">
				<button type="submit" name="submit" value="delete by id">
					delete by id</button>

				<button type="submit" name="submit" value="update record">
					update record</button>

				<button type="reset">cancel record</button>
			</div>
		</div>

	</form:form>

</body>
</html>