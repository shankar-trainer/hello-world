<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="/WEB-INF/name.tld" prefix="u"
 %>
 <form>
   Enter Name<input name="name">
   <br>
   <input type="submit">
 </form>
 
  <u:upper name="${param.name}"></u:upper><br>
  
 <u:upper name="shyam kumar"></u:upper>
</body>
</html>