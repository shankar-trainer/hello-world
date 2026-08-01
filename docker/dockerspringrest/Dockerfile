FROM maven:3.9-eclipse-temurin-21 AS build
COPY  . /app1
WORKDIR /app1
RUN    mvn -f /app1/pom.xml  clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app1/target/app1.jar"]
