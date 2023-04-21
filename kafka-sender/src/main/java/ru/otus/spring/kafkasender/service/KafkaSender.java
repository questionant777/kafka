package ru.otus.spring.kafkasender.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static ru.otus.spring.kafkasender.util.Util.TOPIC_NAME;

@Service
public class KafkaSender {
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaSender(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String message) {
        kafkaTemplate.send(TOPIC_NAME, message);
    }
}
