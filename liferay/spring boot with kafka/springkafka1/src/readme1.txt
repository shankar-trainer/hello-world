https://mmafrar.medium.com/getting-started-with-apache-kafka-and-spring-boot-9fb4874a7c25

Getting Started with Apache Kafka and Spring Boot
Afrar Malakooth

Welcome to another Spring Boot tutorial. Today let’s have a look on how to get started with Apache Kafka on Spring Boot. This tutorial is fully based on Getting Started with Apache Kafka and Spring Boot, while making it a bit better to follow. Hence all the credits goes to original authors. You need to have a Java 11 environment and Confluent account to follow along.

Confluent Cloud
From dashboard navigate to Cluster overview -> Cluster settings and make a note of Bootstrap server URL. Then navigate to Data integration -> API Keys and create a new key with scope Global access. These values will be needed later when setting up the Spring Boot application. Finally navigate to Topics from the side pane and add a new topic named purchases with default values.

Now let’s headon to Spring Initializr for setting up a new Spring Boot project. Refer to the below screenshot and create a new project as instructed. Once done download and open it on your favourite IDE.

Press enter or click to view image in full size

Spring Initializr
Navigate to src/main/resources folder and create a file named application.yaml. Make sure to replace the placeholders with actual values for Bootstrap Server URL, Cluster API Key and Cluster API Secret.


Then open the SpringBootWithKafkaApplication.java file and make changes to it referring to the below Gist.


After that create a new Java class called Producer under com.example.kafka package and add the below content into it.


Finally create another class called Consumer under com.example.kafka package and add the below content into it.


Run the below command to run the Spring Boot application as Producer.

./gradlew bootRun — args=’ — producer’

Run the below command to run the Spring Boot application as Consumer.

./gradlew bootRun — args=’ — consumer’

