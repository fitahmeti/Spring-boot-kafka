package com.kafka.sample.springboot.services.base;

import com.kafka.sample.springboot.services.KafkaConsumerService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceBase implements KafkaConsumerService {

  @Override
  @KafkaListener(topics = "spring-boot-kafka_topic", groupId = "from-beginning")
  public void consumer(String message) {
    System.out.println("Message of topic " + message);
  }
}
