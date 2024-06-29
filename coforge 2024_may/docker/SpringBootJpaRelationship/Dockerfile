FROM maven:3.8.3-openjdk-17 AS build
#working above
#FROM maven
#FROM openjdk

COPY . /home/app/
WORKDIR /home/app
RUN mvn -f /home/app/pom.xml clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/home/app/target/app1.jar"]

#docker build -t jpa1 .
#docker run -p 7070:7070 jpa1   -- this will run internal port 7070 to outer 7070

#docker run -p 8080:7070 jpa1 -- this will run internal port 7070 to outer 7070

#docker system prune  -- delete all images  Remove unused data
#This will remove:all stopped containers,all networks not used by at least one container, all dangling images,unused build cache
# -a, --all		Remove all unused images not just dangling ones


