http://localhost:8080/rest5_jpa/api/users

A JAX-RS CRUD application on Tomcat 10 uses Jakarta EE namespaces (jakarta.ws.rs) rather than javax. Implement CRUD using Jersey (JAX-RS), Maven, and JDBC to connect to MySQL. Key steps involve mapping URL paths using @Path, setting JSON formats with MediaType.APPLICATION_JSON, and implementing HTTP methods (@GET, @POST, @PUT, @DELETE).

Core Components for JAX-RS on Tomcat 10
Namespace: Update imports to jakarta.ws.rs.* for Tomcat 10 compatibility.
JSON Support: Add jersey-media-json-binding or jersey-media-json-jackson to your pom.xml.
Database: Use JDBC for CRUD. Use JNDI DataSources for cleaner connection management in Tomcat.

1. Project Dependencies (pom.xml)
Use the Jakarta EE API and Jersey dependencies:
xml
<dependencies>
    <!-- JAX-RS API -->
    <dependency>
        <groupId>jakarta.ws.rs</groupId>
        <artifactId>jakarta.ws.rs-api</artifactId>
        <version>3.1.0</version>
        <scope>provided</scope>
    </dependency>
    <!-- Jersey Servlet Container -->
    <dependency>
        <groupId>org.glassfish.jersey.containers</groupId>
        <artifactId>jersey-container-servlet</artifactId>
        <version>3.1.0</version>
    </dependency>
    <!-- JSON Binding -->
    <dependency>
        <groupId>org.glassfish.jersey.media</groupId>
        <artifactId>jersey-media-json-binding</artifactId>
        <version>3.1.0</version>
    </dependency>
    <!-- MySQL Connector -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.33</version>
    </dependency>
</dependencies>
2. Entity Class (POJO)
java
public class User {
    private int id;
    private String name;
    // Getters, Setters, Constructor
}
3. Resource Class (REST Endpoints)
java
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
public class UserResource {
    // Inject DAO/Service here

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers() {
        // Read: returns list of users
        return new ArrayList<>();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(User user) {
        // Create: Insert into MySQL
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUser(@PathParam("id") int id, User user) {
        // Update: Update MySQL record
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteUser(@PathParam("id") int id) {
        // Delete: Remove from MySQL
        return Response.noContent().build();
    }
}
4. Configuration (web.xml)
Register the Jersey Servlet.
xml
<servlet>
    <servlet-name>JerseyServlet</servlet-name>
    <servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>
    <init-param>
        <param-name>jersey.config.server.provider.packages</param-name>
        <param-value>com.example.rest</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
</servlet>
<servlet-mapping>
    <servlet-name>JerseyServlet</servlet-name>
    <url-pattern>/api/*</url-pattern>
</servlet-mapping>
5. MySQL Connection Setup
For robust applications, [set up a JNDI Datas)
=====================================================