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

import com.petland.register.model.dto.CustomerRequestDto;
import com.petland.register.model.dto.CustomerResponseDto;
import com.petland.register.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public List<CustomerResponseDto> toList() {
        return this.customerService.toList();
    }

    @PostMapping()
    public Integer save(@RequestBody CustomerRequestDto request) {
        return this.customerService.save(request);
    }

    @PutMapping("/{id}")
    public Integer update(@PathVariable ("id") Integer id, @RequestBody CustomerRequestDto request) {
        return this.customerService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") Integer id) {
        this.customerService.delete(id);
    }
}