<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.hello {
	border: solid;
	padding: 20pt;
	width: 50%;
	margin: 50pt
}

label {
	float: left;
	width: 110pt;
}

input {
	width: 100pt;
}
</style>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form modelAttribute="user" action="login" cssClass="hello">

		<div>
			<form:label for="id" path="id">enter id </form:label>
			<form:input path="id" />
			<form:errors path="id" cssStyle="color:red"></form:errors>
		</div>

		<div>
			<form:label for="name" path="name">enter name </form:label>
			<form:input path="name" />
			<form:errors path="name" cssStyle="color:red"></form:errors>
		</div>

		<div>
			<form:label for="salary" path="salary">enter salary </form:label>
			<form:input path="salary" />
			<form:errors path="salary" cssStyle="color:red"></form:errors>
		</div>
		<div>
			<br>
			<form:label path="hobbyList">select Hobbies</form:label>
			<br>
			<div style="margin-left: 50pt">
				<form:checkboxes items="${hobbyList}" path="hobbyList"
					delimiter="<br>" />
				<br>
				<form:errors path="hobbyList" cssStyle="color:red"></form:errors>
				<br>
			</div>
		</div>

		<div>
			<br>
			<form:label path="gender">select Gender</form:label>
			<br>
			<div style="margin-left: 50pt">
				<form:radiobuttons items="${gender}" path="gender" delimiter="<br>" />
				<br>
				<form:errors path="gender" cssStyle="color:red"></form:errors>
				<br>
			</div>
		</div>

		<div>
			<br>
			<form:label path="cityList">select City</form:label>
			<br>
			<div style="margin-left: 50pt">
				<form:select items="${cityList}" path="cityList" delimiter="<br>" />
				<br>
				<form:errors path="cityList" cssStyle="color:red"></form:errors>
				<br>
			</div>
		</div>


		<div>
			<input type="submit"> <input type="reset">
		</div>

	</form:form>



</body>
</html>