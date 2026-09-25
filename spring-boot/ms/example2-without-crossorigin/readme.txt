http://localhost:8086/client
http://localhost:9056/client


The reason your request to localhost:9056/client is failing when you switch to lb://USER-SERVICE is that the Spring Cloud LoadBalancer cannot resolve what USER-SERVICE actually points to.

When you use the lb:// scheme, the gateway looks up USER-SERVICE inside a Service Discovery client (like Netflix Eureka, Consul, or Kubernetes Discovery). If you haven't registered USER-SERVICE with a discovery server or provided a static list of instances, the load balancer fails to find an address, resulting in a routing failure (typically a 503 error).
GitHub
+ 1

Depending on your setup, choose one of the following solutions to fix it:

Solution 1: Use Static Instances (No Eureka / Service Discovery)
If you are running everything locally and do not use a service registry like Eureka, but still want to use the lb:// scheme syntax, you can manually define instances for your service in your application.yml using Spring's SimpleDiscoveryClient:

YAML
spring:
  application:
    name: api-gateway
  cloud:
    discovery:
      client:
        simple:
          instances:
            user-service:
              - uri: http://localhost:8086   # The actual host and port of your user-service
    gateway:
      server:
        webmvc:
          routes:
            - id: user-service
              uri: lb://USER-SERVICE
              predicates:
                - Path=/client/**

server:
  port: 9056
Solution 2: Revert to Direct URL (If testing standalone)
If user-service is just a single local app running on port 8086 and you aren't using a service discovery registry, you don't need the load balancer (lb://) scheme. Change it straight back to a standard HTTP URI:

YAML
spring:
  application:
    name: api-gateway
  cloud:
    gateway:
      server:
        webmvc:
          routes:
            - id: user-service
              uri: http://localhost:8086   # Direct routing without load balancing
              predicates:
                - Path=/client/**

server:
  port: 9056
(Note: If you use direct http:// routing, make sure your user-service is actively running on port 8086).

Solution 3: Integrate a Service Discovery Client (Eureka)
If you intend to use multiple instances of USER-SERVICE dynamically load-balanced, you need to connect your gateway and your user service to a service registry like Eureka:

Add the Eureka Client dependency to your pom.xml / build.gradle:

XML
<!-- Maven Example -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
Ensure both your api-gateway and user-service are registered to a running Eureka Server instance.