<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Id ${account.actId}<br>
Name ${account.actName}<br>
Balance ${account.actBalance}<br>
Creation Date ${account.actCreationDate}<br>

<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

Creation Date (dd-mm-yyyy)<fmt:formatDate value="${account.actCreationDate}" pattern="dd-MM-yyyy"/>
<br>

Creation Date (MM-dd-yyyy)<fmt:formatDate value="${account.actCreationDate}" pattern="MM-dd-yyyy"/>
<br>

Creation Date (yyyy-dd-MM)<fmt:formatDate value="${account.actCreationDate}" pattern="yyyy-dd-MM"/>
<br>

Creation Date (dd-MM-yyyy hh:mm)<fmt:formatDate value="${account.actCreationDate}" pattern="dd-MM-yyyy hh:mm"/>
<br>






<%-- dob ${account.dob}<br>
 --%>
</body>
</html>