

create application.properties and push in
https://github.com/shankar-trainer/mvn1

application.properties below content 


spring.application.name=product

# MySQL Database Connection
spring.datasource.url=jdbc:mysql://localhost:3306/db3
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA and Hibernate Settings
#spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

server.port=8080

eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/


============================================================================

in configserver resources\application.properties

add 

server.port=8082
spring.cloud.config.server.git.uri=https://github.com/shankar-trainer/mvn1
spring.application.name=config-server
spring.cloud.config.server.git.skip-ssl-validation = true


