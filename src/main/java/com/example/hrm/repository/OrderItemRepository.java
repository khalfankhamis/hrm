package com.example.hrm.repository;

import com.example.hrm.model.OrderCompoKey;
import com.example.hrm.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderCompoKey> {
}
