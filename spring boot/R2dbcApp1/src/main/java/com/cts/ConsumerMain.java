package com.cts;

import com.cts.service.ConsumerService;
import com.cts.model.Consumer;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableWebFlux
public class ConsumerMain implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain.class, args);
    }

    @Bean
    ConnectionFactoryInitializer connectionFactoryInitializer(ConnectionFactory factory) {
        ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
        initializer.setConnectionFactory(factory);
        initializer.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));
        return initializer;
    }

    @Autowired
    ConsumerService service;

    @Override
    public void run(String... args) throws Exception {

        Consumer consumer = new Consumer();
        consumer.setConsumerName("rakesh kumar");
        consumer.setSalary(12000);

        service.addConsumer(consumer);

        service.getAllConsumer();
        System.out.println("search ");
        service.searchConsumerById(1);
        service.deleteConsumerById(1);
    }
}
