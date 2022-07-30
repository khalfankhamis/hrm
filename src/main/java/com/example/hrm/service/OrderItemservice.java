package com.example.hrm.service;

import com.example.hrm.model.OrderCompoKey;
import com.example.hrm.model.OrderItem;
import com.example.hrm.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemservice {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public OrderItem addOrder(OrderItem abe){
        return orderItemRepository.save(abe);
    }
    public List<OrderItem> getAll(){
        return orderItemRepository.findAll();
    }
    public Optional<OrderItem> findById(OrderCompoKey orderCompoKey){
        return orderItemRepository.findById(orderCompoKey);
    }
    public void deleteMe(OrderCompoKey orderCompoKey){
        orderItemRepository.deleteById(orderCompoKey);
    }
}
