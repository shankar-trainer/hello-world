<h1>User Form</h1>
<%@ page import="com.coforge.model.Product"%>
<%@ page import="java.util.List"%>
<%@ page import="com.coforge.dao.ProductDaoImpl"%>
<%@ page import="com.coforge.dao.ProductDao"%>
<%@ page import="org.springframework.beans.factory.annotation.Autowired"%>

<%!
<%--
ProductDao dao=new ProductDaoImpl();
--%>
<%--
@Autowired
ProductDao dao;
%>
<%
List<Product> list1=   dao.getAllProduct();
   list1.forEach(System.out::println);
%>