package com.kafka.consumer.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.*;

import java.io.Serializable;

public class User {

    private static final long serialVersionUID = 1L;
    public int id;
    public String name;
    public int age;
    public Address address;

    public User() {}

    public User(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return name + " " + age + " " +address;
    }
}
