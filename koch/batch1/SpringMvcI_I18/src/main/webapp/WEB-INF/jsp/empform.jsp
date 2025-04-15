<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<nav>
 <a href="?language=en">English</a>
 <a href="?language=fr">French</a>
</nav>
	<form:form modelAttribute="employee" action="empaction">
		<div>
			<form:label path="id"><spring:message code="emp.id"/></form:label>
			<form:input path="id" />
			<form:errors path="id"></form:errors>
		</div>
		
		<div>
			<form:label path="name"><spring:message code="emp.name"/></form:label>
			<form:input path="name" />
			<form:errors path="name"></form:errors>
		</div>
		
		<div>
			<form:label path="salary"><spring:message code="emp.salary"/></form:label>
			<form:input path="salary" />
			<form:errors path="salary"></form:errors>
		</div>
		<div>
			<input type="submit" value="login">
			<input type="reset" value="cancel">
		</div>	
		
		
</form:form>