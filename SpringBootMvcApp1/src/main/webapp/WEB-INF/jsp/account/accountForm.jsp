<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style>
@import url("../CSS/style1.css");

</style>

<fieldset>
	<legend> Account Form </legend>

	<form:form modelAttribute="act" method="post" action="accountProcess"
		cssClass="form1">

		<form:label path="name">Enter Name</form:label>
		<form:input path="name" />
		<form:errors path="name" cssClass="error"/>
		<br>

		<form:label path="balance">Enter balance</form:label>
		<form:input path="balance" />
		<form:errors path="balance"  cssClass="error"/>
		<br>

		<form:label path="equityAllocation">Enter Equity Allocation(dd-MM-yyyy)</form:label>
		<form:input path="equityAllocation" />
		<form:errors path="equityAllocation"  cssClass="error" />
		<br>
		<br>
		<br>
		
		<form:label path="accountCreationDate">Account Create Date</form:label>
		<form:input path="accountCreationDate" />
		<form:errors path="accountCreationDate"  cssClass="error" />
		<br>


		<form:label path="location">Enter Location</form:label>
		<form:input path="location" />
		<form:errors path="location" cssClass="error"/>
		<br>
		
		<form:label path="gender">Select Gender</form:label>
		<br>
		
		<form:radiobuttons  path="gender"  items="${gender}"  delimiter="<br>" />
		<form:errors path="gender" cssClass="error"/>
		
		<br><br>
		<form:label path="accountType">Account Type</form:label>
		<br>
		<form:checkboxes items="${accountType}" path="accountType"  delimiter="<br>"/>
		
		<br>
		<br>
		<input type="submit" value="send">
		<input type="reset" value="cancel">

	</form:form>
</fieldset>