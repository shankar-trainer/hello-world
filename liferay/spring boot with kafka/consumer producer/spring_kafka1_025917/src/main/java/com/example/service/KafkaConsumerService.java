package com.example.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "topic1", groupId = "group1",
            properties = {"auto.offset.reset=earliest"}
    )

	public void consumeService(String msg) {
		System.out.println("consumed message "+msg);
	}

}
