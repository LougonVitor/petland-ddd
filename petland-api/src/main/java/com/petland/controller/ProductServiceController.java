package com.petland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.petland.repository.IProductServiceRepository;
import com.petland.model.ProductService;;

@RestController
public class ProductServiceController {
    @Autowired
    private IProductServiceRepository productServiceRepository;

    @GetMapping("/products")
    public List<ProductService> toList() {
        return this.productServiceRepository.findAll();
    }

    @PostMapping("/products")
    public Integer record(@RequestBody ProductService request) {
        this.productServiceRepository.save(request);
        return request.getId();
    }
}