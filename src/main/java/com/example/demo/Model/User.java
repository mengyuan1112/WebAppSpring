package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String name;
    private String userId;
    private String password;

    public User(@JsonProperty("name")String name,
                @JsonProperty("userId")String userId,
                @JsonProperty("password")String password){
        this.name = name;
        this.userId = userId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword(){return password;}

    public void updatePassword(@JsonProperty("password") String password) {
        this.password = password;
    }
}
