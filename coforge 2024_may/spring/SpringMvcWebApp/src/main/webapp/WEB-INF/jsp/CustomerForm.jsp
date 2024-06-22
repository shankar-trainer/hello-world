<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  .mylabel{
     width:110pt;
     float: left;
  }
  .error{
     color:red;
     border: red;
  }
  .myform{
    width:30%;
    border:solid;
    margin-left:300pt;
    margin-top:100pt;
    padding: 20pt;
  }
</style>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ page isELIgnored="false" %>
	<form:form action="customerAction" modelAttribute="customer"
		method="post" cssClass="myform">

		<div>
			<form:label path="id" cssClass="mylabel" >Enter Id</form:label>
			<form:input path="id"  cssStyle="width:110pt"   />
			<form:errors path="id" cssClass="error" ></form:errors>
		</div>

		<div>
			<form:label path="name" cssClass="mylabel">Enter Name</form:label>
			<form:input path="name" cssStyle="width:110pt" />
			<form:errors path="name" cssClass="error"></form:errors>
		</div>

		<div>
			<form:label path="salary" cssClass="mylabel">Enter Salary</form:label>
			<form:input path="salary" cssStyle="width:110pt" />
			<form:errors path="salary" cssClass="error"></form:errors>
		</div>

		<div>
			<form:label path="pass" cssClass="mylabel">Enter Password</form:label>
			<form:password path="pass" cssStyle="width:110pt" />
			<form:errors path="pass" cssClass="error"></form:errors>
		</div>

		<div>
			<form:label path="gender" cssClass="mylabel">Select Gender</form:label>
			<form:radiobuttons path="gender" items="${gender}" />
			<form:errors path="gender" cssClass="error"></form:errors>
		</div>

		<div>
			<form:label path="hobbies" cssClass="mylabel">Select Hobbies</form:label>
			<form:checkboxes path="hobbies" items="${hobbies}" />
			<form:errors path="hobbies" cssClass="error"></form:errors>
		</div>
		<div>
			<form:label path="cities" cssClass="mylabel">Select Cities</form:label>
			<form:select path="cities" items="${cities}" />
			<form:errors path="cities" cssClass="error"></form:errors>
		</div>


		<div>
			<input type="submit"> <input type="reset">
		</div>

	</form:form>

</body>
</html>