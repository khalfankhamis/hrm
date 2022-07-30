package com.example.hrm.controller;

import com.example.hrm.model.Product;
import com.example.hrm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping
    public Product addProduct(@RequestBody Product abe){
        return productService.addProduct(abe);
    }
    @GetMapping
    public List<Product> getProduct(){
        return productService.getProduct();
    }
    @GetMapping("/{proId}")
    public Optional<Product> findById(@PathVariable Integer proId){
        return productService.findById(proId);
    }
    @PutMapping("/{proId}")
    public Product addProduct(@RequestBody Product abe,@PathVariable Integer proId){
        abe.setProId(proId);
        return productService.addProduct(abe);
    }

    @DeleteMapping("/{proId}")
    public void deleteMe(@PathVariable Integer proId){
        productService.deleteMe(proId);
    }





    }

