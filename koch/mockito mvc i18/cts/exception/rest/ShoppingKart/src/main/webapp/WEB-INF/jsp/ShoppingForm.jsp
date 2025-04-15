<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<style type="text/css">
@import url("../CSS/style1.css");
</style>
</head>
<body>
	<nav>

		Language: <a href="?language=en">English</a> 
		<a href="?language=fr">French</a>
		<a href="?language=bn-IN">Bangla</a>

	</nav>


	<hr>
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<spring:message code="welcome"></spring:message>
	<hr>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

	<form:form action="kartAction" modelAttribute="prd" method="post"
		cssClass="form">
		<form:label path="prdId" cssClass="label"><spring:message code="prd.id"/> </form:label>
		<form:input path="prdId" cssClass="input" />
		<form:errors path="prdId" />
		
		<br>

		<form:label path="prdName" cssClass="label"> <spring:message code="prd.name"/></form:label>
		<form:input path="prdName" cssClass="input" />
		<form:errors path="prdName" />
		<br>

		<form:label path="prdCost" cssClass="label"> <spring:message code="prd.cost"/> </form:label>
		<form:input path="prdCost" cssClass="input" />
		<form:errors path="prdCost" />
		<br>

		<form:label path="prdLocation" cssClass="label"><spring:message code="prd.location"/></form:label>
		<form:input path="prdLocation" cssClass="input" />
		<form:errors path="prdLocation" />
		<br>
		<br>

		<input type="submit" value="Add Product" name="operation">
	
		<input type="submit" value="Remove Product" name="operation">
		<br>
		<input type="submit" value="Search Product" name="operation">
		<input type="submit" value="Show All Product" name="operation">
		<br>
		<input type="submit" value="Update Product" name="operation">


		<input type="reset" value="Cancle">

	</form:form>

</body>
</html>