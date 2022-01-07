package com.example.kafka.spring;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class FruitMDB {

    @KafkaListener(topics = "fruit", groupId = "kafka-spring-consuming")
    void consume(String fruit){
    System.out.println("consumed a fruit: " + fruit);
    }
}
