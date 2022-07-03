package com.learning.springwithkafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {


    @KafkaListener(topics = {"${order.topic.name}"} ,groupId = "group_id")
     void consume(String something){
        System.out.println("Kafka consumer speaking and I got :");
        System.out.println(something);
    }
}
