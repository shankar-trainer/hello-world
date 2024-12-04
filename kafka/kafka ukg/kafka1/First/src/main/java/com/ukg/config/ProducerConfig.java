//package com.ukg.config;
//
//import com.ukg.model.Customer;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//import org.springframework.kafka.support.serializer.JsonSerializer;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//@EnableKafka
//public class ProducerConfig {
//	  //@Value("${kafka.bootstrap-servers}")
//	  private String bootstrapServers="localhost:8080";
//
//	  @Bean
//	  public ProducerFactory<String, Customer> producerFactory() {
//		    Map<String, Object> props = new HashMap<>();
//
//		    props.put(org.apache.kafka.clients.producer.ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
//		    props.put(org.apache.kafka.clients.producer.ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		    props.put(org.apache.kafka.clients.producer.ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//
//	    return new DefaultKafkaProducerFactory<>(props);
//	  }
//
//	  @Bean
//	  public KafkaTemplate<String, Customer> kafkaTemplate() {
//	    return new KafkaTemplate<>(producerFactory());
//	  }
//}
