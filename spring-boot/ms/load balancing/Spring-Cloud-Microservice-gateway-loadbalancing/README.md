# Spring-Cloud-Microservice

https://purbarun.medium.com/routing-and-load-balancing-using-spring-cloud-gateway-bac56b0805eb


http://localhost:8080/product/greet
http://localhost:8080/inventory/greet


http://localhost:49724/product/greet
http://localhost:49686/inventory/greet


http://localhost:8080/product/greet
 hit multiple times , it will show different result below in postman with different port 

Setting server.port=0 in a Spring Boot application tells the framework to scan for an available, random HTTP port at runtime.





















Routing and load balancing using Spring Cloud Gateway
Purbarun Chakrabarti
Purbarun Chakrabarti

Follow
7 min read
·
Apr 21, 2024
10





Spring Cloud Gateway is the API gateway implementation built on Spring framework 5, Project Reactor, and Spring Boot 2.0. It replaces spring-cloud-netflix-zuul which was being used previously. Visit the below link for more details.

Spring Cloud Greenwich.RC1 available now.

There is some other API Gateway implementation which are not based on Spring Cloud like Kong, Tyk, Apigee etc. But this discussion is fully based on open-sourced Spring Cloud Gateway created by the Spring Team.

To read more about the API Gateway, Chapter 5: Implementing Microservice Communication from the below book is a good read.

Building Microservices, 2nd Edition [Book] (oreilly.com)

Spring Cloud Gateway is nonblocking i.e. its written in such a way that the main threads are never blocked. Instead, these threads are always available to serve requests and to process them asynchronously in the background to return a response once processing is done.

Spring Cloud Gateway offers several capabilities as below:

· Mapping the routes for all the services in your application to a single URL

· Building filters that can inspect and act on the requests and responses coming through the gateway.

· Building predicates, which are objects that allow us to check if the requests fulfil a set of given conditions before executing or processing a request.

Spring Cloud Gateway is a reverse proxy. A reverse proxy is an intermediate server that sits between the client trying to reach a resource and the resource itself. The client has no idea it’s even communicating with a server. The reverse proxy takes care of capturing the client’s request and then calls the remote resource on the client’s behalf. Having said that to cut a long story short it acts as a single point of entry for all incoming request to a system which is divided into one or more microservices just like any other API Gateway.

The Gateway can be configured to create routes based on services registered with a DiscoveryClient compatible service registry. To enable this, we need to set the below property in properties file and make sure a DiscoveryClient implementation is on the classpath and enabled (such as Netflix Eureka, Consul or Zookeeper).

spring.cloud.gateway.discovery.locator.enabled=true

Spring Cloud Gateway will now automatically use the Eureka service ID of the service being called and maps it to a downstream service instance.

Routing
Routes can be defined either by Java Config or by configuring them in properties/yaml file. Here we will be using the second approach for simplicity as below since it can be externalized based on requirement.

spring.cloud.gateway.routes[0].id=product-service
spring.cloud.gateway.routes[0].uri=lb://product-service
spring.cloud.gateway.routes[0].predicates[0]=Path=/product/**

spring.cloud.gateway.routes[1].id=inventory-service
spring.cloud.gateway.routes[1].uri=lb://inventory-service
spring.cloud.gateway.routes[1].predicates[0]=Path=/inventory/**
Load Balancing
When there are multiple instance available Spring Cloud Gateway will intelligently load balance the incoming requests among the available instances in the Discovery client.

It internally uses spring-cloud-loadbalancer out of the box to distribute the request traffic. It uses one of the algorithms to do the same, but the internal implementation of the load balancing algorithm is beyond the scope of this discussion, though will discuss how it happens in little more detail in a few minutes after the demo.

Note: This should not be confused with client-side load balancing using spring-cloud-loadbalancer which is needed when the services talk to each other through different synchronous/asynchronous Spring based Rest clients like RestTemplate, WebClient etc. which are not by default load balanced as opposed to the Open Feign by spring cloud. Moreover, client-side load balancing is needed when the request has reached one of the individual services which is not in the case of Spring Cloud Gateway where the request is still in the API Gateway level.

Enough said, now Lets dive into a quick demo to illustrate the same!!

For this demo, we will create two services called product and inventory services with multiple instances and register them to the Netflix Eureka Discovery Server. Once that is done, we create API Gateway server and register the same to Eureka Client also.

All the services are created using the very latest versions of Spring Boot 3.2.4 and Spring Cloud 2023.0.0.

Once all Services are up and running, we can see the below Eureka Dashboard where we can see multiple (2) instances of each service.

Press enter or click to view image in full size
Eureka Dashboard with all registered services running on port 8761
Now let's dive into the individual services. To show the routing and load balancing functionalities of Spring Cloud Gateway we have kept the business logic as minimum as possible.

Get Purbarun Chakrabarti’s stories in your inbox
Join Medium for free to get updates from this writer.

Enter your email
Subscribe
We created a /greet endpoint which is a Http GET request in each service. To show the load balancing feature we send the below fields in the response body:

greeting- A simple hardcoded greeting message
instanceid- Actual instance id that is registered with Eureka Server
port- Actual Port No. of the instance (created dynamically by Spring Boot Embedded Tomcat)
url- Full URL of the endpoint
But among all the most important is the port since it is the one which will help identifying the load balancing functionality. To get the value we add the below snippet to the controller layer as given below:

@Value("${spring.application.name}")
private String appName;

// Only work if the discovery client is Eureka
private EurekaClient eurekaClient;

// Wiring the Eureka Client
public ProductController(EurekaClient eurekaClient) {
this.eurekaClient = eurekaClient;
}

@GetMapping("/greet")
public ResponseEntity<GreetingResponse> getProduct(HttpServletRequest request) {
InstanceInfo service = eurekaClient.getApplication(appName).getInstances().get(0);
response.setPort(service.getPort());
return new ResponseEntity<>(response, HttpStatus.OK);
}
Next, we need to configure the routes in API gateway. The configuration of routing in gateway is already mentioned above in the Routing section of this article.

With everything done, lets test the application!!

We will be needing some REST API testing tools like Postman or Insomnia. I have used Insomnia here.

The Spring Cloud Gateway is running on Spring Boot default port of 8080. We will hit the API Gateway instead of directly calling product/inventory services which is the agenda of this demo and let's see if we can be able to get the response.

Press enter or click to view image in full size

Press enter or click to view image in full size

Since we are able to get proper responses, it shows that the routing is perfectly working fine.

Now, let look into the load balancing stuff. We take only the inventory service instances for this purpose.

Last time in the above screenshot for inventory service we see the port as 58464, which means the request was served from port 58464. Let's, try to hit the request again and see if we are getting the same port over and over again.

Press enter or click to view image in full size

After hitting the endpoints couple of times, we get to see some different port no. 58436 and some different instanceid which ideally means that the request is served from another instance and not the same instance. That means its successfully able to distribute the request.

Load Balancing Deep Dive

With this been done, let's try to dive little deeper. We start with looking into the logs from the API gateway server by enabling the log level to TRACE, the service where the magic is happening.

There are lots of logs but the most important is given below which helps us to get a peek of what's happening behind the scenes at the framework level.

Press enter or click to view image in full size

So basically, the actual URL by load balancing is resolved in the below class from the Spring Cloud Gateway jar file:

spring-cloud-gateway/spring-cloud-gateway-server/src/main/java/org/springframework/cloud/gateway/filter/ReactiveLoadBalancerClientFilter.java at main · spring-cloud/spring-cloud-gateway (github.com)

The logs are coming from Line# 108 and 143 respectively. Now, among all the methods choose() is the most important where the instance of load balancer called ReactorLoadBalanceris created. ReactorLoadBalancer is an interface that comes from the spring cloud loadbalancer, which creates an abstraction for the actual Load Balance implementation algorithm that is responsible for load balancing. There are 2 implementations available which are RandomLoadBalancer and RoundRobinLoadBalancer . These inner details of how it works and how the algorithms are implemented is not necessary for the developers, since it's been taken care by Spring Cloud Gateway framework out of the box.

But one important thing that we need to understand is the lb scheme without which the load balancing will not work. In the route section we have defined the below config in the properties file API gateway service.

spring.cloud.gateway.routes[1].uri=lb://inventory-service
If the url has a lb scheme (i.e. lb://myservice) it will use the Spring Cloud ReactorLoadBalancer to resolve the name to an actual host and port. Hence without adding the lb scheme load balancing will not work.

So that's all from this discussion about routing and load balancing in Spring Cloud Gateway. The entire code is available in my GitHub account in the below given link.

purbarunc/Spring-Cloud-Microservice at gateway-loadbalancing (github.com)

Thank you!! and see you again in some other topic discussion.

