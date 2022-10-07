<%@page import="abc.com.bean.Student"%>
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
/* Student  student=new Student();
int roll=Integer.parseInt(request.getParameter("roll"));
String name=request.getParameter("name");
float marks  =Float.parseFloat(request.getParameter("marks"));

student.setRoll(roll);
student.setName(name);
student.setMarks(marks);
session.setAttribute("student",student)
 */
%>
<hr>
<jsp:useBean id="student" class="abc.com.bean.Student" scope="session">

 <jsp:setProperty name="student" property="roll"/>
 <jsp:setProperty name="student" property="name"/>
 <jsp:setProperty name="student" property="marks"/>
 
</jsp:useBean> 
<br>

<a href='studentDetail.jsp'>Student Details</a>


</body>
</html>