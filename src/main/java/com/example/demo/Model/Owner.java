package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Owner extends User{

    public Owner(@JsonProperty("name")String name,
                 @JsonProperty("userId")String userName,
                 @JsonProperty("password")String password) {
        super(name, userName, password);
    }
}
