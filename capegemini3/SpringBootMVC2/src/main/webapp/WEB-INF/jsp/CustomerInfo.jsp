<%@page import="org.slf4j.Logger"%>
<%@page import="java.util.List"%>
<%@page import="com.example.model.Customer"%>

<%
	String operation = (String) request.getAttribute("operation");
	String msg = (String) request.getAttribute("message");
	System.out.println(msg + "..............." + operation);
	if (operation.equals("Add Customer")) {
		out.print(msg);
	} else if (operation.equals("Search Customer")) {
		out.print(msg);
		Customer customer = (Customer) request.getAttribute("customer");
		if (!msg.equals("Customer Not Found")) {
			out.println("<br>Id is " + customer.getId());
			out.println("<br>Name is " + customer.getName());
			out.println("<br>Salary is " + customer.getSalary());
			out.println("<br>Email is " + customer.getEmail());
			out.println("<br>SSN is " + customer.getSsn());
		}
	} else if (operation.equals("ShowAll Customer")) {
		out.print(msg);

		List<Customer> CustomerList = (List<Customer>) request.getAttribute("CustomerList");
		{
			for (Customer cst : CustomerList) {
				out.println("<br>Id is.. " + cst.getId());
				out.println("<br>Name is " + cst.getName());
				out.println("<br>Salary is " + cst.getSalary());
				out.println("<br>Email is " + cst.getEmail());
				out.println("<br>SSN is " + cst.getSsn());
			}
		}
	}
%>



</body>
</html>