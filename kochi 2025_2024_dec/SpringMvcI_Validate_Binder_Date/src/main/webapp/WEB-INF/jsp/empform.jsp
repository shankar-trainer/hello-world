<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<form:form modelAttribute="employee" action="empaction" method="get">
	<div>
		<form:label path="id">
			<spring:message code="emp.id"></spring:message>
		</form:label>
		<form:input path="id" />
		<form:errors path="id"></form:errors>
	</div>

	<div>
		<form:label path="name">
			<spring:message code="emp.name"></spring:message>
		</form:label>
		<form:input path="name" />
		<form:errors path="name"></form:errors>
	</div>

	<div>
		<form:label path="salary">
			<spring:message code="emp.salary"></spring:message>
		</form:label>
		<form:input path="salary" />
		<form:errors path="salary"></form:errors>
	</div>
	
	<div>
		<form:label path="dob">
			<spring:message code="emp.dob"></spring:message>
		</form:label>
		<form:input path="dob" />
		<form:errors path="dob"></form:errors>
	</div>
	
	
	<div>
		<input type="submit" value="login"> <input type="reset"
			value="cancel">
	</div>


</form:form>