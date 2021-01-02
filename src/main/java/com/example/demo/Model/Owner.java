package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Owner extends User{

    public Owner(@JsonProperty("name")String name,
                 @JsonProperty("password")String password) {
        super(name, password);
    }
}
