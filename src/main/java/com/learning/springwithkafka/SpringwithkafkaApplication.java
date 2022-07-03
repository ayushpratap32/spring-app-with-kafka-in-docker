package com.learning.springwithkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringwithkafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwithkafkaApplication.class, args);
	}

}
