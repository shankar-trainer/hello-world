<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page import="com.cts.model.Book"%>
<%@ page import="java.util.List"%>

<html>
<head>
<style>
@import url("/css/style1.css");
</style>
</head>
<body>
	<%
Object operation=request.getAttribute("operation");
if(operation==null)
  System.out.println("operation is null.......................");

if(operation.equals("Add Book")){
   out.println(request.getAttribute("message"));
}
else if(operation.equals("Show All Book")){
   out.println(request.getAttribute("message"));
   List<Book> list1=(List<Book>)request.getAttribute("allBook");

   for(Book b:list1)
      out.println("<br>"+b.getISBN()+"  "+b.getAuthor()+"  "+b.getCost());
}


%>
<hr> 

</body>
</html>


