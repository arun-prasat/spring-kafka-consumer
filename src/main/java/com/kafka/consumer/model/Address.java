package com.kafka.consumer.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import java.io.Serializable;

public class Address {

    public int doorNo;
    public String street;
    public int pincode;

    public Address() {}

    public Address(int doorNo, String street, int pincode) {
        this.doorNo = doorNo;
        this.street = street;
        this.pincode = pincode;
    }

    public String toString() {
        return doorNo + " " + street + " " +pincode;
    }
}
