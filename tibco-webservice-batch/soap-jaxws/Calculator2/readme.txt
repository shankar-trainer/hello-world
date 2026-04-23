https://www.codejava.net/java-ee/web-services/how-to-code-and-deploy-java-xml-web-services-jax-ws-on-tomcat
https://medium.com/@dharshithasrimal/create-a-soap-web-service-a-step-by-step-tutorial-7b16a0ff8bf4

Deploying JAX-WS (Java API for XML Web Services) on Apache Tomcat requires a JAX-WS Reference Implementation (RI), such as Metro or Apache CXF, because Tomcat is a servlet container and does not include a JAX-WS engine by default. 
1. Project Dependencies (Maven)
To run JAX-WS on Tomcat, you must include the JAX-WS runtime in your project. Add the following to your pom.xml: 
xml
<dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-rt</artifactId>
    <version>2.3.2</version>
</dependency>
According to CodeJava, this dependency downloads the JAR files required for a servlet environment.
2. Create the Web Service Class
Define your service using the @WebService annotation. 
java
package com.example.ws;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorld {
    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
3. Configure sun-jaxws.xml 
This file is a proprietary JAX-WS RI deployment descriptor. Create it in your WEB-INF folder to map the service implementation to a URL pattern. 
xml
<?xml version="1.0" encoding="UTF-8"?>
<endpoints xmlns="http://java.sun.com/xml/ns/jax-ws/ri/runtime" version="2.0">
    <endpoint
        name="HelloWorldWS"
        implementation="com.example.ws.HelloWorld"
        url-pattern="/hello"/>
</endpoints>
As noted by Mkyong, this file defines how the JAX-WS runtime should initialize the endpoint.
4. Configure web.xml 
You must register the WSServletContextListener to initialize the JAX-WS environment and the WSServlet to handle incoming requests. 
xml
<web-app xmlns="http://jcp.org" version="3.1">
    <listener>
        <listener-class>com.sun.xml.ws.transport.http.servlet.WSServletContextListener</listener-class>
    </listener>
    <servlet>
        <servlet-name>HelloWorld</servlet-name>
        <servlet-class>com.sun.xml.ws.transport.http.servlet.WSServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>HelloWorld</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>
</web-app>
5. Deployment and Testing
Build the WAR: Package your application into a .war file (e.g., using mvn package).
Deploy: Copy the WAR file to the webapps directory of your Apache Tomcat installation.
Verify: Start Tomcat and access the WSDL file in your browser at:
http://localhost:8080/YourProjectName/hello?wsdl 
Alternative: Apache TomEE
If you want to avoid manual configuration of sun-jaxws.xml, consider using Apache TomEE, a Java EE-compliant version of Tomcat that supports JAX-WS out of the box with just the @WebService annotation. 
