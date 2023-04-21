package ru.otus.spring.kafkalistener.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static ru.otus.spring.kafkalistener.util.Util.TOPIC_NAME;

@Service
public class ListenerService {
    private final HandleInOut handleInOut;

    public ListenerService(HandleInOut handleInOut) {
        this.handleInOut = handleInOut;
    }

    @KafkaListener(id = "myId", topics = TOPIC_NAME)
    public void listen(String in) {
        handleInOut.outAndVk(in);
    }
}
