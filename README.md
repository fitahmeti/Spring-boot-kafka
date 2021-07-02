# Spring-boot-kafka
Simple spring boot application to communicate with kafka

A basic spring boot sample to that produce and consume messages.

Steps to start application

Download zookeeper https://zookeeper.apache.org/releases.html#download

Download kafka https://kafka.apache.org/downloads

Start zookeper via cmd  C:\apache-zookeeper-3.6.2-bin\bin\ zkServer.cmd

Start Kafka via cmd C:\<Kafka>\bin\windows>kafka-server-start.bat C:/kafka_2.13-2.7.0/config/server.properties

Create a topic via cmd C:\<kafka>.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic spring-boot-kafka_topic --from-beginning

Run spring boot application

Access via endpoint http://localhost:8081/spring-boot-kafka/producer?message=Hello World

Check in the log the consumer should print this message.
