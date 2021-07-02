package com.kafka.sample.springboot.controllers;

import com.kafka.sample.springboot.services.KafkaSenderService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/spring-boot-kafka/")
public class ApacheKafkaController {

  private KafkaSenderService kafkaSenderService;

  public ApacheKafkaController(KafkaSenderService kafkaSenderService) {
    this.kafkaSenderService = kafkaSenderService;
  }

  @GetMapping(value = "/producer")
  public String producer(@RequestParam("message") String message) {
    kafkaSenderService.sendMessage(message);
    return "Message sent successfully to the kafka topic";
  }
}
