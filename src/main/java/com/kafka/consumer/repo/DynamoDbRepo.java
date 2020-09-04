package com.kafka.consumer.repo;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.kafka.consumer.model.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DynamoDbRepo {
    @Autowired
    private DynamoDBMapper mapper;

    public void insertUser(User user) {
        mapper.save(user);
    }

    public void deleteuserDetails(User user) {
        mapper.delete(user);
    }
}
