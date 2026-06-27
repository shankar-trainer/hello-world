using @kalfkalistener and java producer 

In Apache Kafka, you do not create a topic "with" a consumer group directly; instead, you create a topic first, and a consumer group is automatically generated the moment a consumer connects to that topic using a designated group ID.This step-by-step guide explains how to properly set up both components using the command line interface (CLI).🛠️ Step 1: Create the Kafka TopicBefore any consumer group can read data, the topic must exist. Open your terminal and run the Kafka Topics CLI Tool:bashbin/kafka-topics.sh --create \
  --bootstrap-server localhost:9092 \
  --partitions 3 \
  --replication-factor 1 \
  --topic my-awesome-topic
Use code with caution.--partitions: Splitting data across multiple partitions allows multiple consumers in your group to read in parallel.--replication-factor: The number of duplicate copies across your cluster (use 1 for local development, 3 for production).👤 Step 2: Create and Bind the Consumer GroupTo initialize a consumer group, start a console consumer and assign your chosen group name using the --group flag:bashbin/kafka-console-consumer.sh \
  --bootstrap-server localhost:9092 \
  --topic my-awesome-topic \
  --group my-target-group \
  --from-beginning
Use code with caution.What happens here: Kafka registers my-target-group as a logical worker group.Scaling out: If you open a second terminal window and run the exact same command, Kafka will automatically balance the 3 partitions between both consumers.🔍 Step 3: Verify Your Consumer GroupYou can check if your consumer group was successfully created and see how it maps to your topic using the Kafka Consumer Groups Tool:bashbin/kafka-consumer-groups.sh \
  --bootstrap-server localhost:9092 \
  --describe \
  --group my-target-group
Use code with caution.This command displays critical tracking details, such as the current message offset, log end offset, and consumer lag.💡 Programmatic Alternative (Java/Python)If you are writing application code, you don't use CLI commands. You simply pass the group.id configuration parameter into your consumer client application properties:properties# Application configuration file
bootstrap.servers=localhost:9092
group.id=my-target-group
key.deserializer=org.apache.kafka.common.serialization.StringDeserializer
value.deserializer=org.apache.kafka.common.serialization.StringDeserializer
Use code with caution.Would you like help writing the producer/consumer logic in a specific programming language like Java, Python, or Node.js?21 sitesHow to create a new consumer group in kafka - Stack OverflowConsole Consumer with property file (--consumer.config) This is how the file config/consumer.properties should look like # consume...Stack OverflowKafka Topics, Partitions & Consumer Groupsand I will show you visually how it manages messages ordering internally then we'll jump into a real world use case and IoT device...15mYouTube·MaxcoTec LearningConsumer Group Management on Kafka CLI Tutorialand in this lecture we're going to have a look at the CFKA consumer groups CLI because in this lecture we're going to see how we c...5mYouTube·Stephane MaarekShow allYou said: yes with javaTo create your Kafka topic and consumer group programmatically in Java, you can use the official Apache Kafka Clients library.This solution uses two distinct pieces of code: an Admin Client to create the topic, and a Kafka Consumer to automatically spin up the consumer group.📦 Step 1: Add the DependencyAdd the Kafka Clients library to your build file.For Maven (pom.xml):xml<dependency>
    <groupId>org.apache.kafka</groupId>
    <artifactId>kafka-clients</artifactId>
    <version>3.7.0</version>
</dependency>
Use code with caution.🛠️ Step 2: Create the Topic with AdminClientThe AdminClient allows you to manage clusters, topics, and configurations directly from your Java code.javaimport org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;

import java.util.Collections;
import java.util.Properties;

public class KafkaTopicCreator {
    public static void main(String[] args) {
        // 1. Set setup configurations
        Properties props = new Properties();
        props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        // 2. Create the AdminClient instance
        try (AdminClient adminClient = AdminClient.create(props)) {
            String topicName = "java-awesome-topic";
            int partitions = 3;
            short replicationFactor = 1; // Use 3 for real production clusters

            // 3. Define the new topic details
            NewTopic newTopic = new NewTopic(topicName, partitions, replicationFactor);

            // 4. Send the creation request to Kafka
            adminClient.createTopics(Collections.singletonList(newTopic)).all().get();
            System.out.println("Topic '" + topicName + "' created successfully!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
Use code with caution.👤 Step 3: Connect and Activate the Consumer GroupJust like the command line, your consumer group is born the moment your Java consumer connects to Kafka using a specific GROUP_ID_CONFIG.javaimport org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class KafkaGroupConsumer {
    public static void main(String[] args) {
        // 1. Set configuration properties
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        
        // This line creates your consumer group!
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "java-target-group"); 
        
        // Start reading from the very first message if no offsets exist yet
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        // 2. Create the consumer object
        try (KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props)) {
            
            // 3. Subscribe to your target topic
            consumer.subscribe(Collections.singletonList("java-awesome-topic"));
            System.out.println("Consumer Group started. Listening for messages...");

            // 4. Continuously poll the cluster for data
            while (true) {
                ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
                for (ConsumerRecord<String, String> record : records) {
                    System.out.printf("Received Message -> Key: %s, Value: %s (Partition: %d)%n", 
                            record.key(), record.value(), record.partition());
                }
            }
        }
    }
}
Use code with caution.🏎️ How to scale this outIf you want to see the consumer group mechanism in action:Run the KafkaGroupConsumer code in a terminal window.Open a second terminal window and run the exact same KafkaGroupConsumer code.Kafka will instantly detect the shared group ID (java-target-group) and automatically split the 3 partitions among both running instances.If you are building a microservice, would you like to see how to simplify this further using Spring Boot (@KafkaListener), or do you also need the Java Producer code to send test data?