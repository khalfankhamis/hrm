package com.example.hrm.controller;

import com.example.hrm.model.CustomerOrder;
import com.example.hrm.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customController")
public class CustomerOrderControler {
    @Autowired
    private CustomerOrderService customerOrderService;

    @PostMapping
    public CustomerOrder addOrder(@RequestBody CustomerOrder abe){
        return customerOrderService.addOrder(abe);
    }
    @GetMapping
    public List<CustomerOrder> getAll(){
        return customerOrderService.getAll();
    }
    @GetMapping("/{OrderId}")
    public Optional<CustomerOrder> findById(@PathVariable Integer OrderId){
        return customerOrderService.findById(OrderId);
}
    @PutMapping("/{OrderId}")
    public CustomerOrder addOrder(@RequestBody CustomerOrder abe,@PathVariable Integer OrderId ){
        abe.setOrderId(OrderId);
        return customerOrderService.addOrder(abe);
}
    @DeleteMapping("/{OrderId}")
    public void deleteMe(@PathVariable Integer OrderId){
        customerOrderService.deleteMe(OrderId);
}
}
