FROM maven:3.8.5-openjdk-17 AS build
COPY . /app1
WORKDIR /app1
RUN mvn -f /app1/pom.xml clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app1/target/app.jar"]
