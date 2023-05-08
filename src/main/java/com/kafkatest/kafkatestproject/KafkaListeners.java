package com.kafkatest.kafkatestproject;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    // This method is a Kafka listener that subscribes to the "lukescode" topic with the consumer group ID "groupId".
    // It processes incoming messages by simply printing them to the console with a party popper emoji.
    @KafkaListener(topics = "lukescode", groupId = "groupId")
    void listener(String data){
    //    \uD83C\uD83C = 🎉 emoji
        System.out.println("Listener received: " + data + " \uD83C\uDF89");
    }
}
