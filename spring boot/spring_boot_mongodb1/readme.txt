Reactive Spring Boot Applications
Bubu Tripathy

Reactive programming is an asynchronous programming paradigm that deals with data streams and the propagation of changes. It focuses on composing and transforming streams of data using declarative and functional constructs. Project Reactor is a reactive programming library developed by Pivotal, designed to work seamlessly with Spring Framework and Spring Boot.

In this tutorial, we will delve into creating advanced asynchronous Spring Boot applications using Project Reactor. We will cover various concepts and techniques to leverage reactive programming effectively in Spring Boot applications.

Creating Reactive APIs involves designing and implementing endpoints in your Spring Boot application that use Project Reactor to handle asynchronous and non-blocking operations effectively. These APIs allow you to work with streams of data and handle requests in a reactive and efficient manner. Let’s delve deeper into the process of creating reactive APIs.

Project Setup: Start by creating a new Spring Boot project using Spring Initializr, selecting the “Reactive Web” dependency. Import the project into your preferred IDE.

Define Reactive Endpoints
Define methods within the controller class to handle different HTTP requests. These methods return reactive types like Mono or Flux from Project Reactor.

@GetMapping("/users/{id}")
public Mono<ResponseEntity<User>> getUserById(@PathVariable String id) {
    return userService.getUserById(id)
            .map(user -> ResponseEntity.ok(user))
            .defaultIfEmpty(ResponseEntity.notFound().build());
}

@GetMapping("/users")
public Flux<User> getAllUsers() {
    return userService.getAllUsers();
}

@PostMapping("/users")
public Mono<ResponseEntity<User>> createUser(@RequestBody User user) {
    return userService.saveUser(user)
            .map(savedUser -> ResponseEntity.status(HttpStatus.CREATED).body(savedUser));
}
Mono: Represents a stream of at most one element. Used when you expect to return zero or one result.

Flux: Represents a stream of multiple elements. Used when you expect to return a collection or sequence of data.

(See the section “Deep dive: Mono and Flux” for more details)

map, filter, and Other Operators
Using operators like map, filter, and others in Project Reactor is a powerful way to manipulate and transform data within reactive streams. These operators allow you to perform various operations on the data as it flows through the stream, enabling you to create complex transformations and calculations efficiently.

map Operator
The map operator transforms each element emitted by a reactive stream using a function. It is particularly useful for converting data from one type to another or applying some transformation to each element.

Flux<Integer> originalFlux = Flux.just(1, 2, 3);
Flux<String> mappedFlux = originalFlux.map(number -> "Number: " + number);
filter Operator
The filter operator allows you to selectively emit elements from a reactive stream based on a given condition. It is handy for implementing data filtering logic.

Flux<Integer> numbers = Flux.range(1, 10);
Flux<Integer> evenNumbers = numbers.filter(number -> number % 2 == 0);
flatMap Operator
The flatMap operator is used to transform each element into a new reactive stream and then flatten the resulting streams into a single stream. It is suitable for scenarios where each input element corresponds to multiple output elements.

Flux<Integer> numbers = Flux.just(1, 2, 3);
Flux<String> letterFlux = numbers.flatMap(number -> Flux.just("A", "B").map(letter -> number + letter));
zip Operator
The zip operator combines elements from two or more reactive streams into pairs, tuples, or other custom objects. It's useful when you need to process elements from multiple streams together.

Flux<Integer> numbers = Flux.just(1, 2, 3);
Flux<String> letters = Flux.just("A", "B", "C");
Flux<String> combined = Flux.zip(numbers, letters, (number, letter) -> number + letter);
merge and concat Operators
The merge operator combines elements from multiple streams into a single stream, interleaving elements as they arrive. The concat operator, on the other hand, concatenates the streams one after another.

Flux<Integer> flux1 = Flux.just(1, 2, 3);
Flux<Integer> flux2 = Flux.just(4, 5, 6);
Flux<Integer> mergedFlux = Flux.merge(flux1, flux2); // interleaved
Flux<Integer> concatenatedFlux = Flux.concat(flux1, flux2); // in order
Chaining Operators
You can chain multiple operators together to create more complex transformations. Just remember that the order of chaining matters as it affects how the data flows through the stream.

Flux<Integer> numbers = Flux.just(1, 2, 3, 4, 5);
Flux<String> transformedFlux = numbers
    .filter(number -> number % 2 == 0)
    .map(number -> "Even: " + number);
Composing Operators
Project Reactor provides various operators to compose, combine, and transform streams effectively. You can use these operators to create sophisticated data processing pipelines while keeping your code clean and maintainable.

// Chaining map, filter, and reduce

Flux<Integer> numbers = Flux.range(1, 5);

Mono<Integer> sumOfEvenSquaredNumbers = numbers
    .filter(number -> number % 2 == 0) // Filter even numbers
    .map(evenNumber -> evenNumber * evenNumber) // Square the even numbers
    .reduce(0, (acc, squaredNumber) -> acc + squaredNumber); // Calculate sum

sumOfEvenSquaredNumbers.subscribe(result -> System.out.println("Sum: " + result));

// Using zip and map together

Flux<Integer> numbers = Flux.range(1, 5);
Flux<String> words = Flux.just("one", "two", "three", "four", "five");

Flux<String> combined = Flux.zip(numbers, words, (number, word) -> number + ": " + word);

combined.subscribe(System.out::println);

// Combining flatMap and filter

Flux<String> letters = Flux.just("A", "B", "C");

Flux<String> transformedLetters = letters
    .flatMap(letter -> Flux.just(letter, letter.toLowerCase())) // Transform each letter into upper and lower case
    .filter(transformedLetter -> !transformedLetter.equals("a")); // Filter out lowercase 'a'

transformedLetters.subscribe(System.out::println);
Error Handling
Asynchronous operations and reactive streams introduce new challenges when it comes to dealing with errors, but they also provide powerful tools to handle errors gracefully and maintain the responsiveness of your application.

Error Handling Challenges in Reactive Programming

Non-Blocking Nature: Reactive programming relies on non-blocking operations, which can lead to errors occurring at different times and potentially being handled on different threads. This makes traditional error handling mechanisms, like try-catch blocks, less effective.
Asynchronous Stack Traces: Asynchronous operations can complicate stack traces, making it harder to track down the source of errors and their context.
Multiple Stages: Reactive chains often consist of multiple stages with various transformations and operators. Errors could occur at any stage, making it important to handle them at the appropriate level.
Error Handling Strategies

Get Bubu Tripathy’s stories in your inbox
Join Medium for free to get updates from this writer.

Enter your email
Subscribe
Project Reactor provides several operators to manage errors effectively within reactive streams:

onErrorResume and onErrorReturn: These operators allow you to provide fallback values or alternative streams in case of an error. This can help prevent the entire stream from failing and provide a more graceful degradation.
doOnError: This operator lets you execute specific actions when an error occurs, such as logging the error or cleaning up resources. It doesn't interfere with the error propagation itself.
retry and retryWhen: These operators enable you to automatically retry an operation a specified number of times or based on a certain condition. This can be helpful for transient errors.
Global Error Handling: Spring WebFlux offers global exception handling through @ControllerAdvice and @ExceptionHandler annotations, similar to traditional Spring MVC applications.
Suppose you have a reactive service that fetches user data, and you want to provide a default user if an error occurs:

public Mono<User> getUserById(String id) {
    return userRepository.findById(id)
            .onErrorResume(throwable -> {
                log.error("Error occurred while fetching user by id: {}", id, throwable);
                return Mono.just(new User("default", "Default User"));
            });
}
In this example, The doOnError operator is used to log an error message when an error occurs. Finally, we use the onErrorReturn operator to provide a fallback value of -1 when an error occurs.

import reactor.core.publisher.Flux;

public class DoOnErrorExample {

    public static void main(String[] args) {
        Flux<Integer> numbers = Flux.just(1, 2, 3, 4, 5)
                .concatWith(Flux.error(new RuntimeException("Oops! An error occurred.")))
                .map(number -> 10 / (number - 3)) // This will cause an ArithmeticException

                .doOnError(throwable -> System.err.println("Error occurred: " + throwable.getMessage()))

                .onErrorReturn(-1); // Provide a fallback value in case of an error

        numbers.subscribe(
                value -> System.out.println("Received: " + value),
                error -> System.err.println("Subscriber error: " + error.getMessage())
        );
    }
}
Testing Error Scenarios
When testing reactive components, ensure you cover error scenarios using StepVerifier to verify the behavior of your reactive streams in response to different types of errors.

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class ReactiveStreamTest {

    @Test
    public void testFlux() {
        Flux<Integer> numbers = Flux.just(1, 2, 3, 4, 5);

        StepVerifier.create(numbers)
            .expectNext(1, 2, 3, 4, 5)
            .verifyComplete();
    }

    @Test
    public void testTransformations() {
        Flux<Integer> numbers = Flux.just(1, 2, 3, 4, 5);

        StepVerifier.create(numbers
                .filter(number -> number % 2 == 0)
                .map(evenNumber -> evenNumber * 2)
        )
            .expectNext(4, 8)
            .verifyComplete();
    }

    @Test
    public void testWithError() {
        Flux<Integer> numbers = Flux.just(1, 2, 3)
            .concatWith(Flux.error(new RuntimeException("Oops! An error occurred.")));

        StepVerifier.create(numbers)
            .expectNext(1, 2, 3)
            .expectError(RuntimeException.class)
            .verify();
    }
}
In this example:

We have three test methods, each demonstrating a different aspect of testing reactive streams.
In the testFlux method, we verify that a simple Flux emits the expected elements and completes successfully using expectNext and verifyComplete.
In the testTransformations method, we apply transformations using filter and map, and then verify the transformed elements using expectNext and verifyComplete.
In the testWithError method, we simulate an error scenario by concatenating an error-producing Flux to an existing Flux. We use expectError to verify that the error is emitted.
Testing Reactive Endpoints
By using testing frameworks like JUnit and the WebTestClient provided by Spring WebFlux, you can simulate HTTP requests, verify responses, and cover various scenarios, including success and error cases. Here's a detailed guide on testing reactive endpoints:

Set Up Testing Environment
In your test class, annotate it with @SpringBootTest to indicate that it's a Spring Boot test. You can also use @AutoConfigureWebTestClient to automatically configure the WebTestClient for testing.

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient
public class UserControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    // Test methods...
}
Write Test Methods
Create test methods to cover various scenarios of your reactive endpoints. Use the WebTestClient to simulate HTTP requests and verify responses.

@Test
public void testGetAllUsers() {
    webTestClient.get().uri("/users")
            .exchange()
            .expectStatus().isOk()
            .expectBodyList(User.class);
}

@Test
public void testGetUserById() {
    webTestClient.get().uri("/users/{id}", "user-id")
            .exchange()
            .expectStatus().isOk()
            .expectBody(User.class);
}

@Test
public void testCreateUser() {
    User newUser = new User("new-user-id", "New User");

    webTestClient.post().uri("/users")
            .bodyValue(newUser)
            .exchange()
            .expectStatus().isCreated()
            .expectBody(User.class)
            .isEqualTo(newUser);
}

// Additional test methods for error scenarios...
Test Success Scenarios
Use the WebTestClient to simulate requests and verify the expected responses. For example, in the testGetAllUsers method, we expect an HTTP 200 (OK) status and a list of users in the response body.

Test Error Scenarios
To test error scenarios, you can create test methods where you intentionally trigger errors by sending invalid data or manipulating the input in a way that should lead to errors. For instance, testing for a “not found” scenario when fetching a user that doesn’t exist.

@Test
public void testGetUserById_NotFound() {
    webTestClient.get().uri("/users/nonexistent-id")
            .exchange()
            .expectStatus().isNotFound();
}
Deep dive: Mono and Flux
Working with Mono and Flux in Project Reactor is fundamental when building reactive applications in Spring Boot. These types allow you to represent asynchronous and potentially infinite data streams. Let's delve deeper into how to work with Mono and Flux:

Mono: Handling One or Zero Elements
A Mono represents a stream that emits at most one element or an error. It's used when you expect either a single result or no result at all. Common use cases include fetching a single resource or performing an operation that results in a single value.

Mono<User> userMono = userRepository.findById(userId);
Flux: Handling Multiple Elements
A Flux represents a stream that emits multiple elements (including zero). It's used for scenarios where you expect a sequence of values, such as fetching a list of items, streaming data, or processing events.

Flux<User> allUsers = userRepository.findAll();
Subscribing to Mono and Flux
To initiate the processing of elements in a reactive stream, you need to subscribe to the stream. Subscription triggers the execution of asynchronous operations and consumption of emitted values.

userMono.subscribe(user -> System.out.println("User: " + user));
allUsers.subscribe(user -> System.out.println("User: " + user));
Transforming Elements
Project Reactor provides a wide range of operators to manipulate and transform elements within Mono and Flux. Operators like map, filter, flatMap, and zip allow you to modify, filter, and combine elements as they flow through the stream.

Flux<Integer> numbers = Flux.just(1, 2, 3, 4, 5);
Flux<String> squaredStrings = numbers
    .map(number -> number * number)
    .map(squared -> "Squared: " + squared);
Combining Streams
You can also combine multiple streams using operators like concat, merge, and zip. These operators allow you to create more complex data processing pipelines.

Flux<User> users1 = userRepository.findByAgeGreaterThan(18);
Flux<User> users2 = userRepository.findByCountry("USA");
Flux<User> combinedUsers = Flux.concat(users1, users2);
Handling Empty Streams
Both Mono and Flux can emit an empty stream when there are no elements. You can use operators like defaultIfEmpty to provide a fallback value in case of an empty stream.

Mono<User> userMono = userRepository.findById(userId)
    .defaultIfEmpty(new User("default", "Default User"));
Combining Publishers
In the realm of asynchronous programming with Reactor in Spring Boot, one of the most powerful capabilities is the ability to combine and orchestrate multiple publishers. This enables developers to create intricate and dynamic data flows, perform complex operations, and handle scenarios involving multiple sources of data.

Concatenating Publishers
The concat operator is used to concatenate the emissions from multiple publishers in the order they are provided. This is useful when you want to ensure that the emissions from one publisher are fully processed before moving on to the emissions of the next publisher.

Flux<Integer> first = Flux.range(1, 3);
Flux<Integer> second = Flux.range(4, 3);

Flux<Integer> concatenated = Flux.concat(first, second);

concatenated.subscribe(System.out::println);  // Output: 1 2 3 4 5 6
Merging Publishers
The merge operator allows emissions from multiple publishers to interleave. This is particularly helpful when dealing with multiple sources of data that can arrive asynchronously.

Flux<Long> interval1 = Flux.interval(Duration.ofSeconds(1)).take(3);
Flux<Long> interval2 = Flux.interval(Duration.ofMillis(500), Duration.ofMillis(1000)).take(3);

Flux<Long> merged = Flux.merge(interval1, interval2);

merged.subscribe(System.out::println);  // Output: 0 0 1 1 2 2
Zip Publishers
The zip operator pairs up corresponding elements from multiple publishers. This is beneficial when you want to combine data points that have a logical relationship, like fetching additional details based on an initial set of data.

Flux<String> colors = Flux.just("Red", "Green", "Blue");
Flux<String> codes = Flux.just("#FF0000", "#008000", "#0000FF");

Flux<String> combined = Flux.zip(colors, codes, (color, code) -> color + ": " + code);

combined.subscribe(System.out::println);
// Output:
// Red: #FF0000
// Green: #008000
// Blue: #0000FF
Combining Latest Values
The combineLatest operator combines the latest emissions from multiple publishers. This is helpful when you want to react to changes in any of the combined publishers.

Flux<Long> interval1 = Flux.interval(Duration.ofSeconds(1));
Flux<Long> interval2 = Flux.interval(Duration.ofMillis(500));

Flux<String> combined = Flux.combineLatest(interval1, interval2,
    (value1, value2) -> "Interval1: " + value1 + " | Interval2: " + value2);

combined.take(5).subscribe(System.out::println);
// Output (as time progresses):
// Interval1: 0 | Interval2: 0
// Interval1: 0 | Interval2: 1
// Interval1: 1 | Interval2: 1
// Interval1: 2 | Interval2: 1
// Interval1: 2 | Interval2: 2
Using FlatMap for Dynamic Publishers
The flatMap operator is a versatile tool for managing dynamic asynchronous operations. It takes each emission from a source publisher and maps it to a new publisher, which can emit its own sequence of values. This is particularly useful when you have to perform additional asynchronous tasks for each emitted item.

Flux<String> source = Flux.just("apple", "banana", "cherry");

Flux<String> processed = source.flatMap(item ->
    Mono.just(item.toUpperCase())
        .delayElement(Duration.ofMillis(item.length() * 100))
);

processed.subscribe(System.out::println);
// Output (timing varies):
// APPLE
// BANANA
// CHERRY
Handling Errors with Combining Operators
When combining publishers, it’s important to consider error handling. Errors in any of the publishers will trigger an error signal in the resulting combined publisher.

Flux<Integer> first = Flux.range(1, 3)
    .map(n -> {
        if (n == 2) throw new RuntimeException("Oops!");
        return n;
    });

Flux<Integer> second = Flux.range(4, 3);

Flux<Integer> combined = Flux.concat(first, second);

combined.subscribe(
    System.out::println,
    error -> System.err.println("Error: " + error.getMessage())
);
// Output:
// 1
// Error: Oops!
Backpressure
Backpressure is a crucial concept in reactive programming that addresses the challenge of managing the flow of data between publishers and subscribers, especially when the rate of data production exceeds the rate of data consumption. Imagine a scenario where a fast data producer is feeding a slow data consumer. Without backpressure, the consumer could become overwhelmed, leading to memory exhaustion, latency spikes, or even application crashes. Backpressure addresses this issue by allowing the consumer to control the rate at which it receives data. When a subscriber encounters too much data, it signals the publisher to slow down or stop emitting data temporarily.

Reactor provides robust mechanisms to handle backpressure, ensuring the stability and efficiency of asynchronous data flows.

Reactive Streams, which Reactor is built upon, provide a standardized way to handle backpressure. The key interfaces of Reactive Streams are:

Publisher: Emits a stream of data to which a subscriber can subscribe.

Subscriber: Consumes data emitted by the publisher and signals backpressure when needed.

Subscription: Represents a connection between a publisher and a subscriber, allowing the subscriber to request a specific number of items.

Backpressure Handling Strategies
Reactor offers various backpressure handling strategies, allowing developers to choose the approach that best fits their application’s needs:

BUFFER: The most straightforward strategy. The publisher buffers emitted data until the subscriber can consume it. While this can prevent data loss, it might lead to increased memory usage.
DROP: When the subscriber signals that it can’t keep up, the publisher simply drops the excess data. This can lead to data loss but helps prevent memory overflows.
LATEST: This strategy drops the previously buffered data and only keeps the most recent data. It’s useful when older data becomes less relevant.
ERROR: The publisher throws an error when the subscriber can’t keep up. This strategy ensures that backpressure issues are surfaced explicitly but can be disruptive.
Implementing Backpressure
Reactors’ built-in operators facilitate seamless backpressure handling. For instance, the onBackpressureBuffer operator buffers excess data and awaits the consumer's readiness. The onBackpressureDrop operator simply discards surplus data.

Flux<Integer> fastProducer = Flux.range(1, 1000);
Flux<Integer> bufferedConsumer = fastProducer.onBackpressureBuffer(10);

bufferedConsumer.subscribe(
    value -> {
        // Simulate slow processing
        Thread.sleep(100);
        System.out.println(value);
    }
);
In this example, The fastProducer emits integers from 1 to 1000 in quick succession. The bufferedConsumer is created as a buffered version of the fastProducer, ensuring that when the consumer can't keep up, up to 10 values are buffered before applying backpressure.

Mismatches in Producer and Consumer Speeds
Backpressure is most critical when there’s a substantial difference between the speed of data production and consumption. Reactive Streams help balance this discrepancy by allowing subscribers to request data at their own pace. When using Reactor, publishers only emit data when explicitly requested by subscribers, ensuring that the rate of data production matches the rate of consumption.

Flux<Integer> fastProducer = Flux.range(1, 1000);
fastProducer.subscribe(
    value -> {
        // Simulate slow processing
        Thread.sleep(100);
        System.out.println(value);
    }
);
The output will show the integers from 1 to 1000 incrementing sequentially, but with a delay of approximately 100 milliseconds between each printed value. This example illustrates how the slow processing of each emitted value by the subscriber can impact the rate at which data is consumed from a fast data source, effectively introducing a backpressure scenario.

WebClient
WebClient is a reactive HTTP client provided by Spring WebFlux, the reactive counterpart of Spring MVC. It enables you to make non-blocking, asynchronous HTTP requests to external services while leveraging the power of reactive programming. WebClient is ideal for scenarios where you want to fetch data from remote APIs, call microservices, or interact with any external HTTP-based service.

You can create a WebClient instance using the WebClient.builder() method. The builder provides various options to configure the behavior of the client, such as setting base URLs, default headers, and more.

WebClient webClient = WebClient.builder()
    .baseUrl("https://api.example.com")
    .defaultHeader("Authorization", "Bearer YOUR_ACCESS_TOKEN")
    .build();
WebClient offers a variety of methods for making HTTP requests. You can choose the appropriate method based on the type of request you need to perform (GET, POST, PUT, DELETE, etc.). Each method returns a Mono<ClientResponse> representing the response of the HTTP request.

Mono<ClientResponse> responseMono = webClient.get()
    .uri("/endpoint")
    .retrieve()
    .toBodilessEntity();
In the above example, the get() method is used to initiate a GET request to the specified URI. The retrieve() method performs the request, and the toBodilessEntity() method extracts the response without reading the body. You can use other methods like toEntity(), bodyToMono(), or bodyToFlux() to extract different parts of the response.

Since WebClient operates in a reactive environment, it returns reactive types such as Mono or Flux to represent asynchronous data. You can use these types to process the response data asynchronously.

Mono<ApiResponse> responseMono = webClient.get()
    .uri("/endpoint")
    .retrieve()
    .bodyToMono(ApiResponse.class);

responseMono.subscribe(
    response -> System.out.println("Response: " + response),
    error -> System.err.println("Error: " + error.getMessage())
);
In this example, the bodyToMono() method converts the response body to a Mono<ApiResponse> where ApiResponse is a class representing the structure of the response. The subscribe() method initiates the request and handles the response or error asynchronously.

Error Handling
WebClient also provides mechanisms for handling errors in a reactive way. You can use the onStatus() method to define how to handle different HTTP response statuses.

Mono<ApiResponse> responseMono = webClient.get()
    .uri("/endpoint")
    .retrieve()
    .onStatus(HttpStatus::is4xxClientError, response ->
        Mono.error(new CustomException("Client error"))
    )
    .bodyToMono(ApiResponse.class);
In this example, the onStatus() method is used to handle 4xx client errors. If a 4xx error occurs, a custom exception is created and propagated through the reactive pipeline.

=====================================================================

Spring Boot WebFlux MongoDB Crud Example
Akhil Zade

Reactive programming
If you are not familiar with this kind of programming approach, you have to know we are building applications based on data-stream and propagation of events/changes of data or conditions.

Project Reactor
It’s an interesting framework that brings reactive programming in Java after javaRx. The pillars of this library are two classes:

Mono<T> — is a publisher that produces from 0 to 1 value of T
Flux<T> — is a publisher that produces from 0 to N values of T
Both classes follow a basic, but a fundamental principle:

In this tutorial we will be looking at creating example using Spring Boot WebFlux + MongoDB Crud.

Press enter or click to view image in full size

In this article will create the example which will support fully non-blocking, also using mongodb as back-end database to utilise reactive programming completely.

Follow steps from MongoDB Download for Windows.

Project Structure

Maven Dependency
Add spring-boot-starter-webflux and spring-boot-starter-data-mongodb-reactive dependencies.

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
 <modelVersion>4.0.0</modelVersion>
 <parent>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-parent</artifactId>
  <version>2.7.6</version>
  <relativePath/> <!-- lookup parent from repository -->
 </parent>
 <groupId>com.core</groupId>
 <artifactId>Spring_Boot_Webflux</artifactId>
 <version>0.0.1-SNAPSHOT</version>
 <name>Spring_Boot_Webflux</name>
 <description>Demo project for Spring Boot</description>
 <properties>
  <java.version>11</java.version>
 </properties>
 <dependencies>
  <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
  </dependency>
  <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-webflux</artifactId>
  </dependency>
  <dependency>
   <groupId>io.projectreactor</groupId>
   <artifactId>reactor-test</artifactId>
   <scope>test</scope>
  </dependency>
  <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-devtools</artifactId>
   <scope>runtime</scope>
   <optional>true</optional>
  </dependency>
  <dependency>
   <groupId>org.projectlombok</groupId>
   <artifactId>lombok</artifactId>
   <optional>true</optional>
  </dependency>
  <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-test</artifactId>
   <scope>test</scope>
  </dependency>
  <dependency>
   <groupId>io.projectreactor</groupId>
   <artifactId>reactor-test</artifactId>
   <scope>test</scope>
  </dependency>
 </dependencies>

 <build>
  <plugins>
   <plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <configuration>
     <excludes>
      <exclude>
       <groupId>org.projectlombok</groupId>
       <artifactId>lombok</artifactId>
      </exclude>
     </excludes>
    </configuration>
   </plugin>
  </plugins>
 </build>

</project>
Application Properties
Under src/main/resources folder, open application.properties and write these lines.

## MongoDB default port
dbport=27017

##MongoDB database name
dbname=demo
spring.data.mongodb.database=demo
spring.data.mongodb.port=27017
Webflux Configuration
Configuration of Webflux In Project, You can create class and implement WebFluxConfigurer Interface. we need to add two most important annotation @EnableWebFlux @Configuration.

package com.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class WebFluxConfig implements WebFluxConfigurer {
}
MongoDB Configuration
Configuration of mongodb In Project, You can create class and extends AbstractReactiveMongoConfiguration class. we need to add two most important annotation @Configuration @EnableReactiveMongoRepositories.

package com.core.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(basePackages = "com.core.repo")
public class MongoConfig extends AbstractReactiveMongoConfiguration {

    @Value("${port}")
    private String port;

    @Value("${dbname}")
    private String dbName;

    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create();
    }

    @Override
    protected String getDatabaseName() {
        return dbName;
    }

    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate() {
        return new ReactiveMongoTemplate(reactiveMongoClient(), getDatabaseName());
    }


}
Entity Class
You would never need to set the Id field as this will be generated by MongoDB. The class is annotated with @Document(collection = “organization”) as this needs to be stored in the database as organization collection.

package com.core.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public @Data class Organization implements Serializable {

    @Id
    private String orgId;
    private String orgName;
    private String orgEmail;
    private Long contact;
    private boolean isActive;


}
DTO Class
DTOs or Data Transfer Objects are objects that carry data between processes in order to reduce the number of methods calls.

package com.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public @Data class OrganizationDto implements Serializable {
    private String orgId;
    private String orgName;
    private String orgEmail;
    private boolean isActive;
    private Long contact;
}
REST Controller
Let’s focus now on the most important part of our backend application for the purpose we have in this guide: the Reactive Controller. First, let’s see the full code source, and then we’ll navigate through the different parts.

package com.core.controller;

import com.core.dto.OrganizationDto;
import com.core.entity.Organization;
import com.core.services.OrganizationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(value = "/api/v1/org")
@RequiredArgsConstructor
@Slf4j
public class OrganizationController {

   private final OrganizationService orgService;

    @PostMapping("/save")
    public ResponseEntity<Mono<Organization>> save(@RequestBody OrganizationDto organizationDto) throws ExecutionException, InterruptedException {
        Mono<Organization> orgSave = orgService.saveOrg(organizationDto);
        return new ResponseEntity<Mono<Organization>>(orgSave, HttpStatus.OK);
    }

    @GetMapping("/{orgId}")
    public ResponseEntity<Mono<Organization>> findById(@PathVariable("orgId") String id) {
        Mono<Organization> findId = orgService.findById(id);
        return new ResponseEntity<Mono<Organization>>(findId, HttpStatus.OK);
    }

 
    @GetMapping("/all")
    public Flux<Organization> findAll() {
        Flux<Organization> orgAll = orgService.findAll();
        return orgAll;
    }

    @PutMapping("/update")
    public Mono<Organization> update(@RequestBody OrganizationDto organizationDto) {
        return orgService.update(organizationDto);
    }

    @DeleteMapping("/{orgId}")
    public void delete(@PathVariable("orgId") String id) {
        orgService.delete(id).subscribe();
    }
}
Service Interface
you want to follow best practiceof spring boot. you can create OrganizationService interface.

package com.core.services;

import com.core.dto.OrganizationDto;
import com.core.entity.Organization;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrganizationService {
    Mono<Organization> saveOrg(OrganizationDto organizationDto);

    Mono<Organization> findById(String id);

    Flux<Organization> findAll();

    Mono<Organization> update(OrganizationDto organizationDto);

    Mono<Void> delete(String id);
}
Service classes Implementation
create OrganizationServicesImpl and implements OrganizationService interface all method.

package com.core.services.impl;

import com.core.dto.OrganizationDto;
import com.core.entity.Organization;
import com.core.repo.OrgRepo;
import com.core.services.OrganizationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class OrganizationServicesImpl implements OrganizationService {

    @NonNull
    private OrganizationRepo orgRepo;



    @Override
    public Mono<Organization> saveOrg(OrganizationDto organizationDto){
       if(Objects.nonNull(organizationDto)){
           return orgRepo.save(organizationDtoToEntity(organizationDto));
       }else{
           return null;
       }
    }


    @Override
    public Mono<Organization> findById(String id) {
        return orgRepo.findById(id);
    }

    @Override
    public Flux<Organization> findAll() {
        return orgRepo.findAll();
    }

    @Override
    public Mono<Organization> update(OrganizationDto organizationDto) {
        return this.orgRepo.findById(organizationDto.getOrgId())
                .map(org -> organizationDtoToEntity(organizationDto))
                .flatMap(this.orgRepo::save);
    }

    @Override
    public Mono<Void> delete(String id) {
        return orgRepo.deleteById(id);
    }

    public static Organization organizationDtoToEntity(OrganizationDto organizationDto){
        Organization organization=new Organization();
        BeanUtils.copyProperties(organizationDto, organization);
       return organization;
    }


}
Repository Interface
Creating a basic Reactive repository is as simple as creating a classic one in Spring Data: you just need to create an interface that extends ReactiveCrudRepository, which is the reactive version of CrudRepository. You’ll have access then to default methods to create, read, update, and delete (CRUD) Quotes.

Get Akhil Zade’s stories in your inbox
Join Medium for free to get updates from this writer.

Enter your email
Subscribe
Let’s have a look at the interface, and then we’ll describe what it does.

package com.core.repo;

import com.core.entity.Organization;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepo extends ReactiveMongoRepository<Organization,String>  {


}
Test Application
Run the application and follow the below steps to test the application response.

Create the Organization data, use HTTP POST
URL: http://localhost:8080/api/v1/org/save

{
  "orgId": "1233",
  "orgName": "test",
  "orgEmail": "test@gmail.com",
  "isActive": false,
  "contact": 122325
}
Press enter or click to view image in full size

Also, you can see the output in MongoDB UI

Press enter or click to view image in full size

NOTE: You Can Check The All Endpoint

2. Get the Organization data By orgId , use HTTP GET

URL: http://localhost:8080/api/v1/org/63b173397a884a4a8246a39a

3. Delete the Organization data by orgId, use HTTP DELETE

URL: http://localhost:8080/api/v1/org/63b173397a884a4a8246a39a

Notice that I am testing the API with Postman chrome browser extension which is a blocking client. It will display the result only when It has collected both employees’ responses.

To verify the non-blocking response feature, hit the URL in the chrome browser directly. The results will appear one by one, as and when they are available in form of events (text/event-stream). To better view the result, consider adding a delay to the controller API.

Press enter or click to view image in full size

Conclusion
Both Spring MVC and Spring WebFlux support client-server architecture but there is a key difference in the concurrency model and the default behavior for blocking nature and threads. In Spring MVC, it is assumed that applications can block the current thread while in webflux, threads are non-blocking by default. It is the main difference between spring webflux vs mvc.

Reactive and non-blocking generally do not make applications run faster. The expected benefit of reactive and non-blocking is the ability to scale the application with a small, fixed number of threads and lesser memory requirements. It makes applications more resilient under load because they scale in a more predictable manner.

