package com.example.demo.Service;

import com.example.demo.Dao.CustomerOperation;
import com.example.demo.Dao.OwnerOperation;
import com.example.demo.Model.Customer;
import com.example.demo.Model.Owner;
import com.example.demo.Model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@Service
public class OwnerService {
    final OwnerOperation ownerOperation;

    @Autowired
    public OwnerService(@Qualifier("Owner") OwnerOperation ownerOperation){
        this.ownerOperation = ownerOperation;
    }

    public void addOwner(Owner owner){
        this.ownerOperation.addOwner(owner);
    }

    public List<Owner> selectAllOwner(){
        return this.ownerOperation.selectAllOwner();
    }

    public void updatePassword(String id, @RequestBody String password){
        ownerOperation.updatePassword(id, password);
    }
}
