package com.kafkatest.kafkatestproject;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "lukescode", groupId = "groupId")
    void listener(String data){
    //    \uD83C\uD83C = 🎉 emoji
        System.out.println("Listener received: " + data + " \uD83C\uDF89");
    }
}
