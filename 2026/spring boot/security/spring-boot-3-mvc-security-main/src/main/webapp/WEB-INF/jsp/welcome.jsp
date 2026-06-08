<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
	<title>A Java Spring Boot 3 MVC JSP JPA</title>
	
	
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
	<style>
		.header-text {Color: Green; font-family: Verdana, sans-serif; font-size: 14pt}
		.body-content{ font-family: Verdana, sans-serif}
	</style>

</head>
<body>

	
	<jsp:include page="header_menu.jsp" />
	
	
	<div class="container"  style="margin-left: 5pt">
	<div class="body-content">

	<br>
	<div class="header-text" >${welcomemessage}</div>
	
	
	<div class="body-text" >${memorymessage}</div>
	<br>

	
	This Web application use Spring Security for protecting the endpoints, and that means
	some of the pages/views are protected by a Login Form!
	<br>
	Take a look at the Web application by using the menu item "Show persons" or
	by using the link <a href="/demo/mvclistpersons" target="_top">here</a>
	<br>
	
	<br>

	<b>Note:</b> The Web applications 1-2 minutes initial load time is because I am using
	a <br><i>Free App Service Plan at Microsoft Azure</i><br> 
	because the work is for demonstration and testing purposes only!
	
	<br>
	<br>
	This Java Spring Boot MVC Web application was made by the following technology:
	<br><br>

	<ul>
    <li>Updated: 09-02-2025</li>
	<li>Java 17</li>
	<li>Spring Boot 3</li>
	<li>Visual Studio Code with the Microsoft Java Extension Pack</li>	
	<li>Microsoft Azure App Service with a Free App Service Plan for web hosting</li>
	<li>JVM memory have been set to an alocation of 512 MB both initial and max because of the limited physial memory</li>
	<li>MySQL Database</li>
	<li>Datasource is the default Hikari</li>
	<li>DevTools with Hot Reload</li>
	
	</ul>

	<ul>

		<li>Spring Security for protecting some of the views by a Login</li>	
		<li>Spring Boot Security Bcrypt Encoder for encoding password based on the<br>
		Blowfish cipher that generates a random salt while encoding passwords on a String<br>
		value with a lenght 60. Then the password are not stored in pain text!
	</li>
				
		</ul>

	<ul>
		<li>MVC as well as a Service and JPA Repository layer</li>	
		<li>Maven as build tool</li>	
		<li>Hibernate for initializing the Database and implement JPA</li>
		<li>Hibernate Validator and Apache Commons Validater for server side form validation</li>
		
	</ul>

	<ul>
		<li>JSP for the View part ( GUI )</li>
		<li>Bootstrap for the responsive design</li>
	</ul>
	
</div>

	</div>
</body>
</html>