add both  application-dev.properties, application-prod.properties files  to git


create config server

	add dependency 
        
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-config-server</artifactId>
        </dependency>

         <properties>
          <java.version>17</java.version>
          <spring-cloud.version>2023.0.3</spring-cloud.version>
        </properties>


     create application.properties

     spring.cloud.config.server.git.uri=https://github.com/shankar7979/ukg

     #spring.cloud.config.server.git.searchPaths='{application}'
     spring.cloud.config.server.git.searchPaths=https://github.com/shankar7979/ukg

     #spring.application.name=rest application client

     spring.config.name=configserver
     
     add @EnableConfigServer to the Main.java 
     start it , it will run on 8080


then make client app

here it is RestJpaApp1


   add dependency 
         <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>
   
   make application.proprties  add code and enable required profile either prod or dev

	spring.profiles.active=dev
	#spring.profiles.active=prod
	spring.application.name=rest-application-rest1

	#spring.config.import=configserver
	spring.config.import=optional:configserver:http://localhost:8080/
	management.endpoints.web.exposure.include=refresh




