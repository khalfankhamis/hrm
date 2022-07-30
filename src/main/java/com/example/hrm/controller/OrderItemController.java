package com.example.hrm.controller;

import com.example.hrm.model.OrderCompoKey;
import com.example.hrm.model.OrderItem;
import com.example.hrm.service.OrderItemservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orderitem")
public class OrderItemController {
    @Autowired
    private OrderItemservice orderItemservice;

    @PostMapping
    public OrderItem addOrder(@RequestBody OrderItem abe){
        return orderItemservice.addOrder(abe);
    }
    @GetMapping
    public List<OrderItem> getAll(){
        return orderItemservice.getAll();
    }
    @GetMapping("/{orderCompoKey}")
    public Optional<OrderItem> findById(@PathVariable OrderCompoKey orderCompoKey){
        return orderItemservice.findById(orderCompoKey);
    }

    @PutMapping("/{orderCompoKey}")
    public OrderItem addOrder(@RequestBody OrderItem abe,@PathVariable OrderCompoKey orderCompoKey){
        abe.setOrderCompoKey(orderCompoKey);
        return orderItemservice.addOrder(abe);
    }
    @DeleteMapping("/{orderCompoKey}")
    public void deleteMe(@PathVariable OrderCompoKey orderCompoKey){
        orderItemservice.deleteMe(orderCompoKey);
    }



    }
