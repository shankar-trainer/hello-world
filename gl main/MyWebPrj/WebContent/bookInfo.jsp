<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Isbn  is  ${param.id}
<br>
 
Book name   is  ${param.name}
<br>
Cities are <br>

  <%  
  String city1[]=  request.getParameterValues("city");
    for(String c:city1)
    	 out.print("    "+c+"<br>");
  %>
  <br>
City1    is  ${paramValues.city[0]}<br>
City2    is  ${paramValues.city[1]}
<br>
<%  

session.setAttribute("fruit", "apple");
request.setAttribute("fruit", "orange");

request.setAttribute("name", "ram kumar");
application.setAttribute("country", "india");

Cookie cookie1=new Cookie("salary1","10000");
response.addCookie(cookie1);

%>
<%  
   Cookie cookie2[]= request.getCookies();
    for(Cookie cookie3:cookie2)
      out.print(cookie3.getName()+"   "+cookie3.getValue());
%>
<br>
Salary is ${cookie.salary1.value}<br>

Fruit is ${fruit}<br>
Fruit is ${sessionScope.fruit}<br>

Name is ${name}<br>
Country is ${country}<br>
 
</body>
</html>