package com.example.hrm.service;

import com.example.hrm.model.CustomerOrder;
import com.example.hrm.repository.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerOrderService {
    @Autowired
    CustomerOrderRepository customerOrderRepository;

    public CustomerOrder addOrder(CustomerOrder abe){
        return  customerOrderRepository.save(abe);
    }
    public List<CustomerOrder> getAll(){
        return customerOrderRepository.findAll();
    }
    public Optional <CustomerOrder> findById(Integer OrderId){
        return customerOrderRepository.findById(OrderId);
    }
    public void deleteMe(Integer orderId){
        customerOrderRepository.deleteById(orderId);
    }
}
