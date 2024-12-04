<h1>User Form</h1>
<%@ page import="com.coforge.model.Product"%>
<%@ page import="java.util.List"%>
<%@ page import="com.coforge.dao.ProductDaoImpl"%>
<%@ page import="com.coforge.dao.ProductDao"%>
<%@ page import="org.springframework.beans.factory.annotation.Autowired"%>

<%!

<%
List<Product> list=(List<Product>)   request.getAttribute("list");

for(Product p)
 out.println(p)

%>