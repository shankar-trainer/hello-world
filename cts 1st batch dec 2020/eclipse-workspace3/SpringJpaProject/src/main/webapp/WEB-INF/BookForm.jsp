<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
<style>
@import url("css/style1.css");
</style>
</head>
<body>

	<f:form action="bookAction" modelAttribute="book">
		<h1>Book Form</h1>
		<label>Enter ISBN</label>
		<f:input path="isbn" />
		<br>

		<label>Enter Author</label>
		<f:input path="author" />
		<br>

		<label>Enter ISBN</label>
		<f:input path="cost" />
		<input type="submit" name="operation" value="Add Book">
		<input type="submit" name="operation" value="Search Book">
		<br>
		<input type="submit" name="operation" value="Show All Book">
		<input type="submit" name="operation" value="Remove Book">

	</f:form>
</body>
</html>


