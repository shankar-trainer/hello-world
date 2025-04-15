in application.properties 
spring.profiles.active=production

or 

mvn spring-boot:run -Dspring-boot.run.profiles={profile_name}


in gradle using command
gradlew clean build
then
gradlew clean bootRun -Dspring.profiles.active=local 

