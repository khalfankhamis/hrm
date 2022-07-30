package com.example.hrm.service;

import com.example.hrm.model.Customer;
import com.example.hrm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer abe){
        return customerRepository.save(abe);
    }
    public List <Customer> getCustomer(){
        return customerRepository.findAll();
    }
    public Optional<Customer> findById(String custId){
        return customerRepository.findById(custId);
    }
    public void deleteMe(String custId){
        customerRepository.deleteById(custId);
    }

}
