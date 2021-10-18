
#FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#./gradlew build && java -jar build/libs/gs-spring-boot-docker-0.1.0.jar

#--------------
#FROM gradle:jdk13 AS appbuild

FROM gradle:6.8.0-jdk11-hotspot as build

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon 


FROM  adoptopenjdk/openjdk11

EXPOSE 8080

RUN mkdir /app
COPY --from=build "/home/gradle/src/build/libs/*.jar"   "/app/app.jar"

ENTRYPOINT ["java","-jar","/app/app.jar"]
