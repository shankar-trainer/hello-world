#
# Build stage
#
FROM maven:3.9.4-amazoncorretto-17 AS build

COPY src /home/app/src
COPY pom.xml /home/app

COPY entrypoint.sh /usr/local/bin/entrypoint.sh
COPY database.sh /usr/local/bin/database.sh

RUN chmod +x /usr/local/bin/entrypoint.sh
RUN chmod +x /usr/local/bin/database.sh

RUN ls -la /usr/local/bin

RUN mvn -f /home/app/pom.xml clean package -DskipTests

#
# Package stage
#
FROM amazoncorretto:17

COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar

RUN ls -la /usr/local/lib

EXPOSE 8082

ENTRYPOINT [ "/bin/bash", "/usr/local/bin/entrypoint.sh" ]
