<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/tags/struts-html"  prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page isErrorPage="true" %>
<html:errors></html:errors>
<%@taglib uri="/tags/struts-bean"  prefix="bean"%>

<div style="border:10px blue solid;marginb-left:300px;width:30%;padding:20px;color:red;">
<h2><bean:message key="user.err2" name="uform"/></h2>

<%-- <%=exception.getMessage() %> --%>
</div>

</body>
</html>