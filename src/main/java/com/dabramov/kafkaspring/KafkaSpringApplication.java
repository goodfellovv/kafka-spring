package com.dabramov.kafkaspring;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

import java.io.IOException;

@SpringBootApplication
@EnableKafka
@ComponentScan(basePackages = {
        "com.dabramov.kafkaspring.config",
        "com.dabramov.kafkaspring.controller",
        "com.dabramov.kafkaspring.service",
})
public class KafkaSpringApplication {


    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringApplication.class, args);
    }

    @Bean
    public JsonDeserializer jsonDeserializer() {
        return new JsonDeserializer() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext context) throws IOException {
                return null;
            }
        };
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

}
