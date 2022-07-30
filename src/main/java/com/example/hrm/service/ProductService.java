package com.example.hrm.service;

import com.example.hrm.model.Product;
import com.example.hrm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product abe){
        return productRepository.save(abe);
    }

    public List<Product> getProduct(){
        return productRepository.findAll();
    }
    public Optional<Product> findById(Integer proId){
        return productRepository.findById(proId);
    }
    public void deleteMe(Integer proId){
        productRepository.deleteById(proId);
    }
}
