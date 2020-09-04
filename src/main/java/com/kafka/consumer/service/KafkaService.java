package com.kafka.consumer.service;

import com.kafka.consumer.model.Address;
import com.kafka.consumer.model.User;
import com.kafka.consumer.repo.DynamoDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class KafkaService {

    @KafkaListener(topics = "kafka_example_user",groupId = "group_id")
    public void consume(User user) {
        System.out.println(user);
    }
}
