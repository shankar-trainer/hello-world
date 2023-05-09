<html>
<head>
<style>
@import url("../../css/customer.css")
</style>
<style>
.style1 
{
color:'red';
font-size:20px;

}
</style>
</head>


<body>
<%@page isErrorPage="true"%>
<div class="style1">
 Error is <%=exception.getMessage()%>
</div>
</body>

</html>
