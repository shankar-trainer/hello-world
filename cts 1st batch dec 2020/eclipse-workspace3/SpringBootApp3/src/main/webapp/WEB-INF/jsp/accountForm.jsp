<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
<style>
    @import url("css/style1.css");   
</style>
</head>

<f:form action="actProcess" modelAttribute="account" method="get">
<h1>Account Form</h1>
	<label>Enter Account No </label>
	<f:input path="actId"  />
	<f:errors path="actId" cssClass="err1"></f:errors>

	<br>
	<label>Enter Account Holder Name </label>
	<f:input path="actHolderName" />
	<f:errors path="actHolderName" cssClass="err1"></f:errors>

	<br>
	<label>Enter Account Balance </label>
	<f:input path="actBalance" />
	<f:errors path="actBalance" cssClass="err1"></f:errors>
	
	<br><br>
	<label>Select Gender </label>
	<f:errors path="gender"  cssClass="err1"></f:errors>
	<br>
	<br>
	<f:radiobuttons path="gender" items="${gndr}" delimiter="<br>" />
	<br>
	<br>
	
	<label>Select Hobbies </label>
	<f:errors path="hobbies"  cssClass="err1"></f:errors>
	
	<br>
	<f:checkboxes path="hobbies" items="${myhobby}" delimiter="<br>" />
	<br>


	<input type="submit" value="Login">
	<input type="reset" value="Cancel">

</f:form>

<body>

</body>
</head>
</html>




