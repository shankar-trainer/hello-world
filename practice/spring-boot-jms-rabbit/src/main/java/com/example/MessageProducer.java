package com.example;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        rabbitTemplate.convertAndSend(
            RabbitMQConfig.EXCHANGE_NAME, 
            RabbitMQConfig.ROUTING_KEY, 
            message
        );
    }
    
    public void sendJsonMessage(UserDto user) {
        rabbitTemplate.convertAndSend(
            RabbitMQConfig.EXCHANGE_NAME, 
            RabbitMQConfig.ROUTING_KEY, 
            user
        );
    }
}


