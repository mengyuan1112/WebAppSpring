package com.example.demo.Dao;

import com.example.demo.Model.Owner;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public interface OwnerOperation {
    List<Owner> ownerDb = new ArrayList<>();

    void addOwner(Owner owner);

    List<Owner> selectAllOwner();

    void updatePassword(String name, String newPassword);


}
