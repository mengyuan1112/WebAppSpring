package com.example.demo.Service;

import com.example.demo.Dao.CustomerOperation;
import com.example.demo.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerOperation customerOperation;

    @Autowired
    public CustomerService(@Qualifier("Customer") CustomerOperation customerOperation) {
        this.customerOperation = customerOperation;
    }

    public void addCustomer(Customer customer){
        customerOperation.addCustomer(customer);
    }

    public List<Customer> selectAllCustomer(){
        return customerOperation.selectAllCustomer();
    }

    public void updatePassword(String id, String password){
        customerOperation.updatePassword(id, password);
    }

}
