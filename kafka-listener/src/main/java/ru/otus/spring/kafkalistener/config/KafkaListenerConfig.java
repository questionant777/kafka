package ru.otus.spring.kafkalistener.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static ru.otus.spring.kafkalistener.util.Util.TOPIC_NAME;

@Configuration
public class KafkaListenerConfig {
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(TOPIC_NAME)
                .partitions(10)
                .replicas(1)
                .build();
    }
}
