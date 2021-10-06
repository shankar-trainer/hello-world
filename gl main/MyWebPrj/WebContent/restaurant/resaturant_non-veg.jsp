<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
@IMPORT url("style/style1.css");
</style>
</head>
<body>
<h1>Non Veg Items </h1>
<h2>Country <%=request.getAttribute("country")%></h2>
<label>Welcome Mr.</label>
<%=request.getParameter("name")%>
<br>
<label>Your id </label>
<%=request.getParameter("id")%>

<br>

  <center><input  type='button'  value="back" onclick="javascript:history.back()"></center>



</body>
</html>