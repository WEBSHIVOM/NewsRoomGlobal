package com.webshivom.NewsRoomGlobal.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "demo_topic", groupId = "demo-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
