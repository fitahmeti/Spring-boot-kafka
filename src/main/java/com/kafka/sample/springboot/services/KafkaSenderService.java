package com.kafka.sample.springboot.services;

public interface KafkaSenderService {

  void sendMessage(String message);
}
