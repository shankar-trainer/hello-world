<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="width: 100%">

		<div>
			<tiles:insertAttribute name="header">
			</tiles:insertAttribute>
		</div>
		
		<div>
			<tiles:insertAttribute name="body">
			</tiles:insertAttribute>
		</div>
		
		<div>
			<tiles:insertAttribute name="footer">
			</tiles:insertAttribute>
		</div>
	</div>

</body>
</html>