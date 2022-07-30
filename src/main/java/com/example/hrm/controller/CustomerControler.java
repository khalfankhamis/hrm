package com.example.hrm.controller;

import com.example.hrm.model.Customer;
import com.example.hrm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerControler {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer abe){
        return customerService.addCustomer(abe);
    }
    @GetMapping
    public List<Customer> getCustomer(){
        return customerService.getCustomer();
    }
    @GetMapping("/{custId}")
    public Optional<Customer> findById(@PathVariable String custId){
        return customerService.findById(custId);
    }
    @PutMapping ("/{custId}")
    public Customer addCustomer(@RequestBody Customer abe,@PathVariable String custId ){
        abe.setCustId(custId);
        return customerService.addCustomer(abe);
    }
    @DeleteMapping("/{custId}")
    public void deleteMe(@PathVariable String custId){
        customerService.deleteMe(custId);
    }



    }
