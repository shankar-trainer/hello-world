<%@ page import="com.cognizant.model.Employee" %>
<%@ page import="java.util.List" %>

<%
String submit=request.getAttribute("submit").toString();

if(submit.equals("Add Employee")){
	out.println("<h2>"+submit+"</h2>");
	out.println("<b>"+request.getAttribute("result")+"</b>");
}
else if(submit.equals("ShowAll Employee")){

List<Employee> list1=(List<Employee>)request.getAttribute("list");
  out.println("<table bgcolor='aqua' width='40%' border='4'>");
  out.println("<tr><th>Id</th><th>Name</th><th>Salary</th></tr>");
   
   for(Employee e:list1){
	   out.println("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>");
	   
   }
  out.println("</table>");

}
else if(submit.equals("Search Employee")){
	
Employee e=(Employee)	request.getAttribute("employee");
  if(e==null)
	  out.println("employee not found");
  else 
	  out.println("employee found<br>"+e.getId()+"  "+e.getName()+"  "+e.getSalary());

}

%>
