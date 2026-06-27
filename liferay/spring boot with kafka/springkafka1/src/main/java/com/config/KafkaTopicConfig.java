package com.config;
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
