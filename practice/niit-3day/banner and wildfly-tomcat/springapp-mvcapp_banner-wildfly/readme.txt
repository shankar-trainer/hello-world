
wildfly-41.0.1.Final

in pom.xml 
	<!-- comment  in case of tomcat and wildfly-->
	<!--
		<dependency>
		    <groupId>org.apache.tomcat</groupId>
		    <artifactId>tomcat-jasper</artifactId>
		    <version>11.0.25</version>
		    <scope>compile</scope>
		</dependency>
   -->



1.Exclude spring-boot-starter-logging:Build configuration.Depending on your build tool, modify your configuration file to exclude the default logging starter:
For Maven (pom.xml):
XML

<dependency>

    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-logging</artifactId>
        </exclusion>
    </exclusions>
</dependency>




Add an explicit exclusion for logback-classic or logback-core wherever it appears, or globally exclude it if using Maven dependency management. 
For example, in Maven:




<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
    <exclusions>
        <exclusion>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
        </exclusion>
        <exclusion>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-to-slf4j</artifactId>
        </exclusion>
    </exclusions>
</dependency>


3.Add a jboss-deployment-structure.xml file (Optional/Recommended):JBoss deployment descriptor.To completely isolate your application from WildFly's conflicting logging modules and force it to use standard behavior, create a file named jboss-deployment-structure.xml inside your project's src/main/webapp/WEB-INF/ folder:XML<jboss-deployment-structure>
    <deployment>
        <exclude-subsystems>
            <subsystem name="logging" />
        </exclude-subsystems>
    </deployment>
</jboss-deployment-structure>'

Verification: Build a fresh WAR file, check that WEB-INF/lib contains zero logging implementation jars, and deploy it again


start wildfly by 
bin/stanalone.sh 

in project 

 mvn clean package 
 
 copy target/test1.war to wildfly/standalone/deplyments 
 
 http://localhost:8080/test1/person/personAction
 
 
