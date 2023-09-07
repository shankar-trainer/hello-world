<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("css/style1.css");
</style>
</head>
<body>

	<form action="FoodController.jsp">
		<div>
			<label>Enter Id</label> <input name="id">
		</div>

		<div>
			<label>Enter Name</label> <input name="name">
		</div>
		<div style="margin-top: 20px;">
			<label>Select Food Type </label> <br> <select name="ftype" style="margin-top:10px;">
				<option value="south">South Indian
				<option value="north">North Indian
			</select>

		</div>
		<div style="margin-top: 20px;">
			<input type="submit"> <input type="reset">
		</div>
	</form>


</body>
</html>

<%-- 
                                                                          NorthIndianFood.jsp
                                                                         /
                 FoodOrder.jsp----->  FoodController.jsp--->check type      
                                                                         \
                                                                         SouthIndianFood.jsp 
                                                                           
                                                                         --%>