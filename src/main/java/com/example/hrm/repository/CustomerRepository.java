package com.example.hrm.repository;

import com.example.hrm.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository <Customer,String>{
}
