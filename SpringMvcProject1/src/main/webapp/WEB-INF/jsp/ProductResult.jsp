<%@page import="com.cts.model.Product"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%   
String msg= (String) request.getAttribute("message");

if(msg.equals("product added") || msg.equals("product already present")){
	out.print(msg);
}
else if(msg.equals("All Products")){
	out.print(msg);
	HashMap<Integer, Product> productList=(HashMap)  request.getAttribute("productList");
   for(Integer k:productList.keySet()){
	   Product p=productList.get(k);
	   out.println("<br>"+p.getPrdId()+"  "+p.getPrdName()+"  "+p.getPrdCost());
   }
	    
	//HashMap<Integer, Product> productList
}

%>
</body>
</html>