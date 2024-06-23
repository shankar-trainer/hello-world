<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="/tags/struts-bean"  prefix="bean"%>

<div style="border:1px;marginb-left:300px;width:30%;padding:20px">
 Id is <bean:write name="uform" property="id"  /><br>
 Name is <bean:write name="uform" property="name"  /><br>
 Salary is <bean:write name="uform" property="salary"  /><br>
 
 Gross Salary <%=request.getAttribute("gsalary") %><br>

</div>

</body>
</html>