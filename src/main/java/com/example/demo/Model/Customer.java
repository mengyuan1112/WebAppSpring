package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer extends User{
    public Customer(@JsonProperty("username") String name,
                    @JsonProperty("password")String password) {
        super(name, password);
    }
}
