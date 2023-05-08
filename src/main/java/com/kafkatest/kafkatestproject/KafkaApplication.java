package com.kafkatest.kafkatestproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args
        );
    }


    //On init create a 100 hello kafka messages subscribed to the "lukescode" topic
    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
          for (int i = 0; i < 100; i ++){
              kafkaTemplate.send("lukescode", "hello kafka :-) " + i);
          }
        };
    }

}
