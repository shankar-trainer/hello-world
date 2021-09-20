#FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#./gradlew build && java -jar build/libs/gs-spring-boot-docker-0.1.0.jar



#--------------
#FROM openjdk:8-jdk-alpine
FROM gradle:6.8.0-jdk11-hotspot
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
#RUN gradle run --no-daemon 
#CMD gradle run --no-daemon 
CMD gradlew build && java -jar build/libs/gs-spring-boot-docker-0.1.0.jar 



ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#./gradlew build && java -jar build/libs/gs-spring-boot-docker-0.1.0.jar
