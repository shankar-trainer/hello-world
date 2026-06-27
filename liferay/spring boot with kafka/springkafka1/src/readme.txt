Integrating Spring Boot with Apache Kafka allows you to build fast, reliable, and decoupled event-driven systems.
Apache Kafka is a distributed platform where producers send messages to topics, and consumers listen to those topics to process the data.

Spring Boot makes this integration incredibly simple by removing almost all boilerplate configuration.

Step 1: Create a Spring Boot ProjectGo to Spring Initializr to generate your project.

Choose the following configurations:
Project: Maven Project (or Gradle)Language: JavaDependencies:Spring Web
(to create APIs)Spring for Apache Kafka (the core messaging helper)If you are editing an existing pom.xml,
add this dependency manually:xml

<dependency>
    <groupId>org.springframework.kafka</groupId>
    <artifactId>spring-kafka</artifactId>
</dependency>

Use code with caution.

Step 2: Configure Your Kafka ConnectionOpen your src/main/resources/application.properties file.
Add the settings to point Spring Boot to your Kafka server (broker):properties# Address where Kafka is running locally
spring.kafka.bootstrap-servers=localhost:9092

# Consumer configuration
spring.kafka.consumer.group-id=my-first-group
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer

# Producer configuration

spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer


Key/Value Serializers: Tools that turn your Java objects or text strings into raw bytes to travel across the network.

Step 3: Create a Kafka Topic Programmatically
Instead of creating topics manually via a command line, you can let Spring Boot handle it at startup using a configuration class.

import org.apache.kafka.clients.admin.NewTopic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myFirstTopic() {
        return TopicBuilder.name("important-messages")
                .partitions(3) // Divides data for parallel processing
                .replicas(1)   // Backups for data safety
                .build();
    }
}

Step 4: Create a Producer (Send Messages)

Spring provides a helper class called KafkaTemplate to easily publish messages.
java
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "important-messages";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        // Sends the message string to our specified topic
        kafkaTemplate.send(TOPIC, message);
        System.out.println("Sent message: " + message);
    }
}
Use code with caution.Expose an API endpoint via a Rest Controller to test the producer:javaimport org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/publish")
    public String sendToKafka(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka successfully!";
    }
}

Step 5: Create a Consumer (Receive Messages)To read messages, use the @KafkaListener annotation. It acts like an open ear, waiting for new entries on the topic.javaimport org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "important-messages", groupId = "my-first-group")
    public void consumeMessage(String message) {
        // This runs automatically whenever a new message lands on the topic
        System.out.println("Successfully consumed message: " + message);
    }
}

Step 6:
start kafka server
C:\kafka_2.13-4.3.0\bin>windows\kafka-server-start.bat ..\config\server.properties

show kafka topics 
C:\kafka_2.13-4.3.0\bin>windows\kafka-topics.bat --list --bootstrap-server localhost:9092

topics created by java code 


start consumer
C:\kafka_2.13-4.3.0\bin\windows> kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic important-messages  --from-beginning


Step 7: Test Your SetupStart Kafka: Make sure you have a Kafka broker running locally on port 9092. 

If you use Docker, a fast docker-compose.yml file is the easiest way to spin up Kafka and Zookeeper/KRaft.

Run Application: Boot up your Spring Boot app.Send a Test Request: Open Postman, curl, or your browser and hit your endpoint:

bash
POST http://localhost:8080/api/kafka/publish?message=HelloKafka
window11 

curl.exe -X POST "http://localhost:8080/api/kafka/publish?message=HelloKafka"

powershell
PowerShell has a built-in alias for curl which maps to Invoke-WebReques

Invoke-RestMethod -Uri "http://localhost:8080/api/kafka/publish?message=HelloKafka" -Method Post


Check Logs: Your IDE console should output:textSent message: HelloKafka
Successfully consumed message: HelloKafka
 
 and also to the kafka consumer console 
 