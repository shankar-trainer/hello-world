package com.example;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;

import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.DefaultClassMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {

    public static final String QUEUE_NAME = "myAppQueue";
    public static final String EXCHANGE_NAME = "myAppExchange";
    public static final String ROUTING_KEY = "myAppRoutingKey";

    // 1. Declare the Queue
    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME, true); // true = durable queue
    }

    // 2. Declare the Exchange (Direct Exchange example)
    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }

    // 3. Bind the Queue to the Exchange using a Routing Key
    @Bean
    public Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }


    @Bean
    public MessageConverter jsonMessageConverter() {

        //return new Jackson2JsonMessageConverter();
    
      Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
       
              DefaultClassMapper classMapper = new DefaultClassMapper();
        
        // 2. Trust all packages (or specific ones like "com.example.*")
        classMapper.setTrustedPackages("*");
        
        // 3. Attach the class mapper to the converter
        converter.setClassMapper(classMapper);

      
        return converter;
    }

}
