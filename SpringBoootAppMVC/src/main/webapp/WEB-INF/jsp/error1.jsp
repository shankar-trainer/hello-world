<html>
<head>
<style>
@import url("../../css/customer.css")
</style>
<style>
.style1 
{
color:yellow;
background:blue;
font-size:20px;
font-weight:bold;
 height:100px;
}
</style>
</head>


<body>
<%@page isErrorPage="true"%>
<div class="style1">
 Problem is  : <%=exception.getMessage()%>
</div>
</body>

</html>
