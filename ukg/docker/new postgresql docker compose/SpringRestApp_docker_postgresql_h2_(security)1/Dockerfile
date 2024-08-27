FROM  maven:3.8.3-openjdk-17 AS build
COPY . /home/app1
WORKDIR  /home/app1
RUN mvn -f /home/app1/pom.xml clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/home/app1/target/app1.jar"]

