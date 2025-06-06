package com.petland.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.register.repository.IProductServiceRepository;
import com.petland.register.model.ProductService;;

@RestController
@RequestMapping("/products")
public class ProductServiceController {
    @Autowired
    private IProductServiceRepository productServiceRepository;

    @GetMapping()
    public List<ProductService> toList() {
        return this.productServiceRepository.findAll();
    }

    @PostMapping()
    public Integer save(@RequestBody ProductService request) {
        this.productServiceRepository.save(request);
        return request.getId();
    }

    @PutMapping("/{id}")
    public Integer update(@PathVariable ("id") Integer id, @RequestBody ProductService request) {
        this.productServiceRepository.save(request);
        return request.getId();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") Integer id) {
        this.productServiceRepository.deleteById(id);
    }
}