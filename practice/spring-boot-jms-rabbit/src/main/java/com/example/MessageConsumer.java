//package com.example;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MessageConsumer {
//// for String //send
////    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
////    public void receiveMessage(String message) {
////        System.out.println("Received message from queue: " + message);
////        // Process message logic here
////    }
//
//// for UserDto //publish
//    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
//    public void receiveMessage(UserDto message) {
//        System.out.println("Received message from queue: " + message);
//        // Process message logic here
//    }
//
//    // for handling both 
////    
//    // below work only for string 
////    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
////    public void receiveMessage(Object payload) {
////
////        if (payload instanceof UserDto) {
////            UserDto user = (UserDto) payload;
////            // Handle UserDto
////                System.out.println("Received message from queue: " + user);
////
////        } else if (payload instanceof String) {
////            String msg = (String) payload;
////            // Handle String
////                System.out.println("Received message from queue: " + msg);
////
////        }
////        
////    }
//}
