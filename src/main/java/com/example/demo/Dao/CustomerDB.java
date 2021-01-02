package com.example.demo.Dao;

import com.example.demo.Model.Customer;
import com.example.demo.Model.Owner;
import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("Customer")
public class CustomerDB implements CustomerOperation {
    private final static List<Customer> customerDb = new ArrayList<>();


    @Override
    public void addCustomer(Customer customer) {
        customerDb.add(customer);
    }


    @Override
    public List<Customer> selectAllCustomer() {
        return this.customerDb;
    }


    @Override
    public void updatePassword(String name, String password) {
        customerDb.stream()
                .filter(owner -> owner.getName().equals(name))
                .findFirst()
                .get().updatePassword(password);
    }
}
