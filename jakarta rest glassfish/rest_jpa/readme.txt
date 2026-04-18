start server by glassfish\bin 
 asadmin start-domain domain1
 
localhost:4848
JDBC Connection Pool Properties

Pool Name:mysql1

Additional Properties (8)

url jdbc:mysql://localhost:3306/db2

password root
databaseName db2

user root

portNumber 3306

serverName localhost

useSSL false

allowPublicKeyRetrieval false

===============
JDBC Resource

JNDI Name:
jdbc/mysqldatasource
Pool Name:
mysql1

copy mysql-connector.jar glassfish/domains/domain1/lib/ext
create war by maven package

Applications
deploy

postman
add record
post
http://localhost:8080/rest2/api/books
get
http://localhost:8080/rest2/api/books

While Hibernate's native property hibernate.hbm2ddl.auto supports update, the Jakarta/JPA standard property only recognizes a specific set of actions. If you use update with the standard Jakarta property, most persistence providers will either ignore it or default to none, resulting in no tables being created.

1.The Standard Jakarta OptionsThe JPA specification only defines these four values for jakarta.persistence.schema-generation.database.action:

Value	Behavior
none	No schema generation occurs.
create	Creates the database objects (tables, etc.). It may fail if they already exist.
drop-and-create	Drops existing objects and then creates new ones.
drop	Drops the database objects.


==============================
Developing a JAX-RS RESTful service with GlassFish 8 (Jakarta EE 10+) using JPA (EclipseLink) and MySQL 8 requires configuring a JDBC connection pool and resource, adding the MySQL driver to the GlassFish domain, and setting up persistence.xml. GlassFish 8 uses jakarta.* namespaces rather than javax.*.
1. Prerequisites
GlassFish 8
MySQL Server 8.x
MySQL JDBC Driver (Connector/J) 
2. Configure GlassFish for MySQL 
JDBC Driver: Download the MySQL Connector/J driver and copy the JAR file into the glassfish/domains/domain1/lib/ext folder.
Restart: Restart the GlassFish server to load the driver.
Connection Pool: Use the admin console (usually http://localhost:4848) or asadmin command:
bash
asadmin create-jdbc-connection-pool --datasourceclassname com.mysql.cj.jdbc.MysqlDataSource --restype javax.sql.DataSource --property user=root:password=password:serverName=localhost:portNumber=3306:databaseName=yourdb:useSSL=false MySQL8Pool
JDBC Resource: Create the JNDI name:
bash
asadmin create-jdbc-resource --connectionpoolid MySQL8Pool jdbc/MySQL8App
 
Stack Overflow
Stack Overflow
 +4
3. JPA Configuration (persistence.xml) 
Create src/main/resources/META-INF/persistence.xml to define the persistence unit:
xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="3.0" xmlns="https://jakarta.ee/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence https://jakarta.ee/xml/ns/persistence/persistence_3_0.xsd">
    <persistence-unit name="myPersistenceUnit" transaction-type="JTA">
        <jta-data-source>jdbc/MySQL8App</jta-data-source>
        <properties>
            <!-- Automatically create tables for MySQL 8 -->
            <property name="jakarta.persistence.schema-generation.database.action" value="create"/>
            <property name="eclipselink.logging.level" value="FINE"/>
        </properties>
    </persistence-unit>
</persistence>
4. Implementation Example
Entity:
java
@Entity
public class User implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    // Getters and Setters
}
JAX-RS Resource:
java
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
    @PersistenceContext(unitName = "myPersistenceUnit")
    private EntityManager em;

    @GET
    @Path("/{id}")
    public User getUser(@PathParam("id") Long id) {
        return em.find(User.class, id);
    }
}
5. Deployment
Build the application as a WAR file and deploy it to GlassFish 8 via the console or asadmin deploy. The JPA provider (EclipseLink) will use the connection pool configured in GlassFish to communicate with MySQL. 
Eclipse GlassFish
Eclipse GlassFish
 +4
Note: Ensure you are using jakarta.* annotations and libraries for Jakarta EE 10 compliance in GlassFish 8. 

=========================================================

jaxrs with glassfish 8 using jpa with mysql without database configuration

To use JAX-RS with GlassFish 8 and JPA/MySQL without manual database configuration, define a persistence.xml that uses RESOURCE_LOCAL with Hibernate or EclipseLink properties to auto-generate tables, and add the MySQL Connector JAR to glassfish/domains/domain1/lib. Define your API via JAX-RS annotated classes and use @PersistenceContext for CRUD operations. 

Key Components for No-Config Setup
JDBC Driver: Place mysql-connector-java-x.x.x.jar into the glassfish/domains/domain1/lib/ folder to make it available to the server.
persistence.xml (Auto-DDL): Set up the persistence unit to handle database creation automatically. 


xml
<persistence-unit name="MyPU" transaction-type="RESOURCE_LOCAL">
    <provider>org.eclipse.persistence.jpa.PersistenceProvider</provider>
    <properties>
        <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
        <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/your_db?createDatabaseIfNotExist=true"/>
        <property name="javax.persistence.jdbc.user" value="root"/>
        <property name="javax.persistence.jdbc.password" value="password"/>
        <property name="eclipselink.ddl-generation" value="create-tables"/>
        <property name="eclipselink.ddl-generation.output-mode" value="database"/>
    </properties>
</persistence-unit>
Steps to Implement 
Create MySQL Schema: Create the database manually (CREATE DATABASE dbname;), but let JPA handle table creation.
Define JPA Entity:
java
@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    // getters/setters
}
Create JAX-RS Endpoint:
java
@Path("/items")
public class ItemResource {
    @PersistenceContext(unitName = "MyPU")
    EntityManager em;

    @POST
    @Transactional
    public void create(Item item) {
        em.persist(item);
    }
}
Run: Deploy the WAR file to GlassFish 8. JPA will generate the tables upon first access. 
Packt
Packt
 +1
This approach utilizes JPA's provider-specific properties to handle table generation, bypassing manual SQL scripts or GlassFish JDBC connection pool configuration, notes. For a more production-ready approach, see Oracle's tutorial. 
==================================

To create a JAX-RS CRUD application on GlassFish with MySQL without using the server's internal JNDI or Connection Pool configuration, you must manage the database connection directly within your application code using the MySQL Connector/J driver.
1. Add MySQL Maven Dependency 
Since you are bypassing GlassFish's server-side configuration, you must include the MySQL driver in your project's pom.xml. 


<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>

2. Create a Database Connection Class 
Implement a utility class to establish a direct JDBC connection using DriverManager. This replaces the need for a JNDI lookup in the GlassFish console. 

public class DBConnection {
    public static Connection getConnection() throws Exception {
        // Load the driver explicitly if needed for older versions
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/your_database";
        return DriverManager.getConnection(url, "username", "password");
    }
}

3. Implement the CRUD Resource 
Define your JAX-RS endpoints using standard annotations like @GET, @POST, @PUT, and @DELETE. Each method will call the DBConnection to perform SQL operations. 


Create (POST): Use a PreparedStatement to insert data.
Read (GET): Retrieve results from a ResultSet and convert them to POJOs or JSON.
Update (PUT): Execute an UPDATE SQL statement based on a unique ID.
Delete (DELETE): Execute a DELETE SQL statement. 

java
@Path("/items")
public class ItemResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> getAllItems() throws Exception {
        List<Item> items = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM items")) {
            while (rs.next()) {
                items.add(new Item(rs.getInt("id"), rs.getString("name")));
            }
        }
        return items;
    }
}
4. Deploy to GlassFish
Package as WAR: Build your project into a .war file.
Deploy: Upload the WAR file through the GlassFish Administration Console or use the asadmin command.
No Server Config: You do not need to create a "JDBC Connection Pool" or "JDBC Resource" in the GlassFish Admin UI, as your code handles the connection string directly. 
Eclipse GlassFish
Eclipse GlassFish
 +4
Important: For production use, managing connections manually (as shown above) can lead to resource leaks if not handled carefully with try-with-resources. For better performance without JNDI, consider embedding a standalone pool like HikariCP directly in your application. 
