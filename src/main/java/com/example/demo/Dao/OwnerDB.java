package com.example.demo.Dao;

import com.example.demo.Model.Owner;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("Owner")
public class OwnerDB implements OwnerOperation{

    private final static List<Owner> ownerDb = new ArrayList<>();

    @Override
    public void addOwner(Owner owner) {
        ownerDb.add(owner);
    }

    @Override
    public List<Owner> selectAllOwner() {
        return ownerDb;
    }


    @Override
    public void updatePassword(String id, String password) {
        ownerDb.stream()
                .filter(owner -> owner.getUserId().equals(id))
                .findFirst()
                .get().updatePassword(password);
    }
}
