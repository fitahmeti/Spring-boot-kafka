package com.kafka.sample.springboot.services.base;

import com.kafka.sample.springboot.services.KafkaSenderService;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSenderServiceBase implements KafkaSenderService {

  private KafkaTemplate<String, String> kafkaTemplate;
  private String kafkaTopic = "spring-boot-kafka_topic";

  public KafkaSenderServiceBase(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  @Override
  public void sendMessage(String message) {
    kafkaTemplate.send(kafkaTopic, message);
  }
}
