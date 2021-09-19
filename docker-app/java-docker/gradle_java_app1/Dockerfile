FROM gradle:6.8.0-jdk11-hotspot

#FROM gradle:4.7.0-jdk8-alpine AS build
#FROM arm64v8/gradle:6.8.2-jdk11  AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
#RUN gradle run --no-daemon 
CMD gradle run --no-daemon 

