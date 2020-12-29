package com.example.demo.Dao;

import com.example.demo.Model.Customer;
import com.example.demo.Model.Owner;
import com.example.demo.Model.User;

import java.util.*;

public interface CustomerOperation {
    List<Customer> customerDb = new ArrayList<>();

    void addCustomer(Customer customer);

    List<Customer> selectAllCustomer();

    void updatePassword(String id, String password);

}
