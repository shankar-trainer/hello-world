
# spring_boot_3_security_jpa

Spring Boot 3 with Spring Security 6,  JPA and H2-database

Implements both login and logout


How to/what
============

- To build: mvn clean package 
- Run:  mvn spring-boot:run    (java -jar target\spring_boot_3_security_jpa-0.0.1-SNAPSHOT.jar)


Users
--------
http://localhost:8080/admin
userId: alaf
password: password


http://localhost:8080/staff
userId: staff
password: password

http://localhost:8080/greet  -- no authentication is required 


Users are stored in h2-database with start-up. 

In-memory database
----------------------------
http://localhost:8080/h2-console/login.do   (password: password)
