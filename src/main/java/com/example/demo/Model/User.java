package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String name;
    private String password;

    public User(@JsonProperty("name")String name,
                @JsonProperty("password")String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }


    public String getPassword(){return password;}

    public void updatePassword(@JsonProperty("password") String password) {
        this.password = password;
    }
}
