package com.learning.springwithkafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private KafkaTemplate<String,String> kafkaTemplate;

    private final String topic;

    public SimpleController(KafkaTemplate<String, String> kafkaTemplate, @Value("${order.topic.name:default}") String topic)   {
        this.kafkaTemplate = kafkaTemplate;
        this.topic=topic;
    }

    @GetMapping("/user/{message}")
    public void produce(@PathVariable String message){
        System.out.println("sending message to kafka topic "+topic);
        kafkaTemplate.send(topic,message);
    }
}
