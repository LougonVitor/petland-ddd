package com.petland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.ProductService;

public interface IProductServiceRepository extends JpaRepository<ProductService, Integer>{

    
}