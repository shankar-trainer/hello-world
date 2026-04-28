To use JAXB in a Maven project, especially with Java 11 or higher where it is no longer bundled in the JDK, you must include both the API and a Runtime implementation in your pom.xml. 

1. Maven Dependencies
For modern projects (Jakarta EE 9+), use the jakarta.xml.bind group. 

xml
<dependencies>
    <!-- JAXB API -->
    <dependency>
        <groupId>jakarta.xml.bind</groupId>
        <artifactId>jakarta.xml.bind-api</artifactId>
        <version>4.0.0</version>
    </dependency>

    <!-- JAXB Runtime (Implementation) -->
    <dependency>
        <groupId>org.glassfish.jaxb</groupId>
        <artifactId>jaxb-runtime</artifactId>
        <version>4.0.0</version>
    </dependency>
</dependencies>

2. Example Java Class (POJO)
Annotate your class with @XmlRootElement to mark it as the top-level XML element. 

java
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
    private String name;
    private int age;

    // No-arg constructor required by JAXB
    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
3. Marshalling (Java to XML)
Use JAXBContext to convert an object into an XML file or string. 
YouTube
YouTube
 +1
java
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        User user = new User("John Doe", 30);

        JAXBContext context = JAXBContext.newInstance(User.class);
        Marshaller mar = context.createMarshaller();
        
        // Pretty print the XML
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        
        // Write to System.out or a File
        mar.marshal(user, new File("user.xml"));
        mar.marshal(user, System.out);
    }
}
4. Unmarshalling (XML to Java) 
Convert an XML file back into a Java object. 

java
import jakarta.xml.bind.Unmarshaller;

Unmarshaller unmarshaller = context.createUnmarshaller();
User userFromFile = (User) unmarshaller.unmarshal(new File("user.xml"));
System.out.println(userFromFile.getName());
Key Tools & Resources
Automated Code Generation: Use the JAXB2 Maven Plugin to generate Java classes directly from an XSD schema.
Reference Implementation: More details on the current runtime can be found on the Eclipse Project for JAXB page. 
