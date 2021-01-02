package com.example.demo.API;


import com.example.demo.Model.Customer;
import com.example.demo.Model.Owner;
import com.example.demo.Service.CustomerService;
import com.example.demo.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RequestMapping("/login")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    private final OwnerService ownerService;
    private final CustomerService customerService;

    @Autowired
    public UserController(OwnerService ownerService, CustomerService customerService) {
        this.ownerService = ownerService;
        this.customerService = customerService;
    }

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer){
        this.customerService.addCustomer(customer);
        System.out.println(customer.getName());
    }

    @PostMapping("owner")
    public void addOwner(@RequestBody Owner owner){
        this.ownerService.addOwner(owner);
    }

    @GetMapping("customer")
    public List<Customer> selectAllCustomer(){
        return this.customerService.selectAllCustomer();
    }

    @GetMapping("owner")
    public List<Owner> selectAllOwner(){
        return this.ownerService.selectAllOwner();
    }

    // PatchMapping using for update
//    @PatchMapping(path = "owner/{id}/changePassword")
//    public void changePassword(@PathVariable String id, @RequestBody Map<String,String> password){
//        password.forEach((k,v) -> {
//            ownerService.updatePassword(id,v);
//        });
//    }
}
