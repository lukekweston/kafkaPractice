package com.kafkatest.kafkatestproject.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/*
A Kafka topic is a named stream of records in the Kafka distributed
streaming platform, serving as a communication channel between Kafka
producers and consumers. It organizes messages into categories so that
producers can write data to specific topics and consumers can subscribe
to topics of interest, enabling efficient and organized data sharing in
a scalable and fault-tolerant manner.
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic lukescodeTopic(){
        return TopicBuilder.name("lukescode").build();
    }
}
