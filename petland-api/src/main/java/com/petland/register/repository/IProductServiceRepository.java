package com.petland.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.register.model.ProductService;

public interface IProductServiceRepository extends JpaRepository<ProductService, Integer>{

    
}