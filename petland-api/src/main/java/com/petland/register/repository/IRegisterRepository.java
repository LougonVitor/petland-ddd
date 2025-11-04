package com.petland.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.register.model.entity.CustomerEntity;

public interface IRegisterRepository extends JpaRepository<CustomerEntity, Integer> {
}